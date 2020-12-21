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
	<h1>Cronometro</h1>
	<a href="home?comando=start"> Start </a>
	<a href="home?comando=stop"> Stop </a>
	<a href="home?comando=restart"> Restart</a>
	
	<h2>Start time: <c:out value="${ultimo_tiempo_inicio.getHora()}"/>h:<c:out value="${ultimo_tiempo_inicio.getMinutos()}"/>m:<c:out value="${ultimo_tiempo_inicio.getSegundos()}"/>s</h2>
	<h2>Current time: <c:out value="${tiempo_actual.getHora()}"/>h:<c:out value="${tiempo_actual.getMinutos()}"/>m:<c:out value="${tiempo_actual.getSegundos()}"/>s</h2> 
	<h2>Runnig time: <c:out value="${tiempo_actual.getHora()-ultimo_tiempo_inicio.getHora()}"/>h:<c:out value="${tiempo_actual.getMinutos()-ultimo_tiempo_inicio.getMinutos()}"/>m:<c:out value="${tiempo_actual.getSegundos()-ultimo_tiempo_inicio.getSegundos()}"/>s</h2>
	
	<table>
		<tr>
			<td>Start</td>
			<td>Stop</td>
			<td>Total</td>
		</tr>
		<c:forEach var="tiempo" items="${tiempos.getRecordStart()}">
			<tr>
				<td><c:out value="${tiempo }"></c:out> </td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>