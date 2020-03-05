package ejer15;

public class APP {
	public static void main(String[] args) {
		
		
	Plantas planta1 = new Plantas(11, "Rosa blanca", true, false);
	Alfareria alf1 = new Alfareria(20, 12.5, "Jarron fabricado en Guinea Ecuatorial", true);
	
	dimeDatos(planta1);
	dimeDatos(alf1);
	
	}
	
	public static void dimeDatos(Mercancia producto) {
		
		System.out.printf("Precio: %.2f\nDescripcion: %s\n", producto.damePrecio(), producto.dameDescripcion());
		
		if(producto instanceof MercanciaViva) {
			System.out.printf("Alimento:%s\nAgua:%s\n",((MercanciaViva)producto).necesitaComida()?"Puesto":"Necesita",((MercanciaViva) producto).necesitaRiego()?"Puesta":"Necesita");
		}else if(producto instanceof MercanciaFragil) {
			System.out.printf("Peso:%.2f\nEmbalaje:%s\n",((MercanciaFragil)producto).damePeso(),((MercanciaFragil)producto).dameEmbalaje());
		}
		
	}

}
