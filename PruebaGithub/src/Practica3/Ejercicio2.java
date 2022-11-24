package Practica3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//leer numero
		try {
			System.out.println("dime un numero");
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//comparar multiplos
		if ((numero % 2) == 0) {
			System.out.println("El numero es multiplo de 2");
		}
		
		if ((numero % 3) == 0) {
			System.out.println("El numero es multiplo de 3");
		}
		
		if ((numero % 5) == 0) {
			System.out.println("El numero es multiplo de 5");
		}
		
		if ((numero % 7) == 0) {
			System.out.println("El numero es multiplo de 7");
		}
	}

}
