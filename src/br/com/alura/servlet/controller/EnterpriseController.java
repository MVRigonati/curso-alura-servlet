package br.com.alura.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.action.EditEnterprise;
import br.com.alura.servlet.action.ListEnterprises;
import br.com.alura.servlet.action.NewEnterprise;
import br.com.alura.servlet.action.RemoveEnterprise;
import br.com.alura.servlet.action.ShowEnterprise;

@WebServlet(name = "EnterpriseController", urlPatterns = { "/enterprise" })
public class EnterpriseController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if (action.equals("list")) {
			ListEnterprises.exec(req, resp);
			
		} else if (action.equals("remove")) {
			RemoveEnterprise.exec(req, resp);
			
		} else if (action.equals("add")) {
			NewEnterprise.exec(req, resp);
			
		} else if (action.equals("edit")) {
			EditEnterprise.exec(req, resp);
			
		} else if (action.equals("show")) {
			ShowEnterprise.exec(req, resp);
			
		}
		
	}

}
