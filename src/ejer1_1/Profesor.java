package ejer1_1;

public class Profesor extends Persona{
	
	private double sueldo;

	public Profesor() {
		sueldo = 1200.00;
	}

	@Override
	public String toString() {
		return String.format("Persona: \nNombre=%s\nEdad=%s\nSexo=%s\nNacionalidad=%s\nSueldo: ", nombre, edad, sexo,
				nacionalidad, sueldo);
	}
	
	

}
