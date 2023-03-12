/**
 * 
 */
package Ejercicio2;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Episodio {
	private String titulo;
	private int minutos;
	private Temporada temporada;
	/**
	 */
	public Episodio() {
		super();
		this.titulo = "";
		this.minutos = 0;
	}
	
	/**
	 * @param titulo
	 * @param minutos
	 * @param temporada
	 */
	public Episodio(String titulo, int minutos) {
		super();
		this.titulo = titulo;
		this.minutos = minutos;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the temporada
	 */
	public Temporada getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(minutos, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Episodio other = (Episodio) obj;
		return minutos == other.minutos && Objects.equals(titulo, other.titulo);
	}
	
	
}
