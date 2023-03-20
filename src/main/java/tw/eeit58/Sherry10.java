package tw.eeit58;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sherry10")
public class Sherry10 extends HttpServlet {
    public Sherry10() {
    	System.out.println("Sherry10()");
    }
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	System.out.println("Sherry10:service1");
    	super.service(req, res);
    	System.out.println("Sherry10:service2");
	}

	@Override
	public void init() throws ServletException {
		super.init();
    	System.out.println("Sherry10:init(config)");

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}


}
