package es.pildoras.spring.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controlador {
	
	//ESPECIFICAMOS LA VISTA QUE QUEREMOS QUE NOS PROPORCIONE.
	//LE DECIMOS A SPRING QUE ESTE MÉTODO SE ENCARGA DE MAPEAR, CUÁL ES LA VISTA JSP QUE QUEREMOS VER. 
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}
	
	

}
