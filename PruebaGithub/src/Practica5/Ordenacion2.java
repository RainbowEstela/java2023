package Practica5;

public class Ordenacion2 {

	public static void rellenaArrays(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
	}
	
	public static void mostrarTablero(int array[]) {
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " "); 
		}
		System.out.println("");
	}
	
	public static void burbuja(int array[]) {
		int aux;
		boolean heCambiadoValores = false;
		
		for (int i = array.length; i > 0; i--) {
			heCambiadoValores = false;
			
			for (int j = 0; j < i -1; j ++) {
				if (array[j] > array [j+1]) {
					aux = array[j+1];
					array[j+1] = array[j];
					array[j] = aux;
					heCambiadoValores = true;
				}
			}
			
			if (heCambiadoValores == false) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] ordenado = new int[50];
		
		rellenaArrays(ordenado);
		burbuja(ordenado);
		mostrarTablero(ordenado);

	}

}
