package ejer1_1;

public class Alumno extends Persona {
	
	private boolean esRepetidor;

	public Alumno() {
		esRepetidor = false;
	}

	@Override
	public String toString() {
		return String.format("Alumno: \nesRepetidor=%s", esRepetidor);
	}

	
}
