package primeraevaulacion;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static String remplazo(String cadena, String letra) {
		StringBuffer almacen = new StringBuffer();
		String vocales = "aeiou";
		boolean vocal = false;
		boolean mayuscula = false;
		
		for (int i = 0; i < cadena.length(); i++) {
			mayuscula = false;
			vocal = false;
			for (int j = 0; j < vocales.length(); j++) {
					
					if (cadena.charAt(i) == vocales.charAt(j)) {
						vocal = true;
					} else if (cadena.charAt(i) == vocales.toUpperCase().charAt(j)) {
						mayuscula = true;
					}
				}
			
			if (vocal == true) {
				almacen.append(letra);
			} else if (mayuscula == true) {
				almacen.append(letra.toUpperCase());
			} else {
				almacen.append(cadena.charAt(i));
			}
			
		}

		
	
			
		return almacen.toString();
	}
	
	public static void main(String[] args) {
		String cadena = "";
		String letra = "";
		String cambiado = "";
		Scanner sc = new Scanner(System.in);
		
		//pedir una letra
		do {
			try {
				System.out.println("dime una letra");
				letra = sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getCause());
			}
	} while ((letra.charAt(0) != 'a') && (letra.charAt(0) != 'e') && (letra.charAt(0) != 'i') && (letra.charAt(0) != 'o') && (letra.charAt(0) != 'u') || (letra.length() !=1) );
		
		//pedir una cadena
		try {
			System.out.println("dime una cadena de texto");
			cadena = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		cambiado = remplazo(cadena, letra);
		System.out.println(cambiado);
	}

}
