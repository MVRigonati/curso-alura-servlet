<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.servlet.Enterprise" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<body style="font-size: larger; font-family: system-ui;">
	
	<c:if test="${not empty enterpriseName}">
		Enterprise named "${enterpriseName}" created successfully!
	</c:if>
	
	Enterprises: <br />
	<ul>
		<c:forEach items="${enterprises}" var="e">
			<li> ${e.name} - <fmt:formatDate value="${e.openDate}" pattern="dd/MM/yyyy" /> </li>
		</c:forEach>
	</ul>
	
</body>
</html>