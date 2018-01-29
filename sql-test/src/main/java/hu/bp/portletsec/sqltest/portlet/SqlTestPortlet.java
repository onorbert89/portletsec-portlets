package hu.bp.portletsec.sqltest.portlet;

import java.util.List;
import java.util.stream.Collectors;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import hu.bp.portletsec.sqltest.constants.SqlTestPortletKeys;

/**
 * @author peter
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=sql-test Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SqlTestPortletKeys.SqlTest,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SqlTestPortlet extends MVCPortlet {
	public void execSql(ActionRequest request, ActionResponse response) {
		_storeOutput(response, SqlExec.executeSql(request, ParamUtil.getString(request, "sql")));
	}

	private void _storeOutput(ActionResponse response, List<String> rows) {
		String allRows = rows.stream().collect(Collectors.joining("\n"));
		response.setRenderParameter("sql-output", allRows);
	}

}