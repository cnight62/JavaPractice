package highmark;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8868585730665998748L;
	/**
	 * Get Method
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int k = (int) request.getAttribute("k");
		
		k = k * k;
		
		PrintWriter out = response.getWriter();
		out.println("Result is " + k);
		
	}
	
	

}
