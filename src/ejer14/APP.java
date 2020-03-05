package ejer14;

public class APP {
	public static void main(String[] args) {
		
		
	Plantas planta1 = new Plantas(11, "Rosa blanca", true);
	
	Alfareria alf1 = new Alfareria(20, "Jarron fabricado en Guinea Ecuatorial", true);
	
	dimeDatos(planta1);
	dimeDatos(alf1);
	
	}
	
	public static void dimeDatos(Mercancia producto) {
		
		System.out.printf("Precio: %.2f\nDescripcion: %s\n", producto.damePrecio(), producto.dameDescripcion());
		
	}

}
