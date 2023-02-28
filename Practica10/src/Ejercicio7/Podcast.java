/**
 * 
 */
package Ejercicio7;

/**
 * @author user
 *
 */
public class Podcast extends Multimedia {
	private String fecha;
	private int capitulo;
	/**
	 * @param nombre
	 * @param duracion
	 * @param year
	 * @param fecha
	 * @param capitulo
	 */
	public Podcast(String nombre, int duracion, int year, String fecha, int capitulo) {
		super(nombre, duracion, year);
		this.fecha = fecha;
		this.capitulo = capitulo;
	}
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo: " + this.nombre + " en " + this.fecha + ", Capitulo: " + this.capitulo);
	}
	
	
}
