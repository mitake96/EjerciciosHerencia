package ejer13;

public abstract class Vehiculo {
//	private int peso;

	public final void setPeso(int p) {
	//	peso = p;
	}

	public abstract int getVelocidadActual();
	
	/*� �podr� tener descendencia esta clase?
	  � �se pueden sobrescribir todos sus m�todos?*/
	
	
	// S� podr� tener descendencia y no se puede modificar el m�todo setPeso ya que es un m�todo final.
}
