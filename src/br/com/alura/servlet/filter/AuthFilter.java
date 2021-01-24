package br.com.alura.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class AuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse resp = (HttpServletResponse) servletResponse;
		
		final String[] uriSplitted = req.getRequestURI().split("/");
		String requestName = (uriSplitted.length > 2) ? uriSplitted[2] : "formLogin";
		
		boolean isUserLogged = req.getSession().getAttribute("loggedUser") != null;
		boolean isProtectedPage = !("loginUser".equals(requestName) || "formLogin".equals(requestName));
		
		if (!isUserLogged && isProtectedPage) {
			resp.sendRedirect("formLogin");
		} else {
			chain.doFilter(servletRequest, servletResponse);
		}
		
	}
	
	

}
