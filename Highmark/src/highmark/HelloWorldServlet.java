package highmark;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4734290923811779117L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//empty method
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		//Session Management
		request.setAttribute("k", k);
		
		response.getWriter().println(k);
		//Request dispatcher and redirect
		RequestDispatcher rd = request.getRequestDispatcher("sq");
		rd.forward(request, response);
	}
	
}
