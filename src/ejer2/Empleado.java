package ejer2;

public class Empleado {
	
	private String Nombre;
	String Apellido;
	protected String Puesto;
	public int Edad;
	
	public Empleado() {
		Nombre = "Predeterminado";
		Puesto = "Empleado";
		Edad = 50;
	}
	
	Empleado(String Nombre, String Apellido) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
	}
	
	public Empleado(String Nombre) {
		this.Nombre = Nombre;
	}
		
	protected Empleado(String Nombre, String Apellido, String Puesto, int Edad) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Puesto = Puesto;
		this.Edad = Edad;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	
	public void setPuesto(String Puesto) {
		this.Puesto = Puesto;
	}
	
	public void setEdad(int Edad) {
		this.Edad = Edad;
	}
}
