<%@ include file="/init.jsp" %>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm" method="post">
	<aui:fieldset>
		<aui:input name="message"></aui:input>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>

<%
String userId = String.valueOf(themeDisplay.getUserId());
String message = portletPreferences.getValue(userId + "message", "No message");
%>

<p>
	<b>Message:<%= message %></b>
</p>

<p> Use Firefox or Chrome on port 9090.</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="1">
		<p>It's easy. Modify the request in order to store your javascript code and every page refresh
		displays an alert.</p>
	</liferay-ui:panel>
</liferay-ui:panel-container>