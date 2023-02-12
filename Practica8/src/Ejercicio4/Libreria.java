/**
 * 
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Libreria {
	private double ganancias;
	private ArrayList<Libro> misLibros;

	/**
	 * constructor sin parametros
	 */
	public Libreria() {
		super();
		this.misLibros = new ArrayList<>(1000);
		this.ganancias = 0;
	}
	
	public void adquirir(Libro miLibro, double precio) {
		miLibro.setPrecioCompra(precio);
		this.misLibros.add(miLibro);
		
	}
	
	public void vender(Libro miLibro, double precio) {
		int index = this.misLibros.indexOf(miLibro);
		if (index != -1) {
			this.misLibros.get(index).setPrecioVenta(precio);
			this.misLibros.get(index).setVendido(true);
			this.ganancias += precio;
		}
	}

	/**
	 * @return the ganancias
	 */
	public double getGanancias() {
		return ganancias;
	}
	
	
	
}
