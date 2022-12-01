package Practica3;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		int numero = 0, numeroNuevo = 0, centena = 0, decena = 0, unidad = 0, millar = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero entero");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		millar = numero / 1000;
		centena = (numero % 1000) / 100;
		decena = ((numero % 1000) % 100) / 10;
		unidad = ((numero % 1000) % 100) % 10;
		
		if (numero < 10) {
			System.out.println("No puede ser capicua");
		} else if (numero < 100) {
			if (unidad == decena) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}

		} else if (numero < 1000) {
			if (centena == unidad) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		} else if (numero < 10000) {
			if ( (millar == unidad) && (centena == decena) ) {
				System.out.println("Es capibara");
			} else {
				System.out.println("No es capicua");
			}
		} else {
			System.out.println("Error: numero demasiado grande");
		}
		

	}

}
