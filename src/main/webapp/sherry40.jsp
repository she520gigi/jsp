<%@page import="tw.sherry.api.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	Bike b1 = new Bike();
	b1.upSpeed(); b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
	
	request.setAttribute("b1", b1);
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>sherry40</h1>
		<jsp:forward page="sherry41.jsp"></jsp:forward>
	</body>
</html>