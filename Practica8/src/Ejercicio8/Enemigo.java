/**
 * 
 */
package Ejercicio8;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Enemigo {
	private String nombre;
	private String clase;
	private int salud;
	/**
	 * @param nombre
	 * @param clase
	 * @param salud
	 */
	public Enemigo(String nombre, String clase, int salud) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.salud = salud;
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
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	
	public void quitarVida(int cantidad) {
		this.salud -= cantidad;
	}
	
	public void golpear(Jugador jugador) {
		jugador.setSalud(jugador.getSalud() - 30);
	}
	@Override
	public int hashCode() {
		return Objects.hash(clase, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enemigo other = (Enemigo) obj;
		return Objects.equals(clase, other.clase) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
