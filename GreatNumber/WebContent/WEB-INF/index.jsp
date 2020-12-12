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
<h1>Bienvenido a The Great Number</h1>
	<p>Estoy pensando en un numero del 1 al 100</p>
	<form action="home" method="post">
		<input type="number" name="adivina">
		<input type="submit" value="adivinar">
	</form>
</body>
</html>