/**
 * 
 */
package Ejercicio;

/**
 * @author usuario1daw
 *
 */
public class Zapatillas extends Producto {
	
	private Numero numeroTalla;
	private Categoria categoria;
	
	
	
	/**
	 * @param p
	 */
	public Zapatillas(Zapatillas p) {
		super(p);
		this.numeroTalla = p.numeroTalla;
		this.categoria = p.categoria;
	}



	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param unidadesStock
	 */
	public Zapatillas(String nombre, String descripcion, double precio, int unidadesStock, Numero unNumero, Categoria unCategoria) {
		super(nombre, descripcion, precio, unidadesStock);
		this.numeroTalla = unNumero;
		this.categoria = unCategoria;
	}



	/**
	 * @return the numeroTalla
	 */
	public Numero getNumeroTalla() {
		return numeroTalla;
	}



	/**
	 * @param numeroTalla the numeroTalla to set
	 */
	public void setNumeroTalla(Numero numeroTalla) {
		this.numeroTalla = numeroTalla;
	}



	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}



	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zapatillas [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append(", numeroTalla=");
		builder.append(numeroTalla);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double descuento() {
		if(this.numeroTalla == Numero.N35 || this.numeroTalla == Numero.N47 || this.numeroTalla == Numero.N48 || this.numeroTalla == Numero.N49 || this.numeroTalla == Numero.N50) {
			return this.precio * 0.05;
		} else {
			return this.precio * 0.03;
		}
	}

}
