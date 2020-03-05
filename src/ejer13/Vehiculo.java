package ejer13;

public abstract class Vehiculo {
//	private int peso;

	public final void setPeso(int p) {
	//	peso = p;
	}

	public abstract int getVelocidadActual();
	
	/*• ¿podrá tener descendencia esta clase?
	  • ¿se pueden sobrescribir todos sus métodos?*/
	
	
	// Sí podrá tener descendencia y no se puede modificar el método setPeso ya que es un método final.
}
