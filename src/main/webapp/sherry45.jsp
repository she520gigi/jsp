<%@page import="tw.sherry.api.*"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	Member member1 = new Member(1, "sherry","Sherry", "1999-01-11");
%>
<jsp:useBean id="member2" class="tw.sherry.api.Member"></jsp:useBean>
<jsp:setProperty property="id" name="member2" value="2"/>
<jsp:setProperty property="account" name="member2" value="Anny_2"/>
<jsp:setProperty property="realname" name="member2" value="Anny"/>
<jsp:setProperty property="birthday" name="member2" value="2003-02-22"/>

<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Member1:
		<%= member1.getId() %> | <%= member1.getAccount() %> |
		<%= member1.getRealname() %> | <%= member1.getBirthday() %>
		<hr />
		Member2:
		<%= member2.getId() %> | <%= member2.getAccount() %> |
		<%= member2.getRealname() %> | <%= member2.getBirthday() %>
		<hr />
		Member2:
		<jsp:getProperty property="id" name="member2"/>
		<jsp:getProperty property="account" name="member2"/>
		<jsp:getProperty property="realname" name="member2"/>
		<jsp:getProperty property="birthday" name="member2"/>
		<hr />
		Member2:
		<jsp:getProperty property="id" name="member1"/>
		<jsp:getProperty property="account" name="member1"/>
		<jsp:getProperty property="realname" name="member1"/>
		<jsp:getProperty property="birthday" name="member1"/>
		
	</body>
</html>