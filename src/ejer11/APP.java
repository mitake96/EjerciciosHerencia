package ejer11;

public class APP {
	
	public static void main(String[] args) {
		
		Dado dado=new Dado();
		
		System.out.println(dado.lanzar());
		
		Moneda moneda = new Moneda();
		
		System.out.println(moneda.lanzar(moneda.lanzar()));
		
	}

}
