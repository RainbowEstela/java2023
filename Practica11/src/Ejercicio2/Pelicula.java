/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class Pelicula extends Multimedia {
	
	private int duracion;

	/**
	 * 
	 */
	public Pelicula() {
		super();
		this.duracion = 0;
	}

	/**
	 * @param codigo
	 * @param titulo
	 * @param plus
	 * @param precio
	 * @param duracion
	 */
	public Pelicula(String titulo, boolean plus, double precio, int duracion) {
		super(titulo, plus, precio);
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
