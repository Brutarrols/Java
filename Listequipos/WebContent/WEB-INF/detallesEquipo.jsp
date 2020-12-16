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
	<h1> <c:out value="${Equipo.getNombreEquipo()}"></c:out></h1>
	<a href="jugadores?id=<c:out value="${Equipo.getId()}"/>"> Agregar jugador </a>
	<table>
		<tr>
			<td>Nombre</td>
			<td>Apellido</td>
			<td>Acciones</td>
		</tr>
		<c:forEach var="jugador" items="${Equipo.getJugadores()}">
			<tr>
				<td> <c:out value="${jugador.getFirstName()}"/> </td>
				<td> <c:out value="${jugador.getLastName()}"/> </td>
				<td> <a href="jugadoresDelete?id=<c:out value="${jugador.getId()}"/>&equipoId=<c:out value="${Equipo.getId()}"/>">Eliminar</a> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>