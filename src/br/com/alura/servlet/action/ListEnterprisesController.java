package br.com.alura.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;

/**
 * 	This class represents a Controller seen in more
 * advanced frameworks like Spring.
 * 
 * @author mvrigonati
 *
 */
public class ListEnterprisesController {
	
	public static String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("enterprises", Database.getAllEnterprises());
		return "forward:listEnterprises.jsp";
		
	}

}
