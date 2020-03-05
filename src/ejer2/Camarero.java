package ejer2;

public class Camarero extends Empleado{


	private String Tipo;
	

	public Camarero(String Nombre, String Tipo) {

		super(Nombre);
		this.Tipo = Tipo;
	}
	
	void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}
	
	public void name(String name) {
		Empleado empleado = new Empleado();
	}
}
