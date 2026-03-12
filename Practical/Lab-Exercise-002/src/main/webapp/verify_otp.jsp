<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>OTP Verification</title>
</head>

<body>

	<h2>Enter OTP</h2>

	<form action="verifyOtp" method="post">

		Enter OTP: <input type="text" name="userOtp" required> <br>
		<br> <input type="submit" value="Verify OTP">

	</form>

</body>
</html>
