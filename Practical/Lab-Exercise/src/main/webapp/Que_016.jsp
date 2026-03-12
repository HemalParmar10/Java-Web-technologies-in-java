<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Example</title>
</head>
<body>

	<h2>JSTL Iteration Example</h2>

	<!-- Using JSTL to iterate list -->
	<ul>
		<c:forEach var="item" items="${subjectList}">
			<li>${item}</li>
		</c:forEach>
	</ul>

	<hr>

	<h2>Scriptlet Example</h2>

	<%
	out.println("Current Date & Time: " + new java.util.Date());
	%>

	<hr>

	<h2>Implicit Objects Example</h2>

	<p>Request Method: ${pageContext.request.method}</p>
	<p>Context Path: ${pageContext.request.contextPath}</p>
	<p>
		Session ID:
		<%=session.getId()%></p>

</body>
</html>
