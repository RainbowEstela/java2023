package Practica5;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static boolean palindromo(String palabra) {
		int mitadPalabra = palabra.length() / 2;
		String principio = palabra.substring(0, mitadPalabra);
		StringBuffer finalInverso = new StringBuffer().append(palabra.substring(palabra.length() - mitadPalabra , palabra.length())).reverse();
		
		if (principio.equals(finalInverso.toString())) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		String palabra = "";
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("dime una palabra");
			palabra = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		if (palindromo(palabra) == true) {
			System.out.println("Es una palabra palíndroma"); 
		} else {
			System.out.println("No es una palabra palíndroma");
		}
	}

}
