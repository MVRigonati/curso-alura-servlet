<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/loginUser" var="loginPath" />

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	
	<style>
		.form {
			display: flex;
			flex-direction: column;
			width: 15%;
		}
	</style>
</head>
<body>

	<form action="${loginPath}" method="post" class="form">
		Login: <input name="login" /> <br />
		Password: <input type="password" name="password" /> <br />
		
		<input type="submit" />
	</form>

</body>
</html>