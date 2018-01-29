<%@ include file="/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<%
String param1 = ParamUtil.getString(request, "param1");
%>

<p> Use Chrome browser on port 8080</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="1">
	
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
	
	<liferay-ui:panel collapsible="true" state="closed" title="2">
		<p>
		You may be successful disable chrome XSS auditor:<br>
			Start chrome with --disable-web-security --user-data-dir=/var/tmp/pc<br>
			In ubuntu linux:mkdir /var/tmp/pc; google-chrome --disable-web-security --user-data-dir=/var/tmp/pc<br>
		</p>	
	</liferay-ui:panel>

	<liferay-ui:panel collapsible="true" state="closed" title="3">
		<p>
			I could not do it, so I set Liferay not to send X-XSS-Protection header. Try again on port 9090. 
		</p>
	</liferay-ui:panel>

	<liferay-ui:panel collapsible="true" state="closed" title="4">
		<p>
			You can use Firefox because it does not have xss filter. Try it!
		</p>
	</liferay-ui:panel>

</liferay-ui:panel-container>



<%
String param2 = ParamUtil.getString(request, "param2");
param2 = param2.replaceAll("(?i)<(/?script[^>]*)>", "");
%>

<p> Use Firefox or Chrome on port 9090.</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="1">
	
		<portlet:renderURL var="param2URL">
		    <portlet:param name="param2" value="hello"></portlet:param>
		</portlet:renderURL>
		
		<p>
			I replaced the <%= HtmlUtil.escape("<script>") %> tag with a regexp, so you should be cleverer.
			Your task is the same, however, with <a href="<%= param2URL %>">this</a> url.
			If you stuck, got to the next task.
		</p>
	</liferay-ui:panel>
	
	<p>param2:<%= param2 %></p>
	
	<liferay-ui:panel collapsible="true" state="closed" title="2">
		<p>
		Here is the code which try filter the input parameter:
<pre>
String param2 = ParamUtil.getString(request, "param2");
param2 = param2.replaceAll("(?i)<(/?script[^>]*)>", "");
</pre>
		Now you know the code, try to bypass it!
		</p>	
	</liferay-ui:panel>

</liferay-ui:panel-container>


<%
String param3 = ParamUtil.getString(request, "param3");
%>

<p> Use Firefox or Chrome on port 9090.</p>

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

<h1>Let's do something useful! (not ready yet)</h1>
<p> Use Firefox or Chrome on port 9090.</p>

<p>
Hello Dear user <%= param4 %>! Download this <a href="http://localhost:8080/goodfile">file</a>!
</p>

<p>Your task is to rewrite the file link to another location with an xss injection.</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="1">
		Not ready yet.	
	</liferay-ui:panel>
</liferay-ui:panel-container>