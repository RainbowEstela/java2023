package Practica3;

import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, aux = 0;
		Scanner sc = new Scanner(System.in);
		
		//pedir los numeros
		System.out.println("Dime un primer numero positivo");
		try {
			num1 = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter no válido");
		}
		if (num1 < 0) {
			num1 *= -1;
		}
		System.out.println("Dime un segundo numero positivo");
		try {
			num2 = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter no válido");
		}
		if (num2 < 0) {
			num2 *= -1;
		}
		
		//ordenar los dos numeros
		if (num2 < num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		for(int i = num1; i <= num2; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
