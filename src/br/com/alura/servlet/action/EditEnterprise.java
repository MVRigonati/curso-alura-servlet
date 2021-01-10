package br.com.alura.servlet.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;

public class EditEnterprise {
	
	public static void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt( request.getParameter("id") );
		String newEnterpriseName = request.getParameter("name");
		String newOpenDateParam = request.getParameter("openDate");
		
		Date newEnterpriseOpenDate = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			newEnterpriseOpenDate = formatter.parse(newOpenDateParam);
		} catch (ParseException ex) {
			throw new ServletException(ex);
		}
		
		Database.update(id, newEnterpriseName, newEnterpriseOpenDate);
		
		response.sendRedirect("enterprise?action=list");
		
	}

}
