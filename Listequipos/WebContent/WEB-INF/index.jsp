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
	<h1>Lista de equipos</h1>
	<a href="equipo"> Crear Equipo </a>
	<table>
		<tr>
			<td>Equipo</td>
			<td>N° Jugadores</td>
			<td>Acciones</td>
		</tr>
		<c:forEach var="Equipos" items="${equipos}">
			<tr>
				<td> <c:out value="${Equipos.getNombreEquipo()}"/> </td>
				<td> <c:out value="${Equipos.cantidadJugadores()}"/> </td>
				<td> <a href="equipo?id=<c:out value="${Equipos.getId()}"/>">Detalles</a> <a href="equipoDelete?id=<c:out value="${Equipos.getId()}"/>">Eliminar</a> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>