/**
 * 
 */
package Ejercicio7;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author usuario1daw
 *
 */
public class EquipoBasket {
	private HashMap<Integer, JugadorBasket> equipo;

	/**
	 * Constructor
	 */
	public EquipoBasket() {
		super();
		this.equipo = new HashMap<>();
	}
	
	/**
	 * añade un jugador con una dorsal sustiye en caso de ser dorsal repetido
	 * @param dorsal
	 * @param jugador
	 */
	public void addJugador(int dorsal, JugadorBasket jugador) {
		if(!equipo.containsKey(dorsal)) {
			equipo.put(dorsal, jugador);
		}
	}
	
	/**
	 * Devuelve un string con el equipo de basket
	 * @return
	 */
	public String mostrarEquipo() {
		StringBuilder sb = new StringBuilder();
		
		for(int i : equipo.keySet()) {
			sb.append(i + " " + equipo.get(i) + "\n");
		}
		
		return sb.toString();
	}
	
	/**
	 * borra la dorsal y el jugador si existe la dorsal
	 * @param dorsal
	 */
	public void removeJugador(int dorsal) {
		equipo.remove(dorsal);
	}
	
	/**
	 * retorna el jugador pasado si lo encuentra y null si no lo encuentra
	 * @param jugador
	 * @return
	 */
	public JugadorBasket buscarJugador(JugadorBasket jugador) {
		LinkedList<JugadorBasket> jugadores = new LinkedList<>(equipo.values());
		Collections.sort(jugadores);
		int index = Collections.binarySearch(jugadores, jugador);
		
		if (index >= 0) {
			return jugadores.get(index);
		} else {
			return null;
		}
	}
	
	/**
	 * busca y devuelve el jugador por la dorsal pasada o null si la dorsal no existe
	 * @param dorsal
	 * @return
	 */
	public JugadorBasket buscarJugador(int dorsal) {
		return equipo.get(dorsal);
	}
}
