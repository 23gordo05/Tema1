package holamundo;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime la primera nota:");
		int n= sca.nextInt();
		
		System.out.println("Dime la segunda nota:");
		int m= sca.nextInt();
		
		double media = (n + m) / 2.0;
		
        System.out.println("la media es: " + media );
	}

}
