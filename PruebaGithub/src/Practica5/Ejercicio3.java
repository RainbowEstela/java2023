package Practica5;

import java.util.Scanner;

public class Ejercicio3 {

	public static int cuentaPalabras(String texto, String palabra) {
		int contador = 0;
		int posicion = 0;
		
		do {
			
			posicion = texto.indexOf(palabra, posicion);
			
			if (posicion >= 0) {
				
				posicion += palabra.length();
				contador++;
			}
			
		} while (posicion >= 0);
		
		return contador;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		String palabra = "";
		int veces = 0;
		
		try {
				System.out.println("dime un texto");
				texto = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
		}
		
		
		try {
				System.out.println("dime una palabra a buscar");
				palabra = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
		}
		
		veces = cuentaPalabras(texto, palabra);
		
		System.out.println("la palabra (" + palabra + ") aparece " + veces + " veces");
		
	}

}
