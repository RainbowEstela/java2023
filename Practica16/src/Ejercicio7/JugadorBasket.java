/**
 * 
 */
package Ejercicio7;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class JugadorBasket implements Comparable<JugadorBasket> {
	enum Posicion{BASE,ALERO,ESCOLTA,ALAPIVOT,PIVOT}
	
	private String nombre;
	private Posicion posicion;
	
	/**
	 * Constructro por defecto
	 */
	public JugadorBasket() {
		super();
		this.nombre = "";
		this.posicion = Posicion.BASE;
	}

	/**
	 * Constructor parametrizado
	 * @param nombre
	 * @param posicion
	 */
	public JugadorBasket(String nombre, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}

	/**
	 * Constructor copia
	 * @param j
	 */
	public JugadorBasket(JugadorBasket j) {
		super();
		this.nombre = j.nombre;
		this.posicion = j.posicion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the posicion
	 */
	public Posicion getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nombre);
		builder.append(" ");
		builder.append(posicion);
		return builder.toString();
	}

	@Override
	public int compareTo(JugadorBasket o) {
		return this.nombre.compareTo(o.nombre);
	}	
	
}
