<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String username = request.getParameter("username");
String email = request.getParameter("email");
String password = request.getParameter("password");
String city = request.getParameter("city");
%>

<html>
<head>
<title>Registration Successful</title>
</head>

<body>

	<h2>Registration Successful</h2>

	<p>
		Username:
		<%=username%></p>
	<p>
		Email:
		<%=email%></p>
	<p>
		Password:
		<%=password%></p>
	<p>
		City:
		<%=city%></p>

</body>
</html>
