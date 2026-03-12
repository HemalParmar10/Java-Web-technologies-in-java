<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String user = request.getParameter("user");
%>

<html>
<head>
<title>Welcome Page</title>
</head>

<body>

	<h2>
		Welcome
		<%=user%></h2>

	<p>Session maintained using URL Rewriting.</p>

	<a href="login_rewrite.jsp">Logout</a>

</body>
</html>
