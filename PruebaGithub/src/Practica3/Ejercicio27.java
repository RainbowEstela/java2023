package Practica3;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		int numero = 0, intentos = 0, mayor, menor;
		String estado = "";
		boolean acierto = false;
		
		Scanner sc = new Scanner(System.in);
		
		//decir un numero entre 1 y 100
		System.out.println("piensa un número entre 1 y 100");
		
		mayor = 100;
		menor = 1;
		while (acierto == false) {
			numero = (int) (Math.random() *  ( mayor + 1 - menor)) + menor;
			
			System.out.print("¿tu número es mayor, menor o igual a " + numero + "?");
			try {
				estado = sc.nextLine();
			} catch(Exception e) {
				System.out.println("Error: caracter invalido");
				continue;
			}
			
			switch (estado) {
			case "mayor": {
				menor = numero + 1;
				break;
			}
			case "menor": {
				mayor = numero - 1;
				break;
			}
			case "igual": {
				acierto = true;
				break;
			}
			default:
				System.out.println("Error: instruccion no válida");
				continue;
			}
			
			intentos++;
		}
		System.out.println("Necesité " + intentos + " intentos para acertar tu número");
	}

}
