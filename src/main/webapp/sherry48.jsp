<%@page import="tw.sherry.api.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	Member member2 = new Member(1,"bbb","ccc","2222-01-33");
	request.setAttribute("member2", member2);
%>    
<jsp:useBean id="member" class="tw.sherry.api.Member"></jsp:useBean>
<jsp:setProperty property="id" name="member" value="${param.id }"/>
<jsp:setProperty property="account" name="member" value="${param.account }"/>
<jsp:setProperty property="realname" name="member" value="${param.realname }"/>

<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Member:
		<jsp:getProperty property="id" name="member"/>
		<jsp:getProperty property="account" name="member"/>
		<jsp:getProperty property="realname" name="member"/>
		<hr />
		Member2:
		${member2.id } | ${member2.account } | ${member2.realname } <!-- 同16~18列 -->
		<hr />
		<jsp:declaration>
			Integer a;
			String b;
		</jsp:declaration>
		<jsp:scriptlet>
		a=10; b="Sherry";
		<jsp:scriptlet />
		a = <jsp:expression>a<jsp:expression/>
		b = <jsp:expression>b<jsp:expression/>
	</body>
</html>