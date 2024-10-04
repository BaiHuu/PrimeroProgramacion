package ejer3;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		
		Scanner numeroObtenido = new Scanner(System.in);
		System.out.println("Escribe un número casi cero");
		double numeroDecimal = numeroObtenido.nextDouble();
		
		
		if (numeroDecimal > -1 && numeroDecimal < 1) {
				System.out.println("El numero es casi 0");
		}
		if (numeroDecimal == 0) {
				System.out.println("El numero es 0");
			
		}

	}

}
