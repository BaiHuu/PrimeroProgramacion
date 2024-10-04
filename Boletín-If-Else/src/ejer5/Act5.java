package ejer5;

import java.util.Scanner;

public class Act5 {
	
	public static void main(String[] args) {
		Scanner numeroObtenidos = new Scanner(System.in);
		
		System.out.println("Escribe 3 números para ordenarlos de mayor a menor");
		int num1 = numeroObtenidos.nextInt();
		int num2 = numeroObtenidos.nextInt();
		int num3 = numeroObtenidos.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("Mayor -> Menor: " + num1 +", "+ num2 + ", "+ num3);
		}else if (num1 > num3 && num3 > num2) {
			System.out.println("Mayor -> Menor: " + num1 +", "+ num3 + ", "+ num2);
		}else if (num2 > num1 && num1 > num3) {
			System.out.println("Mayor -> Menor: " + num2 +", "+ num1 + ", "+ num3);
		}else if (num3 > num2 && num2 > num1) {
			System.out.println("Mayor -> Menor: " + num3 +", "+ num2 + ", "+ num1);
		}else if (num3 > num1 && num1 > num2) {
			System.out.println("Mayor -> Menor: " + num3 +", "+ num1 + ", "+ num2);
		}else if (num2 > num1 && num1 > num3) {
			System.out.println("Mayor -> Menor: " + num1 +", "+ num3 + ", "+ num2);
		}else if (num2 > num1 && num1 > num3) {
			System.out.println("Mayor -> Menor: " + num2 +", "+ num1 + ", "+ num3);
		}else if (num2 > num3 && num3 > num1) {
			System.out.println("Mayor -> Menor: " + num2 +", "+ num3 + ", "+ num1);
		}
  
	}

}
