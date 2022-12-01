package Practica3;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero:");
		try {
			num1 = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter no valido");
		}
		
		for(int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.println(i);
			}
		}
	}

}
