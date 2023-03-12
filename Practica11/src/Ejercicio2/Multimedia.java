/**
 * 
 */
package Ejercicio2;

import java.util.Objects;

/**
 * @author user
 *
 */
public abstract class Multimedia {
	protected static long autoIncremento = 1;
	
	protected long codigo;
	protected String titulo;
	protected boolean plus;
	protected double precio;
	
	/**
	 */
	public Multimedia() {
		super();
		this.codigo = autoIncremento;
		autoIncremento++;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
	}

	/**
	 * @param codigo
	 * @param titulo
	 * @param plus
	 * @param precio
	 */
	public Multimedia( String titulo, boolean plus, double precio) {
		super();
		this.codigo = autoIncremento;
		autoIncremento++;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
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
	 * @return the plus
	 */
	public boolean isPlus() {
		return plus;
	}

	/**
	 * @param plus the plus to set
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}
	
	
}
