package Practica4;

import java.util.Scanner;

public class Ejercicio21 {
	/*
	 * crea un tablero
	 */
	public static void crearTablero(char array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = '*';
			}
		}
	}
	
	/*
	 * muestra el tablero
	 */
	public static void mostrarTablero(char array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " "); 
			}
			System.out.println("");
		}
	}
	
	/*
	 * comprueba que la posion es valida
	 */
	public static boolean esPosicionValida(char array[][], int fila, int columna) {
		boolean valida = false;
		
		if (array[fila][columna] == '*') {
			valida = true;
		}
		
		return valida;
	}
	
	/*
	 * 
	 */
	public static void pintarX(char array[][]) {
		
	}
	
	/*
	 * turno del jugador x
	 */
	public static void turnoX(char array[][]) {
		boolean valida = false;
		int fila;
		int columna;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Turno X");
			System.out.print("fila: ");
			fila = Integer.parseInt(sc.nextLine());
			
			System.out.print("columna: ");
			columna = Integer.parseInt(sc.nextLine());
			
			valida = esPosicionValida(array, fila, columna);
			
			
			
		} while (valida == false);
	}
	public static void main(String[] args) {
		char tablero[][] = new char[3][3];
		
		crearTablero(tablero);
		mostrarTablero(tablero);
	}

}
