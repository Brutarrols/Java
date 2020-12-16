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
	<h1>Crear Jugador</h1>
	<form action="jugadores" method="post">
		<label>Nombre</label>
		<input type="text" name="nombre">
		<label>Apellido</label>
		<input type="text" name="apellido">
		<label>Edad</label>
		<input type="text" name="edad">
		<input type="submit" value="Crear">
	</form>
</body>
</html>