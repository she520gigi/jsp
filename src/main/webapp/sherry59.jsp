<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String[] names = {"Brad", "Anna", "Sana", "Rick", "Sherry"};
	pageContext.setAttribute("names", names);
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
		<table border="1" width="100%">
			<tr>
				<th>Index</th>
				<th>Name</th>
				<th>Count</th>				
				<th>First</th>				
				<th>Last</th>				
			</tr>
			<c:forEach items="${names }" var="name" varStatus="status"> <!-- varStatus為每次尋訪的狀態 -->
				<tr>
					<td>${status.index }</td>
					<td>${name }</td>
					<td>${status.count }</td>
					<td>${status.first }</td>
					<td>${status.last }</td>
					
				</tr>
			</c:forEach>
		</table>
	
	</body>
</html>