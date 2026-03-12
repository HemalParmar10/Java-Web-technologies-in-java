<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="Assignment.model.User"%>

<%
User user = (User) request.getAttribute("user");
%>

<html>
<head>
<title>update page</title>
</head>
<body>

	<h2>Update Profile</h2>

	<form action="updateUser" method="post">

		<input type="hidden" name="id" value="<%=user.getId()%>">

		Username: <input type="text" name="username"
			value="<%=user.getUsername()%>"><br> <br> Email: <input
			type="text" name="email" value="<%=user.getEmail()%>"><br>
		<br> Password: <input type="password" name="password"
			value="<%=user.getPassword()%>"><br> <br> <input
			type="submit" value="Update">

	</form>

</body>
</html>
