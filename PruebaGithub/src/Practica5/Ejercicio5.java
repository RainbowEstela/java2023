package Practica5;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * devuelve la cantidad de espacios en una cadena de texto
	 */
	public static int cuentaEspacios(String cadena) {
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				contador++;
			}
		}
		
		return contador;
	}
	
	/*
	 * devuelve la cantidad de vocales en una cadena de texto
	 */
	public static int cuentaVocales(String cadena) {
		int contador = 0;
		String vocales = "aeiouAEIOU";
		
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (cadena.charAt(i) == vocales.charAt(j)) {
					contador++;
				}
			}
		}
	
		return contador;
	}
	/*
	 * 
	 */
	public static int cuentaConsonantes(String cadena) {
		int contador = 0;
		String consonantes = "bdfghjklmnñpqrstuvwxyz";
		
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < consonantes.length(); j++) {
				if ((cadena.charAt(i) == consonantes.charAt(j)) || (cadena.charAt(i) == consonantes.toUpperCase().charAt(j))) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	public static void main(String[] args) {
		String cadena = "";
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("dime una cadena de texto");
			cadena = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		int espacios = cuentaEspacios(cadena);
		
		int vocales = cuentaVocales(cadena);
		
		int consonantes = cuentaConsonantes(cadena);
		
		
		System.out.println(espacios);
		System.out.println(vocales);
		System.out.println(consonantes);
	}

}
