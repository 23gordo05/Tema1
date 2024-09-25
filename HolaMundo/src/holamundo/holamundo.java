package holamundo;

import java.time.LocalTime;

public class holamundo {
	public static void main(String[] args) {
	
//		Estoy declarando la variable a 
		int a = 1;
		final double NUMERO_PI = 3.1415;
	    System.out.println("La variable a vale " + a);
		a = a + 1;
		System.out.println("La variable a vale " + a
				+ " y el número pi es " + NUMERO_PI); 
		Math.abs(a);
		LocalTime ahora = LocalTime.now();
		}
}
