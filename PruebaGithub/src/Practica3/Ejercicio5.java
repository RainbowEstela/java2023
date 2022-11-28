package Practica3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("dime un numero");
			try {
				numero = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("introduzca un caracter válido");
			}
			
		} while ((numero < 1) || (numero > 10));
		
		System.out.println("programa finalizado");
	}

}
