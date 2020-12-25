<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/newEnterprise" var="newEnterpriseServletPath" />

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<style>
		.form {
			display: flex;
			flex-direction: column;
			width: 15%;
		}
	</style>
</head>
<body>

	<form action="${newEnterpriseServletPath}" method="post" class="form">
		Name: <input name="name" /> <br />
		Open Date: <input name="openDate" /> <br />
		<input type="submit" />
	</form>

</body>
</html>