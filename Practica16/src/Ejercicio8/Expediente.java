/**
 * 
 */
package Ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

import Ejercicio8.NotasCurso.EtapaAcademica;

/**
 * @author user
 *
 */
public class Expediente implements Comparable<Expediente>{
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
	
	//Metodos propios
	
	/**
	 * Añade un objeto notas curso si no es repetido
	 * @param n
	 */
	public void addNotas(NotasCurso n) {
		this.notas.add(n);
	}
	
	/**
	 * devuelve un string con las notas del curso pasado por parametros
	 * @param curso
	 * @param etapa
	 * @param ciclo
	 * @param anio
	 * @return
	 */
	public String mostrarNotas(int curso, EtapaAcademica etapa, String ciclo, int anio) {
		//como el hashset que guarda las notas no permite obtener un valor concreto
		//habria que pasarlo a una list para poder buscar por indice
		//pero como notas curso tiene tantas variables no es posible hacer un comparador que tenga en cuenta todas las variables ya que no dejaria meter dos notasCurso del mismo año
		//asi que no puedo hacer una busqueda eficiente en este caso
		//como mucho puedo hacer una busqueda de verdadero o falso para no tener que hacer tantas busquedas si no está el notasCurso que quiero buscar
		if (this.notas.contains(new NotasCurso(etapa, ciclo, curso, anio))) {
			ArrayList<NotasCurso> n = new ArrayList<>(this.notas);
			
			for(NotasCurso nc : n) {
				if (nc.equals(new NotasCurso(etapa, ciclo, curso, anio))) {
					return nc.pintarNotas();
				}
			}
		}
		
		
		return "";
	}

	@Override
	public int compareTo(Expediente o) {
		return this.getEstudiante().getDni().compareTo(o.getEstudiante().getDni());
	}
	
	
	
}
