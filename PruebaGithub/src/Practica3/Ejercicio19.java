package Practica3;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		int num1 = -2, contador = 0;
		double acumulador = 0;
		Scanner sc = new Scanner(System.in);
		
		while (num1 != -1) {
			System.out.println("Escribe un numero");
			try {
				num1 = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error: caracter no valido");
				continue;
			}
			
			if (num1 != -1) {
				contador++;
				acumulador += num1;
			}
		}
		
		System.out.println("La media es " + (acumulador / contador));
	}

}
