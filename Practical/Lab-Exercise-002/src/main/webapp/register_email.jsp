<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration</title>
</head>

<body>

	<h2>User Registration</h2>

	<form action="registerEmail" method="post">

		Name: <input type="text" name="name" required> <br>
		<br> Email: <input type="email" name="email" required> <br>
		<br> <input type="submit" value="Register">

	</form>

</body>
</html>
