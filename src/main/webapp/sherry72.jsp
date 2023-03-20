<%@ page language="java" contentType="text/html; charset=utf=8"
    pageEncoding="utf-8"%>
<% 
	if(request.getMethod().equals("POST")){
		String max = request.getParameter("max");
			if (max != null) {
				try{
				int intMax = Integer.parseInt(max);
				out.println("sherry72:" + (int)(Math.random()*intMax));
				}catch(Exception e){
					//out.println(e.toString());
			}
		}
	}
%>
