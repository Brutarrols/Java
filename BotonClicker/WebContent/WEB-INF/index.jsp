<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="home" method="get">
		<input type="submit" name="boton" value="Click me!">
	</form>
	<p> Has hecho <c:out value="${clicks}" /> Clicks en el botón. </p>
</body>
</html>