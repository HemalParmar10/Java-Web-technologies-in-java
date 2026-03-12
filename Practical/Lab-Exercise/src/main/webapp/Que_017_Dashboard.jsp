<%@ page import="javax.servlet.http.*,javax.servlet.*"%>

<%
String user = (String) session.getAttribute("user");

if (user == null) {
	response.sendRedirect("Que_017_Login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>

	<h2>
		Welcome
		<%=user%></h2>

	<p>Login Successful using Session Tracking.</p>

	<a href="Que_017_Logout">Logout</a>

</body>
</html>
