package Practica3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + (numero * i));
		}
	}

}
