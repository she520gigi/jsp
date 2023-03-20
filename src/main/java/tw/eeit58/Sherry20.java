package tw.eeit58;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sherry20")
public class Sherry20 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		
		String src = "C:\\JavaClass\\eclipse-workspace\\JavaClass\\dir2\\spyxfamily.jpg";
		
		BufferedImage bimg = ImageIO.read(new File(src));
		
		Graphics2D g2d = bimg.createGraphics();
		g2d.setColor(Color.black);
		
		Font font = new Font(null, Font.BOLD + Font.ITALIC, 500);
		AffineTransform tran = new AffineTransform();
//		tran.scale(140, 20);
		tran.rotate(Math.toRadians(20));
		Font font2 = font.deriveFont(tran);
		
		g2d.setFont(font2);
		
		g2d.drawString("Hello, World", 500, 80);
		
		
		OutputStream outStream = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", outStream);
		
		FileOutputStream fout = new FileOutputStream("C:C:\\JavaClass\\eclipse-workspace\\Web58\\src\\main\\webapp\\upload\\spyxfamily.jpg");
		ImageIO.write(bimg, "jpeg", fout);
		fout.flush();
		fout.close();
		
		response.flushBuffer();
	}
}
