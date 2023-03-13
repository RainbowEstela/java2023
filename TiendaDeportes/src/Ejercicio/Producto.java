/**
 * 
 */
package Ejercicio;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public abstract class Producto implements Descontable {
	
	protected static int autoincremento = 1;
	
	protected int codigo;
	protected String nombre;
	protected String descripcion;
	protected double precio;
	protected int unidadesStock;
	
	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param unidadesStock
	 */
	public Producto(String nombre, String descripcion, double precio, int unidadesStock) {
		super();
		this.codigo = autoincremento;
		autoincremento++;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadesStock = unidadesStock;
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param unidadesStock
	 */
	public Producto(Producto p) {
		super();
		this.codigo = p.codigo;
		this.nombre = p.nombre;
		this.descripcion = p.descripcion;
		this.precio = p.precio;
		this.unidadesStock = p.unidadesStock;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the unidadesStock
	 */
	public int getUnidadesStock() {
		return unidadesStock;
	}

	/**
	 * @param unidadesStock the unidadesStock to set
	 */
	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}

	@Override
	public abstract double descuento();
	
	
	
}
