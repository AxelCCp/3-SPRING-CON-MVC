package es.pildoras.spring.mvc;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController_34 {
	
	//VIDEO41_M�TODO QUE RECORTA LOS ESPACIOS EN BLANCO QUE PUEDEN IR DEM�S EN LOS CUADROS DE TEXTO.
	//NO NOS DEJAR� DEJAR ESPACIOS EN BLANCO EN EL CAMPO NOMBRE.
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	}
	
	
	
	// RECIBE EL MODELO POR PARAMETRO.
	//EL MODELO ES UN OBJ Q SIRVE DE PUENTE ENTRE EL CONTROLADOR Y LAS VISTAS.
	//EN EL "modelo", PODREMOS ALMACENAR AL OBJ DE TIPO ALUMNO. PARA ESTO, USAMOS EL M�TODO...
	//ADDATRIBUTE("nombreIdentificativo", obj) CON EL OBJ "MODELO".
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		Alumno_34 elAlumno = new Alumno_34();
		modelo.addAttribute("elAlumno", elAlumno);
		return "alumnoRegistroFormulario_34";
	}
	
	
	//ESTE M�TODO DEBE RECIBIR POR ARGUMENTO, EL MODELO DEL M�TODO "muestraFormulario()" YA QUE AQU� EST�..
	//LA INFO DEL OBJ ALUMNO. PARA ESTO SE USA @ModelAttribute. Y SE CREA UN NUEVO OBJ DE TIPO "Alumno_34"...
	//PARA ALMACENAR ESTA INFORMACI�N. OBJ NUEVO : Alumno_34 elAlumno .
	
	//(VIDEO 39) ESPECIFICAMOS LA VALIDACION DEL CAMPO NOMBRE.
	//LAS VALIDACIONES SE VAN A ALMACENAR EN UN OBJ DE TIPO BindingResult, Y VA EN EL ARGUMENTO DEL M�T. 
	//@Valid : LE AVIZAMOS AL M�TODO QUE ESTAMOS VALIDANDO.
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno")Alumno_34 elAlumno, BindingResult resultadoValidacion ) {
		if(resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario_34";
		}
		else {
			return"ConfirmacionRegistroAlumno_34";
		}
	}
	
}
