package Practica5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String cadena = "";
		String palabraBuscar = "";
		Scanner sc = new Scanner(System.in);
		/*
		nombre = nombre.replace("amiga", "AMIGA");
		nombre.toUpperCase();
		*/
		
		//pedir cadena y palabra a buscar
		try {
			System.out.println("dime una cadena de texto");
			cadena = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		try {
			System.out.println("dime una palabra del texto");
			palabraBuscar = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		
		System.out.println(cadena.replaceAll(palabraBuscar, palabraBuscar.toUpperCase()));
	}

}
