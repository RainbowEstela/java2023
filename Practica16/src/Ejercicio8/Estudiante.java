/**
 * 
 */
package Ejercicio8;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author user
 *
 */
public class Estudiante {
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fNacimiento;
	private String direccion;
	private String localidad;
	private String email;
	private String telefono;
	
	/**
	 * Constuctor
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param fNacimiento
	 * @param direccion
	 * @param localidad
	 * @param email
	 * @param telefono
	 */
	public Estudiante(String dni, String nombre, String apellidos, LocalDate fNacimiento, String direccion,
			String localidad, String email, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNacimiento = fNacimiento;
		this.direccion = direccion;
		this.localidad = localidad;
		this.email = email;
		this.telefono = telefono;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fNacimiento
	 */
	public LocalDate getfNacimiento() {
		return fNacimiento;
	}

	/**
	 * @param fNacimiento the fNacimiento to set
	 */
	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fNacimiento=");
		builder.append(fNacimiento);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefono=");
		builder.append(telefono);
		return builder.toString();
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
		Estudiante other = (Estudiante) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
}
