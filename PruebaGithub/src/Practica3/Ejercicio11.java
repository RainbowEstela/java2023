package Practica3;

import java.util.Scanner;

public class Ejercicio11 {
	public static int digitos(int num) {
		int contador = 0;
		
		while (num > 1) {
			num = num / 10;
			contador ++;
		}
		return contador;
	}
	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero para contar sus digitos");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		System.out.println(digitos(numero));

	}

}
