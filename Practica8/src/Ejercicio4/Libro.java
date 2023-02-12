/**
 * 
 */
package Ejercicio4;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPag;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;
	
	/**
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numPag
	 */
	public Libro(String isbn, String titulo, String autor, int numPag) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.precioCompra = 0;
		this.precioVenta = 0;
		this.vendido = false;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numPag
	 */
	public int getNumPag() {
		return numPag;
	}

	/**
	 * @param numPag the numPag to set
	 */
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}

	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	/**
	 * to string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("El libro ");
		builder.append(this.titulo);
		builder.append(" del autor ");
		builder.append(this.autor);
		builder.append(" tiene ");
		builder.append(numPag);
		builder.append(" paginas.");
	
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, vendido);
	}

	/**
	 * metodo equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn) && vendido == other.vendido;
	}
	
	
}
