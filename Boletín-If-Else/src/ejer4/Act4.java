package ejer4;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		Scanner numeroObtenidos = new Scanner(System.in);
		
		System.out.println("Escribe 2 números para ordenarlos de mayor a menor");
		int num1 = numeroObtenidos.nextInt();
		int num2 = numeroObtenidos.nextInt();
		
		if (num1 > num2) {
			System.out.println("Mayor -> Menor: " + num1 +", "+ num2);
		}

	}

}
