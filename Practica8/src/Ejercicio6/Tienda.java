/**
 * 
 */
package Ejercicio6;

import java.util.ArrayList;


/**
 * @author user
 *
 */
public class Tienda {
	private ArrayList<Producto> misProductos;
	private double ventas;
	
	/**
	 * Constructor por defecto
	 */
	public Tienda() {
		super();
		this.misProductos = new ArrayList<>();
		this.ventas = 0;
	}

	/**
	 * @return the ventas
	 */
	public double getVentas() {
		return ventas;
	}

	/**
	 * @param ventas the ventas to set
	 */
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	public void adquirirProd(Producto unProducto) {
		if (this.misProductos.indexOf(unProducto) == -1) {
			this.misProductos.add(unProducto);
		}
	}
	
	public void venderProd(int identificador, int cantidad) {
		Producto borrar = null;
		
		for(Producto i : this.misProductos) {
			
			if (i.getId() == identificador) {
				Boolean vendido = i.vender(cantidad);
				if (vendido == true) {
					this.ventas += (cantidad * i.getPrecioUnitario()) - (i.getPrecioUnitario() * i.getDescuento());
					
					if (i.getUnidadesDisponibles() == 0) {
						borrar = i;
					}
				}
			}
		}
		
		if (borrar != null) {
			this.misProductos.remove(borrar);
		}
	}
	
}
