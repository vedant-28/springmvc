<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1" 
		 pageEncoding="ISO-8859-1" 
		 isELIgnored="false"
%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Help</title>
	</head>
	<body>
		<%
			/* String Id = (String) request.getAttribute("Id"); */
		%>
		<h1>Help page</h1>
		<h3>Help Id ${Id }</h3>
		<hr>
		<c:forEach var="item" items="${marks }">
			<h3>${item }</h3>
		</c:forEach>
	</body>
</html>