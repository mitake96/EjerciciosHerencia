package ejer11;

import java.util.Random;

public class Dado extends Sorteo {
	
	int posibilidades = 6;
	
	public int lanzar() {
		return new Random().nextInt(posibilidades)+1;
	}

}
