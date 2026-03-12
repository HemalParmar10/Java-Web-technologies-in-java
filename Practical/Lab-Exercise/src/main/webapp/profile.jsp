<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="Assignment.model.User"%>

<%
User user = (User) session.getAttribute("user");

if (user == null) {
	response.sendRedirect("login.jsp");
}
%>
<html>
<head>
<meta charset="UTF-8">
<title>profile</title>
</head>
<body>
	<h2>
		Welcome
		<%=user.getUsername()%></h2>

	Email:
	<%=user.getEmail()%>

	<br>
	<br>

	<a href="updateUser?id=<%=user.getId()%>">Update Profile</a>

	<br>
	<br>

	<a href="deleteUser?id=<%=user.getId()%>">Delete Account</a>

</body>
</html>