package ejer1_1;

public class Profesor extends Persona{
	
	private double sueldo;
	


	public Profesor(String nombre, int edad, String sexo, String nacionalidad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + String.format("\nSueldo: %.2f", sueldo);
	}
	
	

}
