package Practica3;

import java.util.Scanner;

public class Ejercicio21 {
	public static boolean buscaPrimos(int num) {
		boolean esPrimo = true;
		for(int i = 2; i < num; i++ ) {
			if (num % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	public static void main(String[] args) {
		int num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		try {
			num1 = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter no valido");
		}
		
		if(buscaPrimos(num1) == true) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

	}

}
