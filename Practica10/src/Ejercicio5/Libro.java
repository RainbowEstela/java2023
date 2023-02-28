package Ejercicio5;

public class Libro extends Publicacion implements Prestable {
	
	private boolean prestado;
	
	/**
	 */
	public Libro() {
		super();
		this.prestado = false;
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 */
	public Libro(String isbn, String titulo, int year, int paginas) {
		super(isbn, titulo, year, paginas);
		this.prestado = false;
	}



	@Override
	public void presta() {
		this.prestado = true;

	}

	@Override
	public void devuelve() {
		this.prestado = false;

	}

	@Override
	public boolean estaPrestado() {
		return this.prestado;
	}
	
}
