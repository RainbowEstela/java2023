package Practica5;

import java.util.Arrays;

public class Ordenacion4 {
	
	public static void rellenaArrays(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50) + 1;
		}
	}
	
	public static void mayorMenor(int[] extremos, int array[]) {
		
		Arrays.sort(array);
		extremos[0] = array[0];
		extremos[1] = array[array.length - 1];
		
	}
	
	public static double mediaVector(int[] array) {
		double media = 0;
		
		for (int i = 0; i < array.length; i++) {
			media += array[i];
		}
		
		return media / array.length;
	}
	
	public static void main(String[] args) {
		int[] vector = new int[50];
		int[] extremos = new int[2];
		
		rellenaArrays(vector);
		System.out.println(Arrays.toString(vector));
		mayorMenor(extremos, vector);
		System.out.println("El número menor es " + extremos[0] + " y el mayor es  " + extremos[1]);
		System.out.println("La media del vector es " + mediaVector(vector));

	}

}
