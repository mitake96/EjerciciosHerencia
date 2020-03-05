package ejer15;

public class Plantas implements MercanciaViva{
	
	 double precio;
	 String descripcion;
	 boolean regada;
	 boolean alimentada;
	 
	 public Plantas(double precio, String descripcion, boolean regada, boolean alimentada) {
		 super();
		 this.precio = precio;
		 this.descripcion = descripcion;
		 this.regada = regada;
		 this.alimentada = alimentada;
	 }
	 
		
		public double damePrecio() {
			return precio;
		}

		
		public String dameDescripcion() {
			return descripcion;
		}
		
		public boolean necesitaRiego() {
			return regada;
		}
		
		public boolean necesitaComida() {
			return alimentada;
		}

		


}
