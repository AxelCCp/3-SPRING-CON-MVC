<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONFIRMACIÓN DE REGISTRO</title>
</head>
<body>
	
	<!-- RESCATAMOS EL NOMBRE DEL ALUMNO DESDE @ModelAttribute en alumnoRegistroFormulario_34 -->
	<!-- PONEMOS  ${elAlumno.nombre}, YA ESTAMOS RESCATANDO LA VARIABLE NOMBRE DE LA CLASE "Alumno_34" -->
	
	EL ALUMNO <strong>${elAlumno.nombre}</strong>  Y APELLIDO <strong>${elAlumno.apellido}</strong> , SE HA REGISTRADO CON EXITO.
	<br><br><br>
	EDAD: <strong>${elAlumno.edad}</strong>
	<br><br><br>
	E-MAIL: <strong>${elAlumno.email}</strong>
	<br><br><br>
	
	CODIGO POSTAL: <strong>${elAlumno.codigoPostal}</strong>
	<br><br><br>
	
	LA ASIGNATURA OPTATIVA ELEGIDA ES <strong>${elAlumno.optativas}</strong>  
	<br><br><br>
	LA CIUDAD ESCOGIDA POR EL ALUMNO ES <strong>${elAlumno.ciudadEstudios}</strong>
	<br><br><br>
	LOS IDIOMAS ESCOGIDOS POR EL ALUMNO SON: <strong>${elAlumno.idioma}</strong>

</body>
</html>