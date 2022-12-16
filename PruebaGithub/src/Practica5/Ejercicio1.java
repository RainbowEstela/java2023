package Practica5;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static String inversa(String texto) {
		String inverso = "";
		
		for (int i = texto.length() - 1; i >= 0 ; i--) {
			
			inverso += texto.charAt(i);
		}
		
		return inverso;
	}
	
	public static void main(String[] args) {
		String texto = "este texto está al reves";
		StringBuffer reverso = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		try {
				System.out.println("dime un texto");
				texto = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
		}
		
		reverso.append(texto).reverse();
		
		System.out.println("texto al reves usando String:");
		System.out.println(inversa(texto));
		System.out.println("texto al reves usando StringBuffer");
		System.out.println(reverso);

	}

}
