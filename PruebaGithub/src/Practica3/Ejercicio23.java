package Practica3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		int numero = 0, entero = 0, contador = 0 , mayor = 0, menor = 900000;
		double acumulador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime la cantidad de numeros a introducir ");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("dime un numero");
			try {
				entero = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error: caracter invalido");
				continue;
			}
			
			contador++;
			acumulador += entero;
			if (mayor < entero) {
				mayor = entero;
			}
			if (menor > entero) {
				menor = entero;
			}
		}
		
		System.out.println("la media es " + (acumulador / contador ));
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);

	}

}
