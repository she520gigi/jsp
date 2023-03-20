<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- pageContext.setAttritube("x", 10) -->
<c:set var="x" value="10"></c:set>

<!-- request.setAttritube("x", 12) -->
<c:set var="x" value="12" scope="request" />
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	 	x = ${x }<br />
	 	x = ${requestScope.x }<br />
	 	<%= "Hello, World" %><br />
	 	<c:out value="Hello World" /><br />
	 	x = <c:out value="${x }" /><br />
	 	i = <c:out value="${param.i }" default="no value" />
	 	
	 	<jsp:useBean id="member" class="tw.sherry.api.Member"></jsp:useBean>
	 	<c:set target="${member }" property="id">123</c:set>
	 	<c:set target="${member }" property="account">Hebe</c:set>
	 	<c:set target="${member }" property="realname">Hebe_2</c:set>
	 	<c:set target="${member }" property="birthday">1988-05-40</c:set>
	 	
	 	${member }<br />
	 	<c:remove var="member"/>
	 	${member }<br />
	</body>
</html>