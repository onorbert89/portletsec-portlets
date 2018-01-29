<%@ include file="/init.jsp" %>

<% 
if (true) {
	response.addHeader("location", "/login.jsp");
}
%>
<p>
	<b>Info only for logged-in users</b>
</p>
