<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%@ page  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
	<html>
		<sql:setDataSource
			driver="com.mysql.cj.jdbc.Driver"
			url="jdbc:mysql://localhost/iii"
			user="root"
			password="root"
		/>
		<c:if test="${!empty param.editid }"></c:if>
		<sql:query var="rs">
			SELECT * FROM member WHERE id = ?
			<sql:param>${param.editid }</sql:param>
		</sql:query>
		
		<c:if test="">
		<sql:update>
			UPDATE member SET account=?, realname=?, birthday=? WHERE id=?
			<sql:param>${param.account }</sql:param>
			<sql:param>${param.realname }</sql:param>
			<sql:param>${param.birthday }</sql:param>
			<sql:param>${param.updateid }</sql:param>
		</sql:update>
		<c:redirect url="sherry62.jsp"></c:redirect>
		</c:if>
	
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="post"></form>
			<input type="hidden" name="updateid" value="${rs.rows[0].id }">
			Account:<input type="text" name="account" value="${rs.rows[0].account }"/><br />
			Realname:<input type="text" name="realname" value="${rs.rows[0].realname }"/><br />
			Birthday:<input type="date" name="birthday" value="${rs.rows[0].birthday }"/><br />
			<input type="submit" value="Add" />
	</body>
</html>