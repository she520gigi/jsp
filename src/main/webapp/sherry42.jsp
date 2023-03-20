<%@ page import="tw.sherry.api.Sherry17" %>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>
<%
	String view = "sherry43";
	String viewer = String.format("%s.jsp", view);
	
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	
	if(x != null && y != null){
			
		Sherry17 sherry17 = new Sherry17(x, y);
		int r = sherry17.plus();
		request.setAttribute("x", x);
		request.setAttribute("y", y);
		request.setAttribute("r", r + "");

	}else{
		request.setAttribute("x", "");
		request.setAttribute("y", "");
		request.setAttribute("r", "");
	}
%>
<jsp:forward page="<%= viewer %>"></jsp:forward>