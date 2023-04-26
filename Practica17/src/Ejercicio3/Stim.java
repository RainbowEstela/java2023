/**
 * 
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author user
 *
 */
public class Stim {
	private List<Juego> juegos;
	private List<Usuario> jugadores;
	
	/**
	 * Constructor
	 */
	public Stim() {
		super();
		this.juegos = new ArrayList<>();
		this.jugadores = new LinkedList<>();
	}

	/**
	 * @return the juegos
	 */
	public List<Juego> getJuegos() {
		return juegos;
	}

	/**
	 * @return the jugadores
	 */
	public List<Usuario> getJugadores() {
		return jugadores;
	}
	
	//METODOS PROPIOS
	
	/**
	 * add juego si no existe
	 * @param j
	 */
	public void addJuego(Juego j) {
		if ( !juegos.contains(j) ) {
			juegos.add(j);
		}
	
	}
	/**
	 * borra el juego si esá en la lista
	 * @param j
	 */
	public void delJuego(Juego j) {
		juegos.remove(j);
	}
	
	/**
	 * add jugador si no existe
	 * @param u
	 */
	public void addJugador(Usuario u) {
		if (!jugadores.contains(u)) {
			jugadores.add(u);
		}
	}
	
	/**
	 * pinta los usuarios de stim
	 */
	public void pintarJugador() {
		jugadores.forEach(System.out::println);
	}
	
	/**
	 * pinta los juegos de stim
	 */
	public void pintarJuegos() {
		juegos.forEach(System.out::println);
	}
	
	/**
	 * devuelve todas las puntuaciones de un juego ordenadas descendentemente
	 * @param idJuego
	 * @return
	 */
	public TreeSet<Puntuacion> obtenerPuntuaciones(int idJuego) {
		TreeSet<Puntuacion> puntuaciones = new TreeSet<>(new Comparator<Puntuacion>() {

			@Override
			public int compare(Puntuacion o1, Puntuacion o2) {
				
				return o2.getPuntos() - o1.getPuntos();
			}
		});
		
		puntuaciones.addAll(
				jugadores.stream()
					.filter( u -> u.getPuntuacion(idJuego) != null)
					.map( u -> u.getPuntuacion(idJuego) )
					.collect(Collectors.toList())
		);
		
		return puntuaciones;
	}
	
	/**
	 * pinta la puntuacion de un jugador en un juego en concreto
	 * @param idJuego
	 * @param idUsuario
	 */
	public void buscarPuntuacion(int idJuego,int idUsuario) {
		Collections.sort(jugadores);
		int indice = Collections.binarySearch(jugadores, new Usuario(idUsuario));
		if (indice >= 0) {
			System.out.println(jugadores.get(indice).getPuntuacion(idJuego).toString());
		} else {
			System.out.println("Error jugador no encontrado");
		}
	}
	
	/**
	 * pinta los rankings de todos los juegos
	 */
	public void pintarRankingJuegos() {
		for(Juego j : juegos) {
			System.out.println(j.toString());
			System.out.println("----------");
			jugadores.stream()
						.filter( u -> u.getPuntuacion(j.getId()) != null)
						.sorted( (u1, u2) -> -1 * (u1.getPuntuacion(j.getId()).getPuntos() - u2.getPuntuacion(j.getId()).getPuntos()))
						.forEach(u -> System.out.println( u.getNick() + " - " + u.getPuntuacion(j.getId()).getPuntos()));
			System.out.println("");
		}
	}
	
}
