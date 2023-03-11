package ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Wordle miWordle = new Wordle();
		int intentos = 1;
		boolean error = true;
		boolean ganaste = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(LocalDate.now());
		
		while (intentos <= 6 && ganaste == false) {
			
			System.out.println("introduzca su palabra, intento " + intentos);
			while (error == true) {
				try {
					ganaste = miWordle.comprobar(sc.nextLine());
					error = false;
				} catch (Exception e) {
					System.out.println("ERROR: su palabra no es de 5 caracteres, vuelva a introducir su palabra:");
				}
			}
		
			error = true;
			intentos++;
		}
		
		if (ganaste == true) {
			System.out.println("YOU WIN");
		} else {
			System.out.println("YOU LOSE");
		}
	}

}
