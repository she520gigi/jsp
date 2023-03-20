package tw.eeit58;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.sherry.api.Sherry17;

@WebServlet("/Sherry16")
public class Sherry16 extends HttpServlet {
	private ServletRequest request;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 接收參數
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		String view = request.getParameter("view");
		
		// 2. 演算法 Sherry17
		if (x != null && y != null) {
			try {
				Sherry17 model = new Sherry17(x, y, op);
				double result = model.calc();
				request.setAttribute("result", x);
				request.setAttribute("result", y);
				
				request.setAttribute("op1", op.equals("1")?"selected":"");
				request.setAttribute("op2", op.equals("2")?"selected":"");
				request.setAttribute("op3", op.equals("3")?"selected":"");
				request.setAttribute("op4", op.equals("4")?"selected":"");
				
				request.setAttribute("result", result + "");
				request.setAttribute(view, view != null?view:"view1");
	
			}catch(Exception e) {
				request.setAttribute("x", "");
				request.setAttribute("y", "");
				request.setAttribute("op1", "");
				request.setAttribute("op2", "");
				request.setAttribute("op3", "");
				request.setAttribute("op4", "");
				
				request.setAttribute("result", "");
				request.setAttribute(view, "view1");
				System.out.println(e.toString());
			}
			}else {
				request.setAttribute("x", "");
				request.setAttribute("y", "");
				request.setAttribute("result", "");
				request.setAttribute(view, "view1");
				
			}
		
		
			// 3. 呈現 View
			RequestDispatcher dispatcher = request.getRequestDispatcher("Sherry18");
			dispatcher.forward (request, response);
			}
}
