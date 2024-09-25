package holamundo;

import java.util.Scanner;

class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime tu edad por favor: ");
		int edad = sca.nextInt();
		edad++;
 
		System.out.println("su edad dentro de un año es: " + edad + " años" );
	}

}
