package ejer1_1;

import java.util.Scanner;

import ejer1_1.ConsoleInput;

public class APP {

	public static void main(String[] args) {
		
		int option;
				
		Alumno alum1 = new Alumno("Ignacio", 23, "Hombre", "Español", false);
		
		Profesor prof1 = new Profesor("Carmelo", 23, "Hombre", "Español", 1200.50f);
		
		Scanner scanner = new Scanner(System.in);		
		ConsoleInput keyboard = new ConsoleInput(scanner);
		
		System.out.println("Profesor: \n" + prof1.toString());
		System.out.println("\nAlumno: \n" + alum1.toString());
		
		System.out.println("\nIntroduce 1 para mostrar un profesor o 2 para mostrar un alumno. ");
		option = keyboard.readIntInRangeInclusive(1, 2);
		
		if (option == 1) {
			System.out.println(prof1.toString());
		}
		
		else if (option == 2) {
			System.out.println(alum1.toString());
		}
		
		
		

		
		

	}

}
