package ejer1_1;

public class Alumno extends Persona {
	
	private boolean esRepetidor;

	public Alumno() {
		esRepetidor = false;
	}
	
	public Alumno(String nombre, int edad, String sexo, String nacionalidad, boolean esRepetidor) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.esRepetidor = esRepetidor;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\n¿Es repetidor: %b", esRepetidor);
	}

	
}
