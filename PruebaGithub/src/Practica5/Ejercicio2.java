package Practica5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String palabra = "";
		StringBuffer reflejo = new StringBuffer();
		StringBuffer espejo = new StringBuffer();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("dime una palabra");
			palabra = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		
		reflejo.append(palabra);
		espejo.append(palabra.substring(0, palabra.length() -1) + reflejo.reverse());
		
		System.out.println(espejo);
	}

}
