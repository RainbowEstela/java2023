package Practica3;

public class Ejercicio14 {

	public static void main(String[] args) {
		int lineas = 5;
		
		for(int i = 1; i <= lineas; i++) {
			for(int j = (lineas - i); j >= 1; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}

	}

}
