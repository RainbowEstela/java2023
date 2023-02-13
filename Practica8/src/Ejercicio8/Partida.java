/**
 * 
 */
package Ejercicio8;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Partida {
	private Jugador heroe;
	private ArrayList<Enemigo> misEnemigos;
	private int matados;
	private boolean heroeMuerto;
	/**
	 * @param heroe
	 * @param misEnemigos
	 */
	public Partida(String nombre, String clase, Arma ar) {
		super();
		this.heroe = new Jugador(nombre, clase, 3500, ar);
		this.matados = 0;
		this.heroeMuerto = false;
		this.misEnemigos = new ArrayList<>();
		iniciarPartida();
	}
	
	
	
	/**
	 * @return the matados
	 */
	public int getMatados() {
		return matados;
	}



	/**
	 * @return the heroeMuerto
	 */
	public boolean isHeroeMuerto() {
		return heroeMuerto;
	}



	private void iniciarPartida() {
		for (int i = 1; i <= 100; i++) {
			this.misEnemigos.add(new Enemigo("Slime verde", "Bestia", 50));
		}
		
	}
	
	public boolean turnoJugador() {
		int posPrimerEnemigo = this.misEnemigos.indexOf(new Enemigo("Slime verde", "Bestia", 0));
		
		if (posPrimerEnemigo != -1) {
			this.heroe.golpear(this.misEnemigos.get(posPrimerEnemigo));
			if (this.misEnemigos.get(posPrimerEnemigo).getSalud() <= 0) {
				this.misEnemigos.remove(posPrimerEnemigo);
				this.matados++;
			}
		}
		
		if(this.misEnemigos.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean turnoEnemigo() {
		int posPrimerEnemigo = this.misEnemigos.indexOf(new Enemigo("Slime verde", "Bestia", 0));
		
		if (this.heroe.getSalud() > 0) {
			this.misEnemigos.get(posPrimerEnemigo).golpear(heroe);
		}
		
		if(this.heroe.getSalud() <= 0) {
			this.heroeMuerto = true;
			return true;
		} else {
			return false;
		}
	}
}
