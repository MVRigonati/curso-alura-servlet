package br.com.alura.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.servlet.action.AddEnterpriseController;
import br.com.alura.servlet.action.EditEnterpriseController;
import br.com.alura.servlet.action.ListEnterprisesController;
import br.com.alura.servlet.action.NewEnterpriseFormController;
import br.com.alura.servlet.action.RemoveEnterpriseController;
import br.com.alura.servlet.action.ShowEnterpriseController;

/**
 * 	This is the main controller, when we use more advanced frameworks like Spring
 * we should not see or edit this class, in this case we will create only the
 * actions, they are part of the controller too, this is why we call it
 * "controller" as well.
 * 
 * @author mvrigonati
 *
 */
@WebServlet(name = "Controller", urlPatterns = { "/" })
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		
		final String requestName = req.getRequestURI().split("/")[2];
		
		String nextStep = "";
		if (requestName.equals("listEnterprises")) {
			nextStep = ListEnterprisesController.exec(req, resp);
			
		} else if (requestName.equals("removeEnterprise")) {
			nextStep = RemoveEnterpriseController.exec(req, resp);
			
		} else if (requestName.equals("addEnterprise")) {
			nextStep = AddEnterpriseController.exec(req, resp);
			
		} else if (requestName.equals("editEnterprise")) {
			nextStep = EditEnterpriseController.exec(req, resp);
			
		} else if (requestName.equals("showEnterprise")) {
			nextStep = ShowEnterpriseController.exec(req, resp);
			
		} else if (requestName.equals("formAddEnterprise")) {
			nextStep = NewEnterpriseFormController.exec(req, resp);
			
		}
		
		String[] typeAndAddress = nextStep.split(":");
		if ("forward".equals(typeAndAddress[0])) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/" + typeAndAddress[1]);
			dispatcher.forward(req, resp);
			
		} else { // redirect
			resp.sendRedirect(typeAndAddress[1]);
			
		}
		
	}

}
