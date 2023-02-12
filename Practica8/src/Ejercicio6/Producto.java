package Ejercicio6;

import java.util.Objects;

public class Producto {
	private int id;
	private String descripcion;
	private double precioUnitario;
	private int unidadesDisponibles;
	private int stockMaximo;
	private double descuento;
	
	/**
	 * constructor por defecto
	 */
	public Producto() {
		super();
		this.id = -1;
		this.descripcion = "";
		this.precioUnitario = 0;
		this.unidadesDisponibles = 0;
		this.stockMaximo = 0;
		this.descuento = 0;
	}

	/**
	 * Constructor con campos
	 * @param id
	 * @param descripcion
	 * @param precioUnitario
	 * @param unidadesDisponibles
	 * @param stockMaximo
	 * @param descuento
	 */
	public Producto(int id, String descripcion, double precioUnitario, int unidadesDisponibles, int stockMaximo,
			double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.unidadesDisponibles = unidadesDisponibles;
		this.stockMaximo = stockMaximo;
		this.descuento = descuento;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the precioUnitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 * @return the unidadesDisponibles
	 */
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	/**
	 * @param unidadesDisponibles the unidadesDisponibles to set
	 */
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	/**
	 * @return the stockMaximo
	 */
	public int getStockMaximo() {
		return stockMaximo;
	}

	/**
	 * @param stockMaximo the stockMaximo to set
	 */
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precioUnitario=");
		builder.append(precioUnitario);
		builder.append(", unidadesDisponibles=");
		builder.append(unidadesDisponibles);
		builder.append(", stockMaximo=");
		builder.append(stockMaximo);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	
	public boolean vender(int cantidad) {
		if (cantidad <= 0) {
			return false;
		} else if (this.unidadesDisponibles < cantidad) {
			return false;
		} else {
			this.unidadesDisponibles -= cantidad;
			return true;
		}
	}
	
	public int reponer() {
		int repuesto = this.stockMaximo - this.unidadesDisponibles;
		this.unidadesDisponibles = this.stockMaximo;
		return repuesto;
	}
}
