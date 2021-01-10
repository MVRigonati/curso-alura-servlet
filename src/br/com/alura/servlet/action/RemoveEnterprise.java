package br.com.alura.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;

public class RemoveEnterprise {
	
	public static void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer idToRemove = Integer.parseInt( request.getParameter("id") );
		Database.removeBy(idToRemove);
		
		response.sendRedirect("enterprise?action=list");
	}

}
