package tw.eeit58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.sherry.api.SherryUtils;

@WebServlet("/Sherry18")
public class Sherry18 extends HttpServlet {
	private String view = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String x = request.getParameter("x");
		String y = request.getParameter("y");

		String op1 = (String)request.getAttribute("op1");
		String op2 = (String)request.getAttribute("op2");
		String op3 = (String)request.getAttribute("op3");
		String op4 = (String)request.getAttribute("op4");
		
		String result = request.getParameter("result");
		String v = (String)request.getAttribute("view");
		
		if (v != null) {
			view = v;
		}else if ( view == null){
			view = "view1";
		}
		//---------------
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String content = SherryUtils.loadView(view);
			out.printf(content, x, y);
		}catch (Exception e) {
			out.print("ERROR1");
		}
		
		
		response.flushBuffer();
	}

}