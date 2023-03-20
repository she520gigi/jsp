<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	String[] var1 = {"Brad","Mei","Rick","Sherry"};
//	pageContext.setAttribute("var1", var1);

	String[] var2 = {"Brad2","Mei2","Rick2","Sherry2"};
//	request.setAttribute("var1", var2);

	String[] var3 = {"Brad3","Mei3","Rick3","Sherry3"};
//	session.setAttribute("var1", var3); //session如果使用了，紀錄會一直在無法覆蓋，除非重開瀏覽器

	String[] var4 = {"Brad4","Mei4","Rick4","Sherry4"};
	application.setAttribute("var1", var4);

%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	var1[0]=${var1[0] };<br />
	var1[0]=${pageScope.var1[0] };<br />
	var1[0]=${requestScope.var1[0] };<br />
	var1[0]=${sessionScope.var1[0] };<br />
	var1[0]=${applicationScope.var1[0] };<br />
	</body>
</html>