<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Upload Image</title>
</head>

<body>

	<h2>Upload Image</h2>

	<form action="uploadImage" method="post" enctype="multipart/form-data">

		Select Image: <input type="file" name="image"> <br>
		<br> <input type="submit" value="Upload">

	</form>

	<br>

	<a href="listImages">View Uploaded Images</a>

</body>
</html>
