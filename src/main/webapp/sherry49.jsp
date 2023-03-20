<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.sherry.api.*" %>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Math.random() => <%= Math.random() %><br />
		Math.random() => ${ Math.random() }<br />
		${SherryUtils.sayYa() }<br />
		${SherryUtils.sayYa(param.name) }<br />
		
		${ (int)10+3=13 }
	</body>
</html>