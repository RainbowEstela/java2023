package Ejercicio9;

public class Test {

	public static void main(String[] args) {
		Jugador player = new Jugador("Estela", "Dark knight", 68);
		Enemigo ene1 = new Enemigo("Spriggan", "monstruo", 40);
		Enemigo ene2 = new Enemigo("Ultima weapon", "boss", 120);
		
		ene2.subirNivel();
		ene2.subirNivel();
		ene2.subirNivel();
		ene2.subirNivel();
		
		player.subirNivel();
		player.subirNivel();
		
		player.golpear(ene1);
		ene1.golpear(player);
		player.golpear(ene1);
		
		player.subirNivel();
		
		ene2.golpear(player);
		
		

	}

}
