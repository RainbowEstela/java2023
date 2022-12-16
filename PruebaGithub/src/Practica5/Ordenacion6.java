package Practica5;

import java.util.Arrays;

public class Ordenacion6 {
	
	public static void rellenaArrays(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
	}
	
	public static String noEstan(int[] array) {
		StringBuffer faltan = new StringBuffer();
		boolean esta = false;
		
		Arrays.sort(array);
		
		for (int i = 1; i <= 100; i++) {
			
			esta = false;
			
			for (int j = 0; j < array.length; j++) {
				if (i > array[j]) {
					continue;
				} else if (i == array[j]) {
					esta = true;
					continue;
				}
				
			}
			
			if (esta == false) {
				faltan.append(i + ", ");
			}
			
		}
		
		return faltan.toString();
	}
	
	public static void main(String[] args) {
		int[] arrays = new int[100];
		
		rellenaArrays(arrays);
		System.out.println(Arrays.toString(arrays));
		System.out.println(noEstan(arrays));
		

	}

}
