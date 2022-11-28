package Practica3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero positivo");
		try {
			numero = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("D: (" + i + " * 2) = "+ (i*2) + " T: (" + i + " * 3) = " + (i*3));
		}

	}

}
