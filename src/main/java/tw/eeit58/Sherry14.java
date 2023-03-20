package tw.eeit58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.sherry.api.Bike;

@WebServlet("/Sherry14")
public class Sherry14 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
			
		Bike b1 = (Bike)request.getAttribute("b1");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("hello, Sherry14<br />");
		out.print("<hr />");
		out.print("I am Sherry14: bike = " + b1.getSpeed());
		out.print("<hr />");
		out.print("copyeight......");
		
	}
	
}
