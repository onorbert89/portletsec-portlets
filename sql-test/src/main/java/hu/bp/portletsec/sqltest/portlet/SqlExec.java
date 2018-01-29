package hu.bp.portletsec.sqltest.portlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.dao.jdbc.DataAccess;

public class SqlExec {
	public static List<String> executeSql(ActionRequest request, String sql) {
		List<String> output = new ArrayList<String>();
		
		try {
			List<List<Object>> rows  = _execQuery(sql, 50);
			for (List<Object> row: rows) {
				String line = row.stream().map(v -> (v == null) ? "": v.toString()).collect(Collectors.joining(","));
				output.add(line);
			}
		} catch (SQLException e) {
			output.add(e.getMessage());
		}
		
		return output;
	}
	
	private static List<List<Object>> _execQuery(
			String sqlQuery, int maxRows)
			throws SQLException {
		//https://github.com/slemarchand/portal-scripting-sql/blob/master/portal-scripting-sql/src/main/java/com/slemarchand/portal/scripting/sql/internal/SQLExecutor.java

			List<List<Object>> rows = null;

			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;

			try {
				con = DataAccess.getConnection();
				
				con.setAutoCommit(false); // Prevent data updates
				
				stmt = con.createStatement();
				stmt.setMaxRows(maxRows);
				rs = stmt.executeQuery(sqlQuery);

				ResultSetMetaData md = rs.getMetaData();
				int cc = md.getColumnCount();

				rows = new ArrayList<List<Object>>(cc);

				while (rs.next()) {
					List<Object> row = new ArrayList<Object>(cc);
					for (int c = 1; c <= cc; c++) {
						Object value = rs.getObject(c);
						row.add(value);
					}
					rows.add(row);
				}

			}
			finally {
				DataAccess.cleanUp(con, stmt, rs);
			}

			return rows;
		}

}
