<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Help</title>
	</head>
	<body>
		<%
			String Id = (String) request.getAttribute("Id");
		%>
		<h1>Help page</h1>
		<h3>Help Id <%=Id %></h3>
	</body>
</html>