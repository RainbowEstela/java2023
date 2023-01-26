package JuegoAhorcado;

import java.util.Scanner;

public class TestAhorcado {

	public static void pintarAhorcado(int fallos) {
		switch (fallos) {
			case 0: {
				System.out.println("------****");
				System.out.println("|*********");
				System.out.println("|*********");
				System.out.println("|*********");
				System.out.println("|*********");
				System.out.println("----------");
				break;
			}
			case 1: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|*********");
				System.out.println("|*********");
				System.out.println("|*********");
				System.out.println("----------");
				break;
			}
			case 2: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|****o****");
				System.out.println("|*********");
				System.out.println("|*********");
				System.out.println("----------");
				break;
			}
			case 3: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|****o****");
				System.out.println("|****|****");
				System.out.println("|*********");
				System.out.println("----------");
				break;
			}
			case 4: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|****o****");
				System.out.println("|****|\\***");
				System.out.println("|*********");
				System.out.println("----------");
				break;
			}
			case 5: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|****o****");
				System.out.println("|***/|\\***");
				System.out.println("|*********");
				System.out.println("----------");
				break;
			}
			case 6: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|****o****");
				System.out.println("|***/|\\***");
				System.out.println("|*****\\***");
				System.out.println("----------");
				break;
			}
			case 7: {
				System.out.println("------****");
				System.out.println("|****|****");
				System.out.println("|****o****");
				System.out.println("|***/|\\***");
				System.out.println("|***/*\\***");
				System.out.println("----------");
				break;
			}

		}
	}

	public static void main(String[] args) {
		var juego = new Ahorcado();
		var sc = new Scanner(System.in);
		int fallos = 0;
		String texto = "";
		
		System.out.println("instrucciones: escribe una letra para buscarla o escribe una palabra para intentar resolver.");
		while((fallos < 7) && (juego.hasGanado() == false) ) {
			pintarAhorcado(fallos);
			System.out.println("adivina la palabra: " + juego.getPalabraProgreso());
			texto = sc.nextLine();
			fallos = juego.intento(texto);
			
		}

		if (juego.hasGanado() == true) {
			System.out.println("ganaste la palabra era " + juego.getPalabraResolver());
		} else {
			pintarAhorcado(fallos);
			System.out.println("perdiste la palabra correcta era " + juego.getPalabraResolver());
		}
		
	}

}
