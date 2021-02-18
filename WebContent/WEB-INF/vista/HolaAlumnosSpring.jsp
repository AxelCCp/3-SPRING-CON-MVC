<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <!-- VISTA QUE MUESTRA LA INFORMACIÓN DEL FORMULARIO YA RELLENADO ANTERIORMENTE -->
    
    
<!DOCTYPE html>
<html>
<head>
	<!-- AGREGAMOS PÁGINA DE ESTILO -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	HOLA ${param.nombreAlumno}, BIENVENIDO AL CURSO DE SPRING.

	<p><br>
	<h2>ATENCIÓN A TODOS</h2>
	${mensajeClaro}
	</p>
	
	<!-- AGREGAMOS LA IMAGEN.  SRC={NOS DEVUELVE LA RAIZ DEL SITIO WEB}/RUTA DE LA IMAGEN -->
	<img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/goku.jpg">
	
</body>
</html>