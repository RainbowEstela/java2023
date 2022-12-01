package Practica3;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		int num1 = -1, mayor = 0;
		Scanner sc = new Scanner(System.in);
		
		while (num1 != 0) {
			System.out.println("Escribe un numero");
			try {
				num1 = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error: caracter no valido");
			}
			
			if (num1 > mayor) {
				mayor = num1;
			}
		}
		System.out.println("El numero mayor introducido es " + mayor);
	}

}
