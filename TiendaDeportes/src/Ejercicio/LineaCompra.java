/**
 * 
 */
package Ejercicio;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class LineaCompra {
	private int orden;
	private Producto miProducto;
	private int cantidad;
	
	/**
	 * @param orden
	 * @param miProducto
	 * @param cantidad
	 */
	public LineaCompra(int orden, Producto miProducto, int cantidad) {
		super();
		this.orden = orden;
		this.miProducto = miProducto;
		this.cantidad = cantidad;
	}

	/**
	 * @param orden
	 * @param miProducto
	 * @param cantidad
	 */
	public LineaCompra(LineaCompra l) {
		super();
		this.orden = l.orden;
		if (l.miProducto instanceof Ropa) {
			this.miProducto = new Ropa((Ropa) l.miProducto);
		} else if (l.miProducto instanceof Zapatillas) {
			this.miProducto = new Zapatillas((Zapatillas) l.miProducto);
		}
		this.cantidad = l.cantidad;
	}

	/**
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}

	/**
	 * @return the miProducto
	 */
	public Producto getMiProducto() {
		return miProducto;
	}

	/**
	 * @param miProducto the miProducto to set
	 */
	public void setMiProducto(Producto miProducto) {
		this.miProducto = miProducto;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineaCompra [orden=");
		builder.append(orden);
		builder.append(", miProducto=");
		builder.append(miProducto);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(miProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaCompra other = (LineaCompra) obj;
		return Objects.equals(miProducto, other.miProducto);
	}
	
	public double subtotal() {
		return this.cantidad * (this.miProducto.getPrecio() - this.miProducto.descuento());
	}
	
}
