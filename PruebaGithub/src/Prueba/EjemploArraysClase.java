package Prueba;

import java.util.Scanner;
public class EjemploArraysClase {

	public static void main(String[] args) {
		int mayor , posicion, acumulador;
		int array[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("dime entero para posicion " + i);
			try {
				array[i] = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Dato erroneo");
				array[i] = 0;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("");
		
		acumulador = 0;
		mayor = array[1];
		posicion = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
				posicion = i;
			}
			acumulador += array[i];
		}
		System.out.println("el mayor es el " + mayor + " y esta en la posicion " + posicion);
		System.out.println("suman " + acumulador);
		
	} 

}
