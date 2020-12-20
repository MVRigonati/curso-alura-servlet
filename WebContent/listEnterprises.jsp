<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.servlet.Enterprise" %>
    
<!DOCTYPE html>
<html>
<body style="font-size: larger; font-family: system-ui;">
	Enterprises: <br />
	<ul>
		<%
			List<Enterprise> enterprises = (List<Enterprise>) request.getAttribute("enterprises");
			for (Enterprise enterprise : enterprises) {
		%>
			<li><%=enterprise.getName() %></li>
		<%
			}
		%>
	</ul>
</body>
</html>