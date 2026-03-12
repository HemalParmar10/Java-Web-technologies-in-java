<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String theme = "light"; // default theme

Cookie cookies[] = request.getCookies();

if (cookies != null) {

	for (Cookie c : cookies) {

		if (c.getName().equals("themePreference")) {
	theme = c.getValue();
		}

	}
}
%>

<html>

<head>
<title>Home Page</title>
</head>

<body
	style="background-color:<%=theme.equals("dark") ? "black" : "white"%>;
             color:<%=theme.equals("dark") ? "white" : "black"%>">

	<h2>Welcome to the Website</h2>

	<p>
		Your selected theme is:
		<%=theme%></p>

	<a href="theme.jsp">Change Theme</a>

</body>
</html>
