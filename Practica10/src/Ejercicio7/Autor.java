/**
 * 
 */
package Ejercicio7;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Autor {
	private String nombre;
	private String informacion;
	/**
	 * @param nombre
	 * @param informacion
	 */
	public Autor(String nombre, String informacion) {
		super();
		this.nombre = nombre;
		this.informacion = informacion;
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
	 * @return the informacion
	 */
	public String getInformacion() {
		return informacion;
	}
	/**
	 * @param informacion the informacion to set
	 */
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", informacion=");
		builder.append(informacion);
		builder.append("]");
		return builder.toString();
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
		Autor other = (Autor) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
