package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showEnterprise")
public class ShowEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer idToShow = Integer.parseInt( request.getParameter("id") );
		Enterprise enterprise = Database.findBy(idToShow);
		
		request.setAttribute("enterprise", enterprise);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showEnterprise.jsp");
		dispatcher.forward(request, response);
		
	}

}
