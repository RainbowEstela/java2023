package Prueba;

public class Ejemploarryas3 {
	public static void pintaVector(int vector[]) {
		for(int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int array[] = new int[15];
		int acumulador = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 100) + 1;
			if (array[i] % 2 != 0) {
				acumulador += array[i];
			}
			
		}
		pintaVector(array);
		System.out.println(acumulador);
	}

}
