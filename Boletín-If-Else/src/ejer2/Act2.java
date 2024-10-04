package ejer2;

import java.util.Scanner;

public class Act2 {

	public static void main (String args[]) {
		
		Scanner numerosObtenidos = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Introduce un número: ");
		num1 = numerosObtenidos.nextInt();
		System.out.println("Introduce otro número: ");
		num2 = numerosObtenidos.nextInt();
		
		if (num1 != num2) {
			System.out.println("No son iguales");
		}else {
			System.out.println("Son el mismo número");
		}
		
		
		
	}
	
}
