/**
 * 
 */
package Ejercicio2;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Genero {
	private static int autoincremental = 1;
	
	private int id;
	private String nombre;
	
	
	/**
	 *Constructor por defecto
	 *no aumenta el autoincremento de las ids
	 *puede usarse para buscar otros objetos genero 
	 */
	public Genero() {
		super();
		this.id = 0;
		this.nombre = "";
	}


	/**
	 * Constructor parametrizado
	 * @param nombre
	 */
	public Genero(String nombre) {
		super();
		this.id = autoincremental;
		autoincremental++;
		this.nombre = nombre;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Genero [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return id == other.id;
	}
}
