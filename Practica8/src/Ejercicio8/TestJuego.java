package Ejercicio8;

public class TestJuego {

	public static void main(String[] args) {
		var par = new Partida("Estela", "dark Knight", new Arma("Mandoble", 25, 100));//el jugador tiene 3500 de vida
		boolean finPartida = false;
		int turno = 1;
		
		while (finPartida == false && turno <= 50) {
			
			finPartida = par.turnoJugador();
			
			if (finPartida == false) {
				finPartida = par.turnoEnemigo();
			}
			
			turno++;
		}
		
		if (par.isHeroeMuerto() == false) {
			System.out.println("El heroe sobrevivió el combate");
		} else {
			System.out.println("DERROTA");
		}
			
		System.out.println("Enemigos matados: " + par.getMatados());
	}

}
