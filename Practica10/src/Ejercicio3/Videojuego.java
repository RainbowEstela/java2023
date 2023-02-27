/**
 * 
 */
package Ejercicio3;

/**
 * @author user
 *
 */
public class Videojuego implements Entregable {
	private String titulo;
	private int horasEstimadas;
	private String genero;
	private String desarrollador;
	private boolean prestado;
	/**
	 */
	public Videojuego() {
		super();
		this.titulo = "";
		this.horasEstimadas = 100;
		this.genero = "";
		this.desarrollador = "";
		this.prestado = false;
	}
	/**
	 * @param titulo
	 * @param horasEstimadas
	 */
	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.desarrollador = "";
		this.prestado = false;
	}
	/**
	 * @param titulo
	 * @param horasEstimadas
	 * @param genero
	 * @param desarrollador
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String desarrollador) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = false;
	}
	/**
	 * @param titulo
	 * @param horasEstimadas
	 * @param genero
	 * @param desarrollador
	 * @param prestado
	 */
	public Videojuego(Videojuego v) {
		super();
		this.titulo = v.titulo;
		this.horasEstimadas = v.horasEstimadas;
		this.genero = v.genero;
		this.desarrollador = v.desarrollador;
		this.prestado = v.prestado;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Videojuego [titulo=");
		builder.append(titulo);
		builder.append(", horasEstimadas=");
		builder.append(horasEstimadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", desarrollador=");
		builder.append(desarrollador);
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
