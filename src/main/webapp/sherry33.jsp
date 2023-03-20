<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>error</h1>
	<%
		out.print(exception);
	%>
	</body>
</html>