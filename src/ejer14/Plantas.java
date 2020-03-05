package ejer14;

public class Plantas implements Mercancia{
	
	 double precio;
	 String descripcion;
	 boolean regada;
	 
	 public Plantas(double precio, String descripcion, boolean regada) {
		 super();
		 this.precio = precio;
		 this.descripcion = descripcion;
		 this.regada = regada;
	 }
	 
	 public boolean isRegada() {
			return regada;
		}

		public void setRegada(boolean regada) {
			this.regada = regada;
		}
	 
	 
		public double damePrecio() {
			return precio;
		}
		
		public String dameDescripcion() {
			return descripcion;
		}

}
