<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	String x = (String)request.getAttribute("x");
	String y = (String)request.getAttribute("y");
	String r = (String)request.getAttribute("r");
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Sherry Big CompanyV2</h1>
		<form action='Sherry42.jsp'>
			<input name='x'/>
			+
			<input name='y'/>
			<input type='submit' value='='/>
			
		</form>
	</body>
</html>