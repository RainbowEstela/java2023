/**
 * 
 */
package Ejercicio3;

/**
 * @author user
 *
 */
public class Serie implements Entregable{
	private String titulo;
	private int numTemporadas;
	private String genero;
	private String creador;
	private boolean prestado;
	
	/**
	 */
	public Serie() {
		super();
		this.titulo = "";
		this.numTemporadas = 3;
		this.genero = "";
		this.creador = "";
		this.prestado = false;
	}

	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.genero = "";
		this.creador = creador;
		this.prestado = false;
	}

	/**
	 * @param titulo
	 * @param numTemporadas
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.prestado = false;
	}

	/**
	 * @param titulo
	 * @param numTemporadas
	 * @param genero
	 * @param creador
	 * @param prestado
	 */
	public Serie(Serie s) {
		super();
		this.titulo = s.titulo;
		this.numTemporadas = s.numTemporadas;
		this.genero = s.genero;
		this.creador = s.creador;
		this.prestado = s.prestado;
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
	 * @return the numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}

	/**
	 * @param numTemporadas the numTemporadas to set
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titulo=");
		builder.append(titulo);
		builder.append(", numTemporadas=");
		builder.append(numTemporadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", creador=");
		builder.append(creador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void entregar() {
		this.prestado = true;
		
	}

	@Override
	public void devolver() {
		this.prestado = false;
		
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}
	
	
	
	
	
	
}
