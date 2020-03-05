package ejer1_1;

public class Persona {
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected String nacionalidad;
	
	
	
	public Persona() {
		
		this.nombre = "Default";
		this.edad = 0;
		this.sexo = "Hombre";
		this.nacionalidad = "Española";
		
	}



	@Override
	public String toString() {
		return String.format("Nombre=%s\nEdad=%s\nSexo=%s\nNacionalidad=%s", nombre, edad, sexo,
				nacionalidad);
	}
	
	

}
