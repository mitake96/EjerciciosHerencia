package ejer11;

import java.util.Random;

public class Moneda extends Sorteo {
	
	int posibilidades=2;
	
	public int lanzar() {
		return new Random().nextInt(posibilidades);
	}
	
	public String lanzar(int moneda) {
		return moneda==0 ? "Cara" : "Cruz";
	}

}
