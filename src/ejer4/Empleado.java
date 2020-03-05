package ejer4;

public class Empleado {
	
	public String nombre;
	public int edad;
	public double sueldo;
	public double sueldo_extra;
	
	
	public Empleado(String nombre, int edad, double sueldo, double sueldo_extra) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;		
		this.sueldo_extra = sueldo_extra;
	}
	
	public double calcularSueldo() {
	
	return sueldo + sueldo_extra;
	
	}

}
