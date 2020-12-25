package br.com.alura.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeEnterprise")
public class RemoveEnterpriseServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer idToRemove = Integer.parseInt( request.getParameter("id") );
		Database.removeBy(idToRemove);
		
		response.sendRedirect("listEnterprises");
	}

}
