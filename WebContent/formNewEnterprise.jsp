<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/newEnterprise" var="newEnterpriseServletPath"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${newEnterpriseServletPath}" method="post">
		Name: <input name="name" /> <br />
		Open Date: <input name="openDate" /> <br />
		<input type="submit" />
	</form>

</body>
</html>