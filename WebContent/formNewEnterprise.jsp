<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/enterprise" var="enterpriseController" />

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

	<form action="${enterpriseController}" method="post" class="form">
		Name: <input name="name" /> <br />
		Open Date: <input name="openDate" /> <br />
		
		<input type="hidden" name="action" value="add">
		<input type="submit" />
	</form>

</body>
</html>