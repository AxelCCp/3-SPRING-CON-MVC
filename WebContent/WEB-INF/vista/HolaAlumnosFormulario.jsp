<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
    <!-- JSP CON EL FORMULARIO QUE HAY QUE RELLENAR -->
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- EN ACTION: PONEMOS LA URL DEL HolaAlumnosControlador, PARA PROCESAR EL FORMULARIO. 
	METHOD: get, PARA OBTENER LA URL. -->
	<form action="procesarFormulario2" method="get">
	
	<!-- CONSTRUCCIÓN DE CUADRO DE TEXTO, CON NOMBRE IDENTIFICATIVO "nombreAlumno"-->
	<input type="text" name="nombreAlumno">

	<!-- BOTÓN DE ENVIAR -->
	<input type="submit">

	</form>

<body>
</html>