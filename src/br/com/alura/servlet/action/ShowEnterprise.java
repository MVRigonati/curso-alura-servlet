package br.com.alura.servlet.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;
import br.com.alura.servlet.model.Enterprise;

public class ShowEnterprise {
       
	public static void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer idToShow = Integer.parseInt( request.getParameter("id") );
		Enterprise enterprise = Database.findBy(idToShow);
		
		request.setAttribute("enterprise", enterprise);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showEnterprise.jsp");
		dispatcher.forward(request, response);
		
	}

}
