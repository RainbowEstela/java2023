package primeraevaulacion;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void mostrarTablero(double array[], int veces) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("porciento cara " + (i + 1) + " ");
			System.out.println(((array[i] / veces) * 100) + "%"); 
		}
	}
	
	public static void misTiros(int veces, double[] porcentaje) {
		int dado = 0;
		
		for (int i = 1; i <= veces; i++) {
			dado = (int) (Math.random() * 6) + 1;
			switch (dado) {
				case 1: {
					porcentaje[0]++;
					break;
				}
				case 2: {
					porcentaje[1]++;
					break;
				}
				case 3: {
					porcentaje[2]++;
					break;
				}
				case 4: {
					porcentaje[3]++;
					break;
				}
				case 5: {
					porcentaje[4]++;
					break;
				}
				case 6: {
					porcentaje[5]++;
					break;
				}

			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int dado1 = 0, dado2 = 0;
		int acumulador = 0;
		int tiradas = 0;
		int veces= 0;
		double[] porcientoAparicion = new double[6];
		Scanner sc = new Scanner(System.in);
		
		while ( (dado1 != 6 ) || (dado2 != 6) ) {
			dado1 = (int) (Math.random() * 6) + 1;
			dado2 = (int) (Math.random() * 6) + 1;
			System.out.println("dado 1: " + dado1 + " dado 2: " + dado2);
			
			acumulador += dado1 + dado2;
			tiradas++;
		}
		
		System.out.println("salio 6 en los dos dados en la tirada numero " + tiradas);
		System.out.println("las tiradas suman " + acumulador);
		System.out.println("---------------------");
		
		
		//pedir los valores de la funcion dados
		try {
			System.out.println("dime una cantidad de tiradas");
			veces = Integer.parseInt(sc.nextLine()) ;
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		misTiros(veces, porcientoAparicion);
		
		mostrarTablero(porcientoAparicion, veces );
	}

}
