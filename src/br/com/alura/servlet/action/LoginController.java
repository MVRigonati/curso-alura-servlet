package br.com.alura.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.model.Database;
import br.com.alura.servlet.model.User;

public class LoginController {

	public static String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		User databaseUser = Database.findUser(login, password);
		
		 String nextStep;
		 if (databaseUser != null) {
			 request.getSession().setAttribute("loggedUser", databaseUser);
			 nextStep = "redirect:listEnterprises";
		 } else {
			 nextStep = "redirect:formLogin";
		 }
		 
		 return nextStep;
		
	}
	
}
