package ejer1;

import java.util.Scanner;

public class Act1 {

	public static void main (String args[]) {
		
		Scanner lectorNumeros = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		
		int numeroObtenido = lectorNumeros.nextInt();
		
		if (numeroObtenido % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
	}
}
