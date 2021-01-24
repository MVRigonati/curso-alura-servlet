package br.com.alura.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class TimeMonitorFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		long init = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long end = System.currentTimeMillis();
		
		final String[] uriSplitted = ((HttpServletRequest) request).getRequestURI().split("/");
		String action = (uriSplitted.length > 2) ? uriSplitted[2] : "formLogin";
		System.out.println("Time to execute action: " + action + " - " + (end - init) + "ms");
		
	}
	
	

}
