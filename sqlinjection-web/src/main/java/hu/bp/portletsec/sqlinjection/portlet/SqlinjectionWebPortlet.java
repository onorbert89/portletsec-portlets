package hu.bp.portletsec.sqlinjection.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import hu.bp.portletsec.sqlinjection.backend.SqlExec;
import hu.bp.portletsec.sqlinjection.model.Color;
import hu.bp.portletsec.sqlinjection.service.ColorLocalService;

/**
 * @author peter
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=sqlinjection-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SqlinjectionWebPortlet extends MVCPortlet {
	
	private PortletPreferences incColorCounter(ActionRequest request, String entry){
		PortletPreferences prefs = request.getPreferences();

		String message = ParamUtil.getString(request, "message");

		try {
			prefs.setValue("message", message);
		} catch (ReadOnlyException e) {
			_log.error(e);
		}

		return prefs;
	}

	private void storePreferences(PortletPreferences prefs) {
		try {
			prefs.store();
		} catch (ValidatorException | IOException e) {
			_log.error(e);
		}
	}
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		String userColorName = ParamUtil.getString(renderRequest, "colorName");
		String userColorCode = "";
		StringBuilder log = new StringBuilder("no error");
		StringBuilder sqlLog = new StringBuilder("No sql");
		
		if (Validator.isNotNull(userColorName)) {
			String sql = "select colorCode from COLOR_Color where colorName='" + userColorName + "'";
			sqlLog.setLength(0);
			sqlLog.append(sql);
			List<String> output = SqlExec.executeSql(sql, log);
			
			if (!output.isEmpty()) {
				userColorCode = output.get(0);
			}
		}
		
		List<Color> colors = _colorLocalService.getAllColors();
		
		List<String> colorNames = new ArrayList<String>();
		
		for (Color color: colors) {
			colorNames.add(color.getColorName());
		}
		
		renderRequest.setAttribute("colorNames", colorNames);
		renderRequest.setAttribute("userColorName", userColorName);
		renderRequest.setAttribute("userColorCode", userColorCode);
		renderRequest.setAttribute("log", log);
		renderRequest.setAttribute("sql", sqlLog);
		
		super.doView(renderRequest, renderResponse);
	}
	
	public void doViewGood(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		String userColorName = ParamUtil.getString(renderRequest, "colorName");
		
		List<Color> colors = _colorLocalService.getAllColors();
		
		List<String> colorNames = new ArrayList<String>();
		Color userColor = null;
		
		for (Color color: colors) {
			colorNames.add(color.getColorName());
			if (color.getColorName().equals(userColorName)) {
				userColor = color;
			}
		}
		
		renderRequest.setAttribute("colorNames", colorNames);
		renderRequest.setAttribute("userColorName", userColor != null ? userColor.getColorName() : "");
		renderRequest.setAttribute("userColorCode", userColor != null ? userColor.getColorCode() : "");
		renderRequest.setAttribute("log", new StringBuilder("used Liferay services"));
		renderRequest.setAttribute("sql", new StringBuilder("Who knows? used Liferay services"));

		super.doView(renderRequest, renderResponse);
	}
	

    @Reference(unbind = "-")
    protected void setColorService(ColorLocalService colorLocalService) {
        _colorLocalService = colorLocalService;
    }
    
    private static final Log _log = LogFactoryUtil.getLog(SqlinjectionWebPortlet.class.getName());
	
	private ColorLocalService _colorLocalService;
}