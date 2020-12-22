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
	<form action="home" method="post" id="formulario">
		<input type="text" id="op" name="operacion" value="">
	</form>
		<br>
		<button value="7" id="boton7">7</button>
		<button value="8" id="boton8">8</button>
		<button value="9" id="boton9">9</button>
		<button value="+" id="suma">+</button>
		<br>
		<button value="4" id="boton4">4</button>
		<button value="5" id="boton5">5</button>
		<button value="6" id="boton6">6</button>
		<button value="-" id="resta">-</button>
		<br>
		<button value="1" id="boton1">1</button>
		<button value="2" id="boton2" >2</button>
		<button value="3" id="boton3">3</button>
		<button value="*" id="multiplo">x</button>
		<br>
		<button value="0" id="boton0">0</button>
		<button value="=" id="resultado">=</button>
		<button value="/" id="division">/</button>
		
		<c:forEach var="solucion" items="${historial.getHistorial()}">
			<p><c:out value="${solucion}"/></p>
		</c:forEach>
		
</body>
<script type="text/javascript">


	document.getElementById("boton7").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton7").value});
	document.getElementById("boton8").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton8").value});
	document.getElementById("boton9").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton9").value});
	document.getElementById("suma").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("suma").value});
	document.getElementById("boton4").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton4").value});
	document.getElementById("boton5").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton5").value});
	document.getElementById("boton6").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton6").value});
	document.getElementById("resta").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("resta").value});
	document.getElementById("boton1").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton1").value});
	document.getElementById("boton2").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton2").value});
	document.getElementById("boton3").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton3").value});
	document.getElementById("multiplo").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("multiplo").value});
	document.getElementById("boton0").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("boton0").value});
	document.getElementById("division").addEventListener("click",function(){document.getElementById("op").value = document.getElementById("op").value + document.getElementById("division").value});

	document.getElementById("resultado").addEventListener("click",function(){document.getElementById("formulario").submit()});
	
</script>
</html>