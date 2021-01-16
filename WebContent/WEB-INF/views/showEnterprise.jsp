<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/editEnterprise" var="enterpriseController" />

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Enterprise</title>
	
	<style>
		.form {
			display: flex;
			flex-direction: column;
			width: 15%;
		}
	</style>
</head>
<body>

	<form action="${enterpriseController}" method="post" class="form">
		<input type="hidden" name="id" value="${enterprise.id}" />
		Name: <input name="name" value="${enterprise.name}" /> <br />
		Open Date: <input name="openDate"  value="<fmt:formatDate value="${enterprise.openDate}" pattern="dd/MM/yyyy" />" /> <br />
		
		<input type="submit" />
	</form>

</body>
</html>