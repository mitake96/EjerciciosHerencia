package ejer15;

public class Alfareria implements MercanciaFragil{

	 double precio;
	 double peso;
	 String descripcion;
	 boolean esFragil;
	 
	public Alfareria(double precio, double peso, String descripcion, boolean esFragil) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.descripcion = descripcion;
		this.esFragil = esFragil;
	}
	
	
	public double damePrecio() {
		return precio;
	}
	
	public double damePeso() {
		return peso;
	}

	
	public String dameDescripcion() {
		return descripcion;
	}

	
	public String dameEmbalaje() {
		return esFragil?"Necesario":"No necesario";
	}

	

	
}
