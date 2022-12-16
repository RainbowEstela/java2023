package Practica5;

import java.util.Arrays;

public class Ordenacion5 {

	public static void rellenaArrays(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000) + 1;
		}
	}
	
	public static void diezMayores(int[] vector, int[] mayores) {
		Arrays.sort(vector);
		
		for (int i = 0; i < mayores.length; i++) {
			mayores[i] = vector[vector.length - 1 - i];
		}
		
	}
	
	public static void main(String[] args) {
		int[] vector = new int[50];
		int[] mayores = new int[10];
		
		rellenaArrays(vector);
		diezMayores(vector, mayores);
		
		System.out.println(Arrays.toString(vector));
		System.out.println("Los diez mayores valores son: " + Arrays.toString(mayores));

	}

}
