package tw.eeit58;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sherry19")
public class Sherry19 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int w = 400, h =20;
		double rate = Double.parseDouble(request.getParameter("rate"));
		
		response.setContentType("image/jpeg");
		
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(0, 0, w, h);
		g2d.setColor(Color.red);
		g2d.fillRect(0, 0, (int)(400*rate/100.0), h);
		
		OutputStream outStream = response.getOutputStream();
		ImageIO.write(img, "jpeg", outStream);
		
		response.flushBuffer();
	}
}
