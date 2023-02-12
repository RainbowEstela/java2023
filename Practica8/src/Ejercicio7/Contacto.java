/**
 * 
 */
package Ejercicio7;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Contacto {
	private String nombre;
	private String telefono;
	/**
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nombre: ");
		builder.append(nombre);
		builder.append(", telefono: ");
		builder.append(telefono);
		return builder.toString();
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	
	
	
}
