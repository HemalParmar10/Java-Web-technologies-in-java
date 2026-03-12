<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String username = (String) request.getAttribute("username");
String email = (String) request.getAttribute("email");
%>

<html>
<head>
<title>Registration Step 2</title>
</head>

<body>

	<h2>User Registration - Step 2</h2>

	<form action="register_success.jsp" method="post">

		<input type="hidden" name="username" value="<%=username%>"> <input
			type="hidden" name="email" value="<%=email%>"> Password: <input
			type="password" name="password" required> <br>
		<br> City: <input type="text" name="city" required> <br>
		<br> <input type="submit" value="Register">

	</form>

</body>
</html>
