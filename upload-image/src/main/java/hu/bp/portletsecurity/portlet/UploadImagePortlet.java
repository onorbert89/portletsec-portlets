package hu.bp.portletsecurity.portlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.image.ImageMagickUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import hu.bp.portletsecurity.constants.UploadImagePortletKeys;

/**
 * @author peter
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=upload-image Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UploadImagePortletKeys.UploadImage,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UploadImagePortlet extends MVCPortlet {
	private final String infoCommand = "identify -verbose";
	private final String exifCommand = "identify -format '%[EXIF:*]'";
	
	private List<String> getCommandList(String command, String arg) {
		List<String> commands = new ArrayList<String>(Arrays.asList((command + " " + arg).split(" ")));
		_log.error("ImageMagic commands:" + String.join(" ", commands));
		return commands;
	}

	private void processFile(ActionRequest request) {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		File file = uploadPortletRequest.getFile("sampleFile");
		if (!file.exists()) {
			_log.error("Empty File");
		}
		if ((file != null) && file.exists()) {
			String fileName = uploadPortletRequest.getFileName("sampleFile");
			String fromFileName = file.getAbsolutePath();
			String toFileName = PortalUtil.getPortalWebDir() + "/html/images/" + file.getName();

			try {
				FileUtil.copyFile(fromFileName, toFileName);
				String[] info = ImageMagickUtil.identify(getCommandList(infoCommand, toFileName));
				storePreferences(setData(request, fileName, file.getName(), String.join("\n", info)));
			} catch (Exception e) {
				_log.error(e.getMessage());
			}
		}
	}

	public void uploadFileAction(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.error("hello from processaction");
		processFile(actionRequest);
	}
	
	private PortletPreferences setData(ActionRequest request,
			String originalFileName, String viewFileName, String info){

		PortletPreferences prefs = request.getPreferences();
		
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
				WebKeys.THEME_DISPLAY);
		String userId = String.valueOf(themeDisplay.getUserId());
		
		_log.error("UserID:" + userId);

		try {
			prefs.setValue(userId + "originalFileName", originalFileName);
			prefs.setValue(userId + "viewFileName", viewFileName);
			prefs.setValue(userId + "info", info);
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

	private static final Log _log = LogFactoryUtil.getLog(UploadImagePortlet.class.getName());
}