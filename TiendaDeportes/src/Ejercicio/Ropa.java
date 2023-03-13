package Ejercicio;

public class Ropa extends Producto {
	
	private Talla talla;
	private String color;
	private Tipo tipo;
	
	
	
	/**
	 * @param p
	 */
	public Ropa(Ropa p) {
		super(p);
		this.talla = p.talla;
		this.color = p.color;
		this.tipo= p.tipo;
	}



	/**
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param unidadesStock
	 */
	public Ropa(String nombre, String descripcion, double precio, int unidadesStock, Talla unaTalla, String unColor, Tipo unTipo) {
		super(nombre, descripcion, precio, unidadesStock);
		this.talla = unaTalla;
		this.color = unColor;
		this.tipo= unTipo;
	}

	

	/**
	 * @return the talla
	 */
	public Talla getTalla() {
		return talla;
	}



	/**
	 * @param talla the talla to set
	 */
	public void setTalla(Talla talla) {
		this.talla = talla;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}



	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}



	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ropa [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", color=");
		builder.append(color);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * metodo que devuelve el double que hay que restar el precio
	 */
	@Override
	public double descuento() {
		
		if(this.talla == Talla.XS || this.talla == Talla.XLL) {
			return this.precio * 0.05;
		} else {
			return this.precio * 0.03;
		}
	}

}
