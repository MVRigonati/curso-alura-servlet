package br.com.alura.servlet.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;
import br.com.alura.servlet.model.Enterprise;

public class AddEnterpriseController {
	
	public static String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
		
		return "redirect:listEnterprises";
		
	}
	
	

}
