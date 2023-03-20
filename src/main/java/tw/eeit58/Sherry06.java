package tw.eeit58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sherry06")
public class Sherry06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		System.out.println("x = "+ x + "; y = " + y);
		
		String r = ""; //預設值為空字串 所以會等於result+空白字串
//		String i = "";
//		String j = "";
		try {
		int intX = Integer.parseInt(x);
		int intY = Integer.parseInt(y);
		
		int result = 0; int mod = 0;
		switch(op) {
		case "1":
			result = intX + intY;
			r = result + "";
			break;
		case "2":
			result = intX - intY;
			r = result + "";
			break;
		case "3":
			result = intX * intY;
			r = result + "";
			break;
		case "4":
			result = intX / intY;
			mod = intX % intY;
			r = result + "....." + mod;
			break;
		}
//		int result = intX + intY;
//		r = result + "";
//		i = intX + "";
//		j = intY + "";
		}catch(Exception e) {
			System.out.println("ERR:" + e.toString());
			x = y = "";
		}
		
		//----------------------
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.append("<form action=\'Sherry06\'>\n")
//		.append("<input name='x' value='"+i+"' />\n")
		.append(String.format("<input name='x' value='%s' />\n", x))
		.append("<select name='op'\n>")
		.append("<option value='1' " + (op.equals("1")?"selected":"") + " >+</option>\n")
		.append("<option value='2' " + (op.equals("2")?"selected":"") + ">-</option>\n")
		.append("<option value='3' " + (op.equals("3")?"selected":"") + ">x</option>\n")
		.append("<option value='4' " + (op.equals("4")?"selected":"") + ">/</option>\n")
		.append("</select>\n")
//		.append("<input name='y' value='"+j+"' />\n")
		.append(String.format("<input name='y' value='%s' />\n", y))
		.append("<input type='submit' value='='/>\n")
		.append(r);
	}

}
