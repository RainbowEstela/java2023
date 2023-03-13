/**
 * 
 */
package Ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author usuario1daw
 *
 */
public class Tienda {
	ArrayList<Producto> inventario;
	ArrayList<Compra> listaCompras;
	
	/**
	 * @param inventario
	 * @param listaCompras
	 */
	public Tienda() {
		super();
		this.inventario = new ArrayList<>();
		this.listaCompras = new ArrayList<>();
	}

	/**
	 * @return the inventario
	 */
	public ArrayList<Producto> getInventario() {
		return inventario;
	}

	/**
	 * @return the listaCompras
	 */
	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}
	
	public void mostrarComprar() {
		int totalCompras = 0;
		System.out.println("Lista de compras:");
		for(Compra  c : listaCompras) {
			System.out.println(c.toString());
			totalCompras += c.getPrecioTotal();
		}
		
		System.out.println("Con un total de " + totalCompras + " euros");
	}
	
	public void mostrarComprar(int mes) {
		for(Compra compra : listaCompras) {
			if(compra.getFecha().getDayOfMonth() >= 1 && compra.getFecha().getDayOfMonth() <= LocalDate.of(0, mes, 1).lengthOfMonth() && compra.getFecha().getMonthValue() == mes) {
				System.out.println(compra);
			}
		}
	}
	
	public void addProducto(Producto p) {
		this.inventario.add(p);
	}
	
	public void delProducto(Producto p) {
		this.inventario.remove(p);
	}
	
	public void addCompra(Compra c) {
		for(LineaCompra l : c.getLista()) {
			Producto productoTienda = this.inventario.get(this.inventario.indexOf(l.getMiProducto()));
			
			if(l.getCantidad() > productoTienda.getUnidadesStock())  {
				throw new IllegalArgumentException("no se puede realizar la compra");
			}
		}
		
		for(LineaCompra l : c.getLista()) {
			Producto productoTienda = this.inventario.get(this.inventario.indexOf(l.getMiProducto()));
			productoTienda.setUnidadesStock(productoTienda.getUnidadesStock() - l.getCantidad());
		}
		
		this.listaCompras.add(c);
	}
	
	public ArrayList<Producto> buscarProducto(String texto) {
		ArrayList<Producto> encontrados = new ArrayList<>();
		
		for(Producto p : inventario) {
			if (p.getNombre().contains(texto)) {
				encontrados.add(p);
			}
		}
		
		return encontrados;
	}
	
	public Producto buscarProducto(int codigo) {
		for(Producto p : inventario) {
			if(p.getCodigo() == codigo) {
				return p;
			}
		}
		
		return null;
	}
}
