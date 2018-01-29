<%@ include file="/init.jsp" %>

<portlet:actionURL name="execSql" var="execSqlURL"></portlet:actionURL>

<aui:form action="<%= execSqlURL %>" name="<portlet:namespace />fm" method="post">
	<aui:fieldset>
		<aui:input name="sql"></aui:input>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>

<%
String output = renderRequest.getParameter("sql-output");
%>

<p>Output:</p>
<pre>
<%= output %>
</pre>