package Practica3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//pedir un digito
		System.out.println("dime un numero de un digito");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("no introdujo un numero valido");
		}
		
		if ((numero < 1) || (numero > 9)) {
			System.out.println("Error no es un numero de un digito");
		} else {
			switch (numero) {
				case 1: {
					System.out.println("uno");
					break;
				}
				case 2: {
					System.out.println("dos");
					break;
				}
				case 3: {
					System.out.println("tres");
					break;
				}
				case 4: {
					System.out.println("cuatro");
					break;
				}
				case 5: {
					System.out.println("cinco");
					break;
				}
				case 6: {
					System.out.println("seis");
					break;
				}
				case 7: {
					System.out.println("siete");
					break;
				}
				case 8: {
					System.out.println("ocho");
					break;
				}
				case 9: {
					System.out.println("nueve");
					break;
				}
			}
		}
	}

}
