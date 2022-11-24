package Practica3;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * funcion que elige el mayor de dos numeros
	 */
	public static int mayorDeDos(int n1 , int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
		
	}
	
	/*
	 * funcion que elige el mayor de tres numeros
	 */
	public static int mayorDeTres(int n1, int n2, int n3) {
		return mayorDeDos(mayorDeDos(n1, n2),n3);
		
	}
	
	/*
	 * funcion que elige el mayor de 4 numeros
	 */
	public static int mayorDeCuatro(int n1, int n2, int n3, int n4) {
		return mayorDeTres( mayorDeDos(n1, n2), n3, n4 );
	}
	
	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//pedir numeros
		System.out.println("dime el primer numero");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("dime el segundo numero");
		n2 = Integer.parseInt(sc.nextLine());
		System.out.println("dime el tercer numero");
		n3 = Integer.parseInt(sc.nextLine());
		System.out.println("dime el cuarto numero");
		n4 = Integer.parseInt(sc.nextLine());
		
		//calcular el mayor de tres y el mayor de cuatro
		System.out.println("el mayor de los tres primeros numeros es " + mayorDeTres(n1, n2, n3));
		System.out.println("el mayor de todos es " + mayorDeCuatro(n1, n2, n3, n4));
	}

}
