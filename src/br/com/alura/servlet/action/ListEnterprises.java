package br.com.alura.servlet.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;

public class ListEnterprises {
	
	public static void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("enterprises", Database.getAllEnterprises());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listEnterprises.jsp");
		dispatcher.forward(request, response);
		
	}

}
