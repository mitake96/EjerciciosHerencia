package ejer8;

public class Ejercicio8 {
	
		 public int dato=0;
		 public static int datostatico=0;
		 
		 
		 public void metodo() {
			// this.datostatico++;	// Est� mal ya que no hay que usar this. para referirencias est�ticas
			 }
		
		 public static void metodostatico(){
		//  this.datostatico++; Lo mismo que lo anterior, no se puede usar this ya que un m�todo est�tico no tiene relaci�n con uno din�mico
		 datostatico++;
		 }
		 public static void main(String [] args){
		// dato++;  // habr�a que haber puesto public static int dato=0; para que esto funcionase, ya que al no ser est�tico no se conocen
		 
		 datostatico++;	//funciona
		 metodostatico();
		 // metodo(); // lo mismo, deber�a ser est�tico para que funcionase
		 
		 
		 }
		 

		 }
	
	

