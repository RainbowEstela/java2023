/**
 * 
 */
package Ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author usuario1daw
 *
 */
public class Compra implements Enviable {
	
	private ArrayList<LineaCompra> lista;
	private LocalDate fecha;
	private double precioTotal;
	
	
	
	/**
	 * @param fecha
	 */
	public Compra(LocalDate fecha) {
		super();
		this.fecha = fecha;
		this.lista = new ArrayList<>();
	}

	

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}



	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	

	/**
	 * @return the lista
	 */
	public ArrayList<LineaCompra> getLista() {
		return lista;
	}



	/**
	 * @return the precioTotal
	 */
	public double getPrecioTotal() {
		return precioTotal;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compra ");
		builder.append("de fecha= ");
		builder.append(fecha);
		builder.append(", con un total de ");
		builder.append(precioTotal);
		builder.append(" euros, ");
		builder.append("contiene:");
		builder.append("\n");
		for (LineaCompra l : this.lista) {
			builder.append(l);
			builder.append("\n");
		}
		return builder.toString();
	}

	private void actualizarPrecioTotal() {
		for(LineaCompra l : lista) {
			this.precioTotal += l.subtotal(); 
		}
	}
	
	public void addLinea(LineaCompra lc) {
		int indice = this.lista.indexOf(lc);
		
		if(indice == -1) {
			this.lista.add(lc);
		} else {
			this.lista.get(indice).setCantidad(this.lista.get(indice).getCantidad() + lc.getCantidad());
		}
		
		actualizarPrecioTotal();
	}
	
	public void delLinea(LineaCompra lc) {
		this.lista.remove(lc);
		
		actualizarPrecioTotal();
	}
	
	@Override
	public String crearEmail() {
		StringBuilder sb = new StringBuilder();
		
		for(LineaCompra l : lista) {
			sb.append(l.getOrden());
			sb.append(" ");
			sb.append(l.getMiProducto().getNombre());
			sb.append(" ");
			sb.append(l.getCantidad());
			sb.append(" = ");
			sb.append(l.subtotal());
			sb.append("\n");
		}
		
		sb.append("Total = ");
		sb.append(this.precioTotal);
		
		return sb.toString();
	}
	
}
