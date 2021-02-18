package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//CONTROLADOR QUE PROCESA LAS PETICIONES, RESPUESTAS DEL SERVIDOR, ETC...
//@RequestMapping: FUNCIONA CON UNA RAÍZ RELATIVA, PARA CUANDO EXISTEN RUTAS DE MÉTODOS CON EL MISMO..
//NOMBRE, EN DISTINTOS CONTROLLER's.


@Controller
@RequestMapping("/principal")
public class HolaAlumnosControlador {
		
	
	// (1) MÉTODO QUE PIDA EL 1ER FORMULARIO (HolaAlumnosFormulario)
	
	//LE DECIMOS QUE HAGA UNA PETICIÓN DE UNA URL. LA URL QUE EL USUARIO DEBE USAR PARA QUE LE LLEGUE
	//EL FORMULARIO.
	
	@RequestMapping ("/muestraFormulario")  
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	
	}
	
	//(2)MÉTODO QUE PROCESE LA INFORMACIÓN DEL FORMULARIO, UNA VEZ RELLENADO. 
	
	@RequestMapping ("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	
	// (2) OTRO MÉTODO 
	
	// PROCESARÁ EL FORMULARIO, AGREGARÁ LA INFO QUE QUEREMOS AGREGAR AL MODELO Y LLAMARÁ A LA VISTA.
	//PARAMETROS():
	//REQUEST; PETICIÓN QUE RECIBÍAMOS, CON ESTO RESCATAMOS LA INFORMACIÓN INGRESADA EN EL CUADRO DE TXT.
	//MODELO; PARA AÑADIR LA INFORMACIÓN AL MODELO.
	//---------------
	//@RequestParam, tambn podemos usar @RequestParam y especificar el nombre de cuadro de txt. después...
	//ponemos una variable string donde almacenamos la información.
	
	@RequestMapping ("/procesarFormulario2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno")String nombre, Model modelo) {
		
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		//CON REQUEST
		//LEER INFO DEL CUADRO DE TEXTO, LA CAPTURAMOS Y LE AGREGAMOS ALGO DESPUÉS:
		//String nombre = request.getParameter("nombreAlumno");
		
		nombre+=" ES EL MEJOR ALUMNO.";
		String mensajeFinal = "¿QUIÉN ES EL MEJOR ALUMNO? " + nombre;
		
		//AGREGANDO INFO AL MODELO ("nombreIdentificativo",valor)
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
	
}
