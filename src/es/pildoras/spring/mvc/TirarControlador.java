package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {

	@RequestMapping ("/muestraFormulario")  
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	
	@RequestMapping ("/procesarFormulario2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno")String nombre, Model modelo) {
		
		
		nombre+=" ES EL PEOR ALUMNO.";
		String mensajeFinal = "¿QUIÉN ES EL PEOR ALUMNO? " + nombre;
		
		//AGREGANDO INFO AL MODELO ("nombreIdentificativo",valor)
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
	
}
