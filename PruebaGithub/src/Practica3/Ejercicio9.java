package Practica3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double numero = 0, acumulador = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero positivo");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		for(int i = 0; i < numero; i++) {
			acumulador = acumulador * (numero - i);
		}
		
		System.out.println("El factorial es " + acumulador);
	}

}
