/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author user
 *
 */
public class Temporada {
	private int numero;
	private ArrayList<Episodio> episodios;
	private Serie serie;
	
	/**
	 * @param numero
	 * @param episodios
	 * @param serie
	 */
	public Temporada() {
		super();
		this.numero = 0;
		this.episodios = new ArrayList<>();
	}

	/**
	 * @param numero
	 * @param episodios
	 * @param serie
	 */
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}

	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}

	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}

	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public int getNumeroEpisodios() {
		return this.episodios.size();
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append(", serie=");
		builder.append(serie.getTitulo());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(episodios, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporada other = (Temporada) obj;
		return Objects.equals(episodios, other.episodios) && numero == other.numero;
	}
 	
	public void addEpisodio(Episodio episodio) {
		int indece = this.episodios.indexOf(episodio);
		if(indece == -1) {
			this.episodios.add(episodio);
			episodio.setTemporada(this);
		}
	}
	
	public void delEpisodio(Episodio episodio) {
		this.episodios.get(this.episodios.indexOf(episodio)).setTemporada(null);
		this.episodios.remove(episodio);
	}
	
	
}
