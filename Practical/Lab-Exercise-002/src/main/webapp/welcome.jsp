<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String user = (String) session.getAttribute("user");

if (user == null) {
	response.sendRedirect("login_session.jsp");
}
%>

<html>
<head>
<title>Welcome Page</title>
</head>

<body>

	<h2>
		Welcome
		<%=user%></h2>

	<p>You are successfully logged in.</p>

	<br>

	<a href="logout">Logout</a>

</body>
</html>
