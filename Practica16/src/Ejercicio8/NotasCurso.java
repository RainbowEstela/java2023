/**
 * 
 */
package Ejercicio8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author user
 *
 */
public class NotasCurso {
	enum EtapaAcademica{ESO,BACHILLERATO,FPBASICA,FPMEDIO,FPSUPERIOR}
	
	private EtapaAcademica etapaAcademica;
	private String nombreCiclo;
	private int curso;
	private HashMap<String, Double> notas;//asignatura y nota
	private int anio;
	
	
	
	/**
	 * @param etapaAcademica
	 * @param nombreCiclo
	 * @param curso
	 * @param notas
	 * @param anio
	 */
	public NotasCurso(EtapaAcademica etapaAcademica, String nombreCiclo, int curso, int anio) {
		super();
		this.etapaAcademica = etapaAcademica;
		this.nombreCiclo = nombreCiclo;
		this.curso = curso;
		this.notas = new HashMap<>();
		this.anio = anio;
	}

	/**
	 * @return the etapaAcademica
	 */
	public EtapaAcademica getEtapaAcademica() {
		return etapaAcademica;
	}

	/**
	 * @param etapaAcademica the etapaAcademica to set
	 */
	public void setEtapaAcademica(EtapaAcademica etapaAcademica) {
		this.etapaAcademica = etapaAcademica;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the nombreCiclo
	 */
	public String getNombreCiclo() {
		return nombreCiclo;
	}

	/**
	 * @param nombreCiclo the nombreCiclo to set
	 */
	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, curso, etapaAcademica, nombreCiclo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		return anio == other.anio && curso == other.curso && etapaAcademica == other.etapaAcademica
				&& Objects.equals(nombreCiclo, other.nombreCiclo);
	}

	//METODOS PROPIOS
	/**
	 * añade o remplaza una asginatura con su nota
	 * @param asignatura
	 * @param nota
	 */
	public void addNota(String asignatura, Double nota) {
		notas.put(asignatura, nota);
	}
	
	/**
	 * borra una asignatura y su nota en caso que existan
	 * @param asignatura
	 */
	public void deleteNota(String asignatura) {
		notas.remove(asignatura);
	}
	
	/**
	 * 
	 * @param asignatura
	 * @return
	 */
	public Double buscarNota(String asignatura) {
		return notas.get(asignatura);
	}
	
	/**
	 * retorna un string con todas las adignaturas con sus notas
	 * @return
	 */
	public String pintarNotas() {
		StringBuilder sb = new StringBuilder();
		TreeSet<String> keysOrdenadas = new TreeSet<>(notas.keySet());
		
		
		for(String k : keysOrdenadas) {
			sb.append(k + ": " + notas.get(k) + "\n");
		}
		
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("etapaAcademica=");
		builder.append(etapaAcademica);
		builder.append(", nombreCiclo=");
		builder.append(nombreCiclo);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", anio=");
		builder.append(anio + ":\n");
		builder.append(this.pintarNotas());
		return builder.toString();
	}
	
	
}
