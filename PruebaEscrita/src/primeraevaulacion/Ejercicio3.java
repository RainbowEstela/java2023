package primeraevaulacion;

import java.util.Arrays;

public class Ejercicio3 {

	public static void rellenar(int array[], int valor) {
		for (int i = 0; i < array.length; i++) {
			array[i] = valor;
		}
	}
	
	public static void ordenar(int array[]) {
		int aux;
		
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i -1; j ++) {
				if (array[j] > array [j+1]) {
					aux = array[j+1];
					array[j+1] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	public static String pintar(int array[]) {
		StringBuffer vector = new StringBuffer();
		
		vector.append("[");
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				vector.append(array[i]);
			} else {
				vector.append(array[i] + ", ");
			}
		}
		
		vector.append("]");
		
		return vector.toString();
	}
	
	public static void main(String[] args) {
		int[] vector = new int[50];
		int[] copia = new int[50];
		
		Arrays.fill(vector, 100);
		System.out.println(Arrays.toString(vector));
		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
		for (int i = 0; i <= vector.length; i++) {
			copia = Arrays.copyOf(vector, i);
		}
		System.out.println(Arrays.toString(copia));
		
		rellenar(vector, 6);
		System.out.println(pintar(vector));
		vector[1] = 100;
		ordenar(vector);
		System.out.println(pintar(vector));
		
		
	}

}
