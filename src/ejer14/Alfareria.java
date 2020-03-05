package ejer14;

public class Alfareria implements Mercancia{

	 double precio;
	 String descripcion;
	 boolean esFragil;
	 
	public Alfareria(double precio, String descripcion, boolean esFragil) {
		super();
		this.precio = precio;
		this.descripcion = descripcion;
		this.esFragil = esFragil;
	}
	
	public boolean esFragil() {
		return esFragil;
	}

	public void setFragil(boolean esFragil) {
		this.esFragil = esFragil;
	}
	
	public double damePrecio() {
		return precio;
	}
	
	public String dameDescripcion() {
		return descripcion;
	}
}
