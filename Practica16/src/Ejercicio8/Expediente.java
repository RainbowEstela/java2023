/**
 * 
 */
package Ejercicio8;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author user
 *
 */
public class Expediente {
	private Estudiante estudiante;
	private HashSet<NotasCurso> notas;
	private boolean activo;
	
	/**
	 * Constructor
	 * @param estudiante
	 * @param activo
	 */
	public Expediente(Estudiante estudiante, boolean activo) {
		super();
		this.estudiante = estudiante;
		this.notas = new HashSet<NotasCurso>();
		this.activo = activo;
	}

	/**
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/**
	 * @return the notas
	 */
	public HashSet<NotasCurso> getNotas() {
		return notas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estudiante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(estudiante, other.estudiante);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Estudiante: " + estudiante.toString() + "\n");
		builder.append("Activo: ");
		builder.append(activo);
		builder.append(notas);
		
		return builder.toString();
	}
	
	
	
}
