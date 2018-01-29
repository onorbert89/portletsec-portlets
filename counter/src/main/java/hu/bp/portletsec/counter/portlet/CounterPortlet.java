package hu.bp.portletsec.counter.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import hu.bp.portletsec.counter.constants.CounterPortletKeys;

/**
 * @author peter
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=counter Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CounterPortletKeys.Counter,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CounterPortlet extends MVCPortlet {
	public void increment(ActionRequest request, ActionResponse response) {
		storePreferences(incCounter(request));
		hideDefaultSuccessMessage(request);
	}

	private PortletPreferences incCounter(ActionRequest request){
		PortletPreferences prefs = request.getPreferences();
		
		int counterValue = Integer.parseInt(prefs.getValue("counter", "0"));
		counterValue++;
		
		try {
			prefs.setValue("counter", "" + counterValue);
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

	private static final Log _log = LogFactoryUtil.getLog(CounterPortlet.class.getName());
}