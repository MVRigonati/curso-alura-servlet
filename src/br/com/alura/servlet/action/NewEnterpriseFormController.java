package br.com.alura.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewEnterpriseFormController {
	
	public static String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "forward:formNewEnterprise.jsp";
	}

}
