package tw.eeit58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sherry11")
public class Sherry11 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Sherry11?a=100&b=33");
		//-----
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("hello<br />");
		out.print("<hr />");
		
		dispatcher.include(request, response);
		
		out.print("<hr />");

		out.print("copyeight......");
		
	}
}
