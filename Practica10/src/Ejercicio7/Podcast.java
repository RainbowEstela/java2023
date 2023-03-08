/**
 * 
 */
package Ejercicio7;

import java.time.LocalDate;

/**
 * @author user
 *
 */
public class Podcast extends Multimedia {
	private LocalDate fecha;
	private int capitulo;
	/**
	 * @param nombre
	 * @param duracion
	 * @param year
	 * @param fecha
	 * @param capitulo
	 */
	public Podcast(String nombre, int duracion, int year, LocalDate fecha, int capitulo) {
		super(nombre, duracion, year);
		this.fecha = fecha;
		this.capitulo = capitulo;
	}
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo: " + this.nombre + " en " + this.fecha + ", Capitulo: " + this.capitulo);
	}
	
	
}
