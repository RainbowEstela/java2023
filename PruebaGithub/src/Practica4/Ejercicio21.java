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
	 * turno del jugador
	 */
	public static void turno(char array[][],char letra) {
		boolean valida = false;
		int fila;
		int columna;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Turno: " + letra);
			System.out.print("fila: ");
			fila = Integer.parseInt(sc.nextLine());
			
			System.out.print("columna: ");
			columna = Integer.parseInt(sc.nextLine());
			
			valida = esPosicionValida(array, fila, columna);
			
			if (valida == true) {
				array[fila][columna] = letra;
			} else {
				System.out.println("casilla ocupada");
			}
			
			
		} while (valida == false);
	}
	
	/*
	 * comprueba si una fila es del mismo caracter
	 */
	public static boolean rayaHorizontal(char array[][], char letra) {
		boolean hayRaya = false;
		int contador;
		
		for (int i = 0; i < array.length; i++) {
			
			contador = 0;
			
			for (int j = 0; j < (array[0].length); j++) {
				if (array[i][j] == letra) {
					contador++;
				}
			}
			
			if (contador == array[0].length) {
				hayRaya = true;
				break;
			}
			
		}
		
		return hayRaya;
	}
	
	/*
	 * detecta si hay raya horizontal
	 */
	public static boolean rayaVertical(char array[][], char letra) {
		boolean hayRaya = false;
		int contador;
		
		for (int i = 0; i < (array[0].length); i++) {
			
			contador = 0;
			
			for (int j = 0; j < array.length; j++) {
				if (array[j][i] == letra) {
					contador++;
				}
			}
			
			if (contador == array.length) {
				hayRaya = true;
				break;
			}
			
		}
		
		return hayRaya;
	}
	
	/*
	 * 
	 */
	public static boolean hayRayaDiagonalDescendente(char array[][], char letra) {
		boolean hayRaya = false;
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i][i] == letra) {
				contador++;
			}
		}
		
		if (contador == array.length) {
			hayRaya = true;
		}
		
		return hayRaya;
	}
	
	public static boolean hayRayaDiagonalAscendente(char array[][], char letra) {
		boolean hayRaya = false;
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
				if (array[i][array[0].length - i -1] == letra) {
					contador++;
			}
		}
		
		if (contador == array.length) {
			hayRaya = true;
		}
		
		return hayRaya;
	}
	
	/*
	 * comprueba si hay una linea
	 */
	public static boolean hayRaya(char array[][], char letra) {
		boolean hayRaya = false;
		
		if ((rayaHorizontal(array, letra) == true) || (rayaVertical(array, letra) == true) || (hayRayaDiagonalDescendente(array, letra) == true) || (hayRayaDiagonalAscendente(array, letra) == true) ) {
			hayRaya = true;
		}
		
		return hayRaya;
	}
	
	public static boolean tableroLleno(char array[][]) {
		boolean lleno = true;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == '*') {
					lleno = false;
					break;
				}
			}
			
			if (lleno == false) {
				break;
			}
		}
		
		return lleno;
	}
	
	public static void main(String[] args) {
		char tablero[][] = new char[3][3];
		char letra = '\0';
		
		crearTablero(tablero);
		mostrarTablero(tablero);
		
		do {
			letra = 'X';
			turno(tablero, letra);
			mostrarTablero(tablero);
			
			if (hayRaya(tablero, letra) == true) {
				System.out.println("jugador X gana");
				break;
			}
			
			letra = 'O';
			turno(tablero, letra);
			mostrarTablero(tablero);
			
			if (hayRaya(tablero, letra) == true) {
				System.out.println("jugador O gana");
				break;
			}
			
			
		}while (tableroLleno(tablero) == false);
		
		System.out.println("Empate");
	}

}
