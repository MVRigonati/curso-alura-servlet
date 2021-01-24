package br.com.alura.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.alura.servlet.model.Database;

@WebServlet("/ws/enterprises")
public class ListEnterprisesWS extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String result = new Gson().toJson(Database.getAllEnterprises());
		
		resp.setContentType("application/json");
		resp.getWriter().print(result);
		
	}

}
