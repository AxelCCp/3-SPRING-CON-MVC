package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//CONTROLADOR QUE PROCESA LAS PETICIONES, RESPUESTAS DEL SERVIDOR, ETC...
//@RequestMapping: FUNCIONA CON UNA RA�Z RELATIVA, PARA CUANDO EXISTEN RUTAS DE M�TODOS CON EL MISMO..
//NOMBRE, EN DISTINTOS CONTROLLER's.


@Controller
@RequestMapping("/principal")
public class HolaAlumnosControlador {
		
	
	// (1) M�TODO QUE PIDA EL 1ER FORMULARIO (HolaAlumnosFormulario)
	
	//LE DECIMOS QUE HAGA UNA PETICI�N DE UNA URL. LA URL QUE EL USUARIO DEBE USAR PARA QUE LE LLEGUE
	//EL FORMULARIO.
	
	@RequestMapping ("/muestraFormulario")  
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	
	}
	
	//(2)M�TODO QUE PROCESE LA INFORMACI�N DEL FORMULARIO, UNA VEZ RELLENADO. 
	
	@RequestMapping ("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	
	// (2) OTRO M�TODO 
	
	// PROCESAR� EL FORMULARIO, AGREGAR� LA INFO QUE QUEREMOS AGREGAR AL MODELO Y LLAMAR� A LA VISTA.
	//PARAMETROS():
	//REQUEST; PETICI�N QUE RECIB�AMOS, CON ESTO RESCATAMOS LA INFORMACI�N INGRESADA EN EL CUADRO DE TXT.
	//MODELO; PARA A�ADIR LA INFORMACI�N AL MODELO.
	//---------------
	//@RequestParam, tambn podemos usar @RequestParam y especificar el nombre de cuadro de txt. despu�s...
	//ponemos una variable string donde almacenamos la informaci�n.
	
	@RequestMapping ("/procesarFormulario2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno")String nombre, Model modelo) {
		
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		//CON REQUEST
		//LEER INFO DEL CUADRO DE TEXTO, LA CAPTURAMOS Y LE AGREGAMOS ALGO DESPU�S:
		//String nombre = request.getParameter("nombreAlumno");
		
		nombre+=" ES EL MEJOR ALUMNO.";
		String mensajeFinal = "�QUI�N ES EL MEJOR ALUMNO? " + nombre;
		
		//AGREGANDO INFO AL MODELO ("nombreIdentificativo",valor)
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
	
}
