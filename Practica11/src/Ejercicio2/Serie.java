/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Serie extends Multimedia {
	private ArrayList<Temporada> temporadas;

	/**
	 * 
	 */
	public Serie() {
		super();
		this.temporadas = new ArrayList<>();
	}

	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 */
	public Serie(String titulo, boolean plus, double precio) {
		super(titulo, plus, precio);
		this.temporadas = new ArrayList<>();
	}

	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", temporadas=");
		builder.append(temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	public int getNumeroTemporadas() {
		return this.temporadas.size();
	}
	
	public void addTemporada(Temporada temp) {
		int indece = this.temporadas.indexOf(temp);
		if(indece == -1) {
			this.temporadas.add(temp);
			temp.setSerie(this);
		}
	}
	
	public void delTemporada(Temporada temp) {
		this.temporadas.get(this.temporadas.indexOf(temp)).setSerie(null);
		this.temporadas.remove(temp);
	}
}
