package Practica4;

public class Ejercicio23 {
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
		int matriz[][] = new int[5][3];
		int trasp[][] = new int[3][5];
		System.out.println("matriz A");
		rellenaArrays(matriz);
		mostrarTablero(matriz);
		System.out.println("matriz traspuesta de A");
		trasp = definirTraspuesta(matriz);
		mostrarTablero(trasp);
	}

}
