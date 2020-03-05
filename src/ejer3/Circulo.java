package ejer3;

public class Circulo extends FiguraGeometrica{
	
	private int radio, area;
	
	public Circulo(int x, int y, int radio) {
		super(x,y);	
		this.radio = radio;
	}

	
	public String calcular_area() {
		
		area=(int)Math.PI *(radio * radio);
		
		return String.format(
				"Area circulo:\n" +
				"Coordenada izquierda: %d-%d\n" +
				"Coordenada superior: %d-%d\n" +
				"Coordenada derecha: %d-%d\n" +
				"Coordenada inferior: %d-%d\n", 
				(area), x-radio, y, x, (y + radio), (x + radio), y, x, y-radio);
		
		
	}




		

}
