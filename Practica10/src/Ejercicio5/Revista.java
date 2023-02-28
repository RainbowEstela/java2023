package Ejercicio5;

public class Revista extends Publicacion implements Prestable {
	
	private int numero;
	private boolean prestado;
	
	
	
	/**
	 */
	public Revista() {
		super();
		this.numero = 0;
		this.prestado = false;
	}

	
	
	/**
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 * @param numero
	 * @param prestado
	 */
	public Revista(String isbn, String titulo, int year, int paginas, int numero) {
		super(isbn, titulo, year, paginas);
		this.numero = numero;
		this.prestado = false;
	}



	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}



	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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
