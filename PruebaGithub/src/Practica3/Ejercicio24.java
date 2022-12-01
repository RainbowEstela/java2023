package Practica3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		int numero = 0, numeroNuevo = 0, centena = 0, decena = 0, unidad = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero entero");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error: caracter invalido");
		}
		
		centena = numero / 100;
		decena = (numero % 100) / 10;
		unidad = (numero % 100) % 10;
		
		if (numero < 10) {
			System.out.println(numero);
		} else if (numero < 100) {
			numeroNuevo = (unidad * 10) + decena;
			System.out.println(numeroNuevo);
		} else if (numero < 1000) {
			numeroNuevo = (unidad * 100) + (decena * 10) + centena;
			System.out.println(numeroNuevo);
		} else {
			System.out.println("Error: numero demasiado grande");
		}
		

	}

}
