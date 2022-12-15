package Practica5;

import java.util.Arrays;

public class Ordenacion3 {
	/**
	 * Rellana un array monodimensional con numeros del 1 al 100
	 * @param array
	 */
	public static void rellenaArrays(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
	}
	/**
	 * muestra por pantalla un array monodimensional
	 * @param array
	 */
	public static void mostrarTablero(int array[]) {
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " "); 
		}
		System.out.println("");
	}
	
	public static int[] sumaVectores(int[] array1,int[] array2) {
		int[] suma = new int[array1.length + array2.length];
		int aux = 0;
		
			for (int i = 0; i < array1.length; i++) {
				suma[i] = array1[i];
			}
			
			for (int j = 0; j < array2.length ; j++) {
				suma[array1.length + j] = array2[j];
			}
			
		Arrays.sort(suma);

		return suma;
	}
	
	public static void main(String[] args) {
		int[] vector1 = new int[5];
		int[] vector2 = new int[10];
		int[] total = new int[vector1.length + vector2.length];
		
		rellenaArrays(vector1);
		rellenaArrays(vector2);
		
		total = sumaVectores(vector1, vector2);
		
		mostrarTablero(total);
	}

}
