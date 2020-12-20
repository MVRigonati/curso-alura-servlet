package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newEnterprise")
public class NewEnterpriseServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String enterpriseName = request.getParameter("name");
		System.out.println("Inserting new enterprise with name " + enterpriseName);
		
		Database.add(new Enterprise(enterpriseName));
		
		request.setAttribute("enterpriseName", enterpriseName);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/newEnterpriseCreated.jsp");
		dispatcher.forward(request, response);
	}
	
	

}
