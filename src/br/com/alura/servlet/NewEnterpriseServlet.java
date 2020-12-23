package br.com.alura.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		String openDateParam = request.getParameter("openDate");
		System.out.println("Inserting new enterprise with name " + enterpriseName);

		Date enterpriseOpenDate = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			enterpriseOpenDate = formatter.parse(openDateParam);
		} catch (ParseException ex) {
			throw new ServletException(ex);
		}
		
		Database.add(new Enterprise(enterpriseName, enterpriseOpenDate));
		
		request.setAttribute("enterpriseName", enterpriseName);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/newEnterpriseCreated.jsp");
		dispatcher.forward(request, response);
		
	}
	
	

}
