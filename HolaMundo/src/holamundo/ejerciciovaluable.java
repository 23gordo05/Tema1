package holamundo;

import java.util.Scanner;

public class ejerciciovaluable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime la nota del primer examen : ");
		double n= scan.nextDouble();
		
		System.out.println("Dime la nota del segundo examen : ");
		double m= scan.nextDouble();

		System.out.println("Dime la nota del tercer examen : ");
		double l= scan.nextDouble();

		System.out.println("Dime la nota del examen final : ");
		double k= scan.nextDouble();

		System.out.println("Dime la nota del trabajo final : ");
		double j= scan.nextDouble();

		double s = n + m + l;
		
		double p = s / 3;
		
		double a  =p * 0.55;
		
        System.out.println("nota media de parciales : " + a);
		
		double ce = k * 0.3;
		
		System.out.println("nota ponderada del examen final : " + ce);
		
		double ct = j * 0.15;	
		
		System.out.println("nota ponderada del trabajo final : " + ct);
		
		double nota = a + ce + ct;
	
		System.out.println("la nota final es: " + nota);
	}

}
