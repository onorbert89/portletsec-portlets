<%@ include file="/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
String paramValue = ParamUtil.getString(request, "fileName");
%>

<portlet:renderURL var="pageaURL">
    <portlet:param name="mvcPath" value="/page_a.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="pagebURL">
    <portlet:param name="mvcPath" value="/page_b.jsp"></portlet:param>
</portlet:renderURL>
<a href>

<a href="<%= pageaURL %>">Click to page A!</a>
<a href="<%= pagebURL %>">Click to page B!</a>

<p> Use Firefox or Chrome on port 9090.</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="include trick">
		<p>Check the form above and try to display the page <b>secret.jsp</b></p>
	</liferay-ui:panel>
</liferay-ui:panel-container>