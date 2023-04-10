/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author user
 *
 */
public abstract class Publicacion implements Prestable, Comparable<Publicacion> {
	protected String isbn;
	protected String titulo;
	protected int year;
	protected int paginas;
	protected boolean prestado;
	protected TreeSet<Autor> misAutores;
	
	/**
	 */
	public Publicacion() {
		super();
		this.isbn = "";
		this.titulo = "";
		this.year = 0;
		this.paginas = 0;
		this.prestado = false;
		this.misAutores = new TreeSet<>();
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 */
	public Publicacion(String isbn, String titulo, int year, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.year = year;
		this.paginas = paginas;
		this.prestado = false;
		this.misAutores = new TreeSet<>();
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
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", year=");
		builder.append(year);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append(", misAutores=");
		builder.append(misAutores);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	
	public void presta() {
		this.prestado = true;

	}

	
	public void devuelve() {
		this.prestado = false;

	}

	
	public boolean estaPrestado() {
		return this.prestado;
	}
	
	public void addAutor(Autor unAutor) {
		this.misAutores.add(unAutor);
		
	}
	
	public void delAutor(Autor unAutor) {
		this.misAutores.remove(unAutor);
	}
	
	public TreeSet<Autor> getAutores() {
		return misAutores;
	}

	@Override
	public int compareTo(Publicacion o) {
		
		return this.getTitulo().compareTo(o.getTitulo());
	}
}
