package ejer8;

public class Ejercicio8 {
	
		 public int dato=0;
		 public static int datostatico=0;
		 
		 
		 public void metodo() {
			// this.datostatico++;	// Está mal ya que no hay que usar this. para referirencias estáticas
			 }
		
		 public static void metodostatico(){
		//  this.datostatico++; Lo mismo que lo anterior, no se puede usar this ya que un método estático no tiene relación con uno dinámico
		 datostatico++;
		 }
		 public static void main(String [] args){
		// dato++;  // habría que haber puesto public static int dato=0; para que esto funcionase, ya que al no ser estático no se conocen
		 
		 datostatico++;	//funciona
		 metodostatico();
		 // metodo(); // lo mismo, debería ser estático para que funcionase
		 
		 
		 }
		 

		 }
	
	

