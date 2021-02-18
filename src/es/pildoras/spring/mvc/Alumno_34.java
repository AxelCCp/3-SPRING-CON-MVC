package es.pildoras.spring.mvc;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Alumno_34 {

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getOptativas() {
		return optativas;
	}
	public void setOptativas(String optativas) {
		this.optativas = optativas;
	}
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getEdad() {//(video40)
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {//(video40)
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	//(VIDEO 39 )VALIDAMOS LAS PROPIEDADES PARA QUE NO QUEDE EL CAMPO VACÍO CON "@NotNull"
	//(VIDEO 39 )TAMBN CON @Size, PARA UN MÍNIMO DE CARACTERES EN EL CAMPO DE TXT. Y MENSAJE EN.. 
	//CASO DE ERROR.  
	@NotNull
	@Size(min=2, message="Campo requerido")
	private String nombre;
	
	private String apellido;
	private String optativas;
	private String ciudadEstudios;
	private String idioma;
	
	//VIDEO40_PARA VALIDACIÓN, @Min:valorMínimo / @Max:valorMáximo
	@Min(value=10,message="Edad no valida, no se permiten edades menores de 10 años.")
	@Min(value=100,message="Edad no valida, no se permiten edades mayores a 100 años.")
	private int edad;
	
	//VIDEO40_PARA VALIDACIÓN DE EMAIL
	@Email
	private String email;

	//VIDEO42_VALIDACIÓN DE CÓDIGO POSTAL
	//regexp:REGULAR EXPRESIONS / PUEDE LLEVAR CARACTERES DEL 0 AL 9. / PUEDE TENER MAX. 5 CARACTERES.
	@Pattern(regexp="[0-9]{5}",message="Solo puede tener 5 valores numéricos")
	private String codigoPostal;
}
