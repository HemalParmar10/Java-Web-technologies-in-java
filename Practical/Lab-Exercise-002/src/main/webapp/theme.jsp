<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Select Theme</title>
</head>

<body>

	<h2>Select Website Theme</h2>

	<form action="setTheme" method="post">

		<select name="theme">
			<option value="light">Light Theme</option>
			<option value="dark">Dark Theme</option>
		</select> <br>
		<br> <input type="submit" value="Save Preference">

	</form>

</body>
</html>
