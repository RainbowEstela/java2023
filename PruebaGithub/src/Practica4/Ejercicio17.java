package Practica4;

import java.util.Arrays;

public class Ejercicio17 {
	public static void rellenaArrays(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) (Math.random() * 9) + 1;
			}
		}
	}
	
	public static void mostrarTablero(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " "); 
			}
			System.out.println("");
		}
	}
	
	public static int[][] definirTraspuesta(int array[][]) {
		int traspuesta[][] = new int[array[0].length][array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				traspuesta[j][i]= array[i][j]; 
			}
		}
		
		return traspuesta;
	}
	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		rellenaArrays(matriz);
		mostrarTablero(matriz);
		
		matriz = definirTraspuesta(matriz);
		
		for(int i = 0; i < matriz.length; i++) {
			Arrays.sort(matriz[i]);
		}
		
		System.out.println("-----------------");
		matriz = definirTraspuesta(matriz);
		mostrarTablero(matriz);

	}

}
