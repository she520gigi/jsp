package tw.eeit58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sherry02")
public class Sherry02 extends HttpServlet {
	private int i;
	public Sherry02() {
		System.out.println("Sherry02()");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw = pw.append("ok");
		pw = pw.append("ok2");
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());   // =21~23行
		
		System.out.println("Sherry02:doGet" + i++);
	}
}
