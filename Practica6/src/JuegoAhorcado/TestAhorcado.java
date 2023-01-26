package JuegoAhorcado;

import java.util.Scanner;

public class TestAhorcado {

	public static void main(String[] args) {
		var juego = new Ahorcado();
		var sc = new Scanner(System.in);
		String texto = "";
		
		System.out.println("palabra a resolver: " + juego.getPalabraResolver() );
		System.out.println("palabra progreso: " + juego.getPalabraProgreso());
		
		texto = sc.nextLine();
		
		juego.resolver(texto);
		
		System.out.println(juego.getPalabraProgreso());
	}

}
