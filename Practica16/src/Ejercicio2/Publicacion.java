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
	 * Constructor por defecto
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
	 * Constructor con todos los parametros
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
	
	/**
	 * simula la accion de prestrar un libro cambiando la propiedad prestado a true
	 */
	public void presta() {
		this.prestado = true;

	}

	/**
	 * simula la devolucion de un libro cambiando su propiedad prestado a false
	 */
	public void devuelve() {
		this.prestado = false;

	}

	/**
	 * Comprueba el estado del libo si esta prestado o no con true o false
	 */
	public boolean estaPrestado() {
		return this.prestado;
	}
	
	/**
	 * añade un autor si no esta repetido a la publicacion
	 */
	public void addAutor(Autor unAutor) {
		this.misAutores.add(unAutor);
		
	}
	
	/**
	 * elimina un autor de la publicacion
	 * @param unAutor
	 */
	public void delAutor(Autor unAutor) {
		this.misAutores.remove(unAutor);
	}
	
	/**
	 * devuelve el treeset de autores de la publicacion
	 * @return
	 */
	public TreeSet<Autor> getAutores() {
		return misAutores;
	}

	@Override
	public int compareTo(Publicacion o) {
		
		return this.getTitulo().compareTo(o.getTitulo());
	}
}
