package ejer4;

public class Encargado extends Empleado {
	
	private final double Sueldo_encargado = 1.10;

	public Encargado(String nombre, int edad, double sueldo, double sueldo_extra) {
		super(nombre, edad, sueldo, sueldo_extra);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularSueldo() {
		return super.calcularSueldo() * Sueldo_encargado;
	}
	
	

}
