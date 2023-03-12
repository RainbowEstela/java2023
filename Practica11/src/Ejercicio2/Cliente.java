/**
 * 
 */
package Ejercicio2;

import java.util.Objects;

/**
 * @author user
 *
 */
public abstract class Cliente {
	protected String dni;
	protected String nombre;
	protected String email;
	protected double precioMensual;
	
	/**
	 */
	public Cliente() {
		super();
		this.dni = "";
		this.nombre = "";
		this.email = "";
		this.precioMensual = 0;
	}
	
	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public Cliente(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.precioMensual = 0;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", precioMensual=");
		builder.append(precioMensual);
		builder.append("]");
		return builder.toString();
	}

	public abstract boolean esPro();
	
	public abstract double getPrecioMensual();
	
	
	
}
