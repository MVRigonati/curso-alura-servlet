package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This configuration can be made using java annotations or via web.xml file.
 * This class is configured via web.xml file for example, but the equivalent annotation is written below.
 * 
 * @WebServlet(urlPatterns = "/hi")
 */
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("<html><body>Hello World!</body></html>");
		System.out.println("Server Console.");
	}	
	
}
