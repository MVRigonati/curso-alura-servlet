<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<body>
	
	<c:if test="${not empty enterpriseName}">
		Enterprise named "${enterpriseName}" created successfully!
	</c:if>
	<c:if test="${empty enterpriseName}">
		No enterprise created.
	</c:if>
	
</body>
</html>