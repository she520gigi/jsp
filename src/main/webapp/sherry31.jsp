<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	if (name == null){
		name = "HelloWorld";
	}
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Sherry Big Company</h1>
		<hr />
		Hello, <%= name %>
	</body>
</html> 