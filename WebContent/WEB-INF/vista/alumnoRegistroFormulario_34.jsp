<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- AQU� ES DONDE HAREMOS EL << FORMULARIO DE REGISTRO >> Y USAREMOS LAS << FORM MVC TAGS >>  -->
    
    <!-- DIRECTIVA PARA PODER USAR LAS FORM MVC TAGS -->
 	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORMULARIO DE REGISTRO</title>
</head>
<body>

	<!-- CUADRO DE TEXTO (configuraci�n) -->
	<!-- action= metodo q procesa el formulario -->
	<!-- modelAttribute= nombre identificativo del atributo del modelo  -->
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
	
		<!-- CUADRO DE TEXTO -->
		<!-- path="nombre" : hace referencia al get y set de la clase Alumno_34, ya que esta MVC tag,..
			 llama al getter de la clase Alumno_34, y luego cuando se pareta bot�n "enviar", la MVC tag..
			 llama al setter de la clase Alumno_34 -->
		
		NOMBRE: <form:input path="nombre"/>
		
		<!-- (Video39)_para que aparezca mensaje de validaci�n-->
		<form:errors path="nombre"/>
		
		<br><br><br>
		APELLIDO: <form:input path="apellido"/>
		<br/><br/><br/>
		
		<!-- (video36)_ AGREGAMOS UN MEN� DESPLEAGABLE / USAMOS SPRING's FORM MVC TAGS
			 path="optativas": HACE REFERENCIA AL ELEMENTO DEL CUAL SE TRATA, AL IGUAL QUE 
			 APELLIDO Y NOMBRE.
		-->
		
		<!-- (Video40) -->
		EDAD: <form:input path="edad"/>
		<form:errors path="edad" style="color:red"/>
		<br/><br/><br/>
			
		<!-- (Video40) -->
		E-mail: <form:input path="email"/>
		<form:errors path="email"/>
		<br/><br/><br/>
		
		
		<!-- (Video42) -->
		C.postal: <form:input path="codigoPostal"/>
		<form:errors path="codigoPostal"/>
		<br/><br/><br/>
		
		ASIGNATURAS OPTATIVAS:
		<form:select path="optativas" multiple="true">
			<form:option value="Dise�o" label="Dise�o"/>
			<form:option value="Karate" label="Karate"/>
			<form:option value="Comercio" label="Comercio"/>
			<form:option value="Danza" label="Danza"/>
		</form:select>
		
		<br/><br/><br/>
		
		BARCELONA<form:radiobutton path="ciudadEstudios" value="Barcelona"/>
		MADRID<form:radiobutton path="ciudadEstudios" value="Madrid"/>
		VALENCIA<form:radiobutton path="ciudadEstudios" value="Valencia"/>
		
		<br/><br/><br/>
		
		INGL�S<form:checkbox path="idioma" value="ingl�s"/>
		FRANC�S<form:checkbox path="idioma" value="franc�s"/>
		ESPA�OL<form:checkbox path="idioma" value="espa�ol"/>
		
		<!--BOT�N: ESTE "NO" EST� CONSTRUIDO CON MVC TAG -->
		<input type="submit" value="Enviar">
		
	</form:form>


</body>
</html>