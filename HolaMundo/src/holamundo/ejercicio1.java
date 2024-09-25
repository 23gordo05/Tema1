package holamundo;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		String nombre =scanner.next();
		
		System.out.println("Buenas tardes " + nombre);
	}

}
