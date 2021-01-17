<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.alura.servlet.model.Enterprise" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/removeEnterprise?id=" var="removeEnterprisePath" />
<c:url value="/showEnterprise?id=" var="showEnterprisePath" />
<c:url value="/formAddEnterprise" var="createEnterprisePath" />
<c:url value="/logoutUser" var="logoutPath" />
    
<!DOCTYPE html>
<html>
<body style="font-size: larger; font-family: system-ui;">
	
	User: ${loggedUser.login} <br>
	<a href="${logoutPath}">Logout</a>
	<br>
	<br>
	
	Enterprises: <br />
	
	<form action="${createEnterprisePath}" method="get">
		<button type="submit">Create</button>
	</form>
	
	<ul>
		<c:forEach items="${enterprises}" var="e">
			<li>
				${e.name} - <fmt:formatDate value="${e.openDate}" pattern="dd/MM/yyyy" />
				<a href="${removeEnterprisePath}${e.id}">Remove</a>
				<a href="${showEnterprisePath}${e.id}">Edit</a>
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>