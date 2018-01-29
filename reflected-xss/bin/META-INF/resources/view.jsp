<%@ include file="/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<%
String param1 = ParamUtil.getString(request, "param1");
%>

<p> Use Chrome browser on port 8080</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="task 1">
	
		<portlet:renderURL var="param1URL">
		    <portlet:param name="param1" value="hello"></portlet:param>
		</portlet:renderURL>
		
		<p>
			Check <a href="<%= param1URL %>">this</a> url and try to display 
			an alert box in this browser window.
			Use the <%= HtmlUtil.escape("<script>alert(1)</script>") %> code.
		</p>
		
		<p>
			If it does not work, press F12 and check the console and go to
			the next section.
		</p>
	
	</liferay-ui:panel>
	
	<p>param1:<%= param1 %></p>
	
	<liferay-ui:panel collapsible="true" state="closed" title="hint for Chrome and XSS Auditor (optional)">
		<p>
		You may be successful disable chrome XSS auditor:<br>
			Start chrome with --disable-web-security --user-data-dir=/var/tmp/pc<br>
			In ubuntu linux:mkdir /var/tmp/pc; google-chrome --disable-web-security --user-data-dir=/var/tmp/pc<br>
		</p>	
	</liferay-ui:panel>

	<liferay-ui:panel collapsible="true" state="closed" title="How to move on">
		<p>
			I could not do it, so I set Liferay not to send X-XSS-Protection header. With this, I could use Chrome
			to inject XSS, However, from now on, please use Firefox, it does not have xss filter. 
		</p>
	</liferay-ui:panel>
</liferay-ui:panel-container>



<%
String param2 = ParamUtil.getString(request, "param2");
param2 = param2.replaceAll("(?i)<(/?script[^>]*)>", "");
%>

<p> Use Firefox</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="task 2">
	
		<portlet:renderURL var="param2URL">
		    <portlet:param name="param2" value="hello"></portlet:param>
		</portlet:renderURL>
		
		<p>
			I deleted the <%= HtmlUtil.escape("<script>") %> tag from the input with a regexp,
			so you should be cleverer.<br>
			Your task is the same, however, with <a href="<%= param2URL %>">this</a> url.
			If you stuck, go to the next task.
		</p>
	</liferay-ui:panel>
	
	<p>param2:<%= param2 %></p>
	
	<liferay-ui:panel collapsible="true" state="closed" title="hint for task 2">
		<p>
		Here is the code which try filter the input parameter:
<pre>
String param2 = ParamUtil.getString(request, "param2");
param2 = param2.replaceAll("(?i)<(/?script[^>]*)>", "");
</pre>
		Now you know the code, try to bypass it!
		</p>	
	</liferay-ui:panel>

	<liferay-ui:panel collapsible="true" state="closed" title="hint for task 2">
		<p>
		Make a script tag with to overlapped script tag! My regexp will delete only the inner one...</p>
	</liferay-ui:panel>

</liferay-ui:panel-container>


<%
String param3 = ParamUtil.getString(request, "param3");
%>

<p> Use Firefox</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="1">
	
		<portlet:renderURL var="param3URL">
		    <portlet:param name="param3" value="hello"></portlet:param>
		</portlet:renderURL>
		
		<p>
			Now I used <%= HtmlUtil.escape("HtmlUtil.escape(param3)") %> when display param3.
			Your task is the same, use <a href="<%= param3URL %>">this</a> url.
			<b>I do not think, that it is possible!</b>
		</p>
	</liferay-ui:panel>
	
	<p>param3:<%= HtmlUtil.escape(param3) %></p>
	
</liferay-ui:panel-container>


<%
String param4 = ParamUtil.getString(request, "param4");
%>

<h5>Let's do something useful!</h5>
<p>(not ready yet)</p>
<p> Use Firefox</p>

<p>
Hello Dear user <%= param4 %>! Download this <a href="http://localhost:8080/goodfile">file</a>!
</p>

<p>Your task is to rewrite the file link to another location with an xss injection.</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="1">
		Not ready yet.	
	</liferay-ui:panel>
</liferay-ui:panel-container>