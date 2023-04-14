/**
 * 
 */
package Ejercicio7;

import java.util.TreeMap;

/**
 * @author user
 *
 */
public class Liga {
	private TreeMap<String, EquipoBasket> competidores;

	/**
	 * Constructor
	 */
	public Liga() {
		super();
		this.competidores = new TreeMap<>();
	}
	
	/**
	 * retorna un string con todos los equipos y sus respectivos jugadores
	 * @return
	 */
	public String mostrarEquipo() {
		StringBuilder sb = new StringBuilder();
		
		for(String k : competidores.keySet()) {
			sb.append(k + "\n");
			sb.append("---------\n");
			sb.append(competidores.get(k).mostrarEquipo());
		}
		
		return sb.toString();
	}
	
	/**
	 * añade o remplaza un equipo dado su nombre y el equipo
	 * @param nombre
	 * @param equipo
	 */
	public void addEquipo(String nombre, EquipoBasket equipo) {
		competidores.put(nombre, equipo);
	}
	
	/**
	 * borra el equipo del mapa si está presente
	 * @param nombre
	 */
	public void removeEquipo(String nombre) {
		competidores.remove(nombre);
	}
	
	/**
	 * Busca y retorna un equipo de basket, retorna null si no existe
	 * @param nombre
	 * @return
	 */
	public EquipoBasket buscarEquipo(String nombre) {
		return competidores.get(nombre); 
	}
}
