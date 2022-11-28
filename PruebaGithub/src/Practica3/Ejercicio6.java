package Practica3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero positivo");
		try{
			numero = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("Error: caracter no valido");
		}
		
		for(int i = 1; i <= numero; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("programa finalizado");

	}

}
