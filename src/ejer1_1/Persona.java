package ejer1_1;

public class Persona {
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected String nacionalidad;
	
	
	
	public Persona() {
		
		nombre = "Default";
		edad = 0;
		sexo = "Hombre";
		nacionalidad = "Española";
		
	}



	@Override
	public String toString() {
		return String.format("Persona: \nNombre=%s\nEdad=%s\nSexo=%s\nNacionalidad=%s", nombre, edad, sexo,
				nacionalidad);
	}
	
	

}
