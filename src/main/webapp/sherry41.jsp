<%@page import="tw.sherry.api.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	Bike b1 = (Bike)request.getAttribute("b1");
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>sherry41 <%= b1.getSpeed() %></h1>
	</body>
</html>