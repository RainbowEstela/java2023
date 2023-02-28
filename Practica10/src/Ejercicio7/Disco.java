/**
 * 
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Disco {
	private String titulo;
	private String fecha;
	private String grupo;
	private String discografica;
	private ArrayList<Cancion> misCanciones;
	/**
	 * @param titulo
	 * @param fecha
	 * @param grupo
	 * @param discografica
	 * @param misCanciones
	 */
	public Disco(String titulo, String fecha, String grupo, String discografica) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.grupo = grupo;
		this.discografica = discografica;
		this.misCanciones = new ArrayList<>();
	}
	
	
	
}
