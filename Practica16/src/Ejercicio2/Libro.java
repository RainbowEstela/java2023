package Ejercicio2;

public class Libro extends Publicacion {
	
	
	/**
	 */
	public Libro() {
		super();
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 */
	public Libro(String isbn, String titulo, int year, int paginas) {
		super(isbn, titulo, year, paginas);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
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


	
	
}
