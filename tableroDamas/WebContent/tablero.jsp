<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tablero de Damas</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<% int hight = Integer.parseInt(request.getParameter("height")), width = Integer.parseInt(request.getParameter("width")); %>
	<% for (int i= 0; i < hight; i++){ %>
	<% 		for(int j=0 ; j < width; j++){ %>
				<% if(i % 2 == 0){ %>
					<% if(j % 2 == 0 ){ %>
					<div class="blue"></div>
			<%			}else{  %>
					<div class="pink"></div> 
	<%          } %>
				<%} else {%>
			<% 		 if(j % 2 == 0 ){ %>
					<div class="pink"></div>
			<%	}else{  %>
					<div class="blue"></div> 
	<%          } %>
	<%}%>
	<%}%>
	<br><% } %>
</body>
</html>