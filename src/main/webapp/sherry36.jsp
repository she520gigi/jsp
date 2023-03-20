<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	int lottery1 = (int)(Math.random()*49+1);
	int lottery2 = (int)(Math.random()*49+1);
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
		<%@ include file="sherry37.jsp" %> <!-- 要的是檔案，不能直接帶入值file="sherry37.jsp?x=10" --> 
		<hr />
		<jsp:include page="sherry38.jsp?x=10"></jsp:include> <!-- 報錯是因為日蝕不支援，所以除錯，但TomCat支援 -->
		
		<jsp:include page="sherry38.jsp">
			<jsp:param value="lottery1" name="y"/> <!-- 跟第14同樣的 -->
			<jsp:param value="lottery2" name="z"/> <!-- 跟第14同樣的 -->
		</jsp:include> 
		
		<hr />
	
	</body>
</html>