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
	<form action="perros" method="Get">
		<h2>Ingresa datos de tu perro</h2>
		<label>Nombre:</label><br>
		<input type="text" id="name" name="name"><br>
		<label>Raza:</label><br>
		<input type="text" id="breed" name="breed"><br>
		<label>Peso:</label><br>
		<input type="text" id="weight" name="weight"><br>
		<input type="submit" id="dog"><br>
	</form>
	
	<form action="Cats" method="Get">
	<h2>Ingresa datos para tu gato</h2>
		<label>Nombre:</label><br>
		<input type="text" id="name" name="name"><br>
		<label>Raza:</label><br>
		<input type="text" id="breed" name="breed"><br>
		<label>Peso:</label><br>
		<input type="text" id="weight" name="weight"><br>
		<input type="submit" id="cat">
	</form>
</body>
</html>