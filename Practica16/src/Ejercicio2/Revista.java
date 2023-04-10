package Ejercicio2;

public class Revista extends Publicacion {
	
	private int numero;
	
	/**
	 */
	public Revista() {
		super();
		this.numero = 0;
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [isbn=");
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
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}



	
	
	
}
