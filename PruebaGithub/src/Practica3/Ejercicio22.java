package Practica3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		int num1 = 0, mayor = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		try {
			num1 = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter no valido");
		}
		
		for(int i = (num1 - 1); i >= 2; i--) {
			if (num1 % i == 0) {
				mayor = i;
				break;
			}
		}
		
		System.out.println(mayor);
	}

}
