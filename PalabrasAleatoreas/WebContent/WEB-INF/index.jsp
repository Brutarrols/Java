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
	
	<p>has genereado <c:out value="${countgenerate}"/> veces</p>
	 <h1> <c:out value="${palabra}"/> </h1>
	 <form action="home" action="get">
	 	<input type="submit" value="Generar" name="boton">
	 </form>
	 <p> ultima vez generado <c:out value="${fecha}"/> </p>
</body>
</html>