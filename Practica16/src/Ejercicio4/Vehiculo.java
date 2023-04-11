/**
 * 
 */
package Ejercicio4;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Vehiculo implements Comparable<Vehiculo> {
	enum Estado{ENREPARACION,REPARADO};
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected double precio;
	protected int caballos;
	protected Estado estado;
	
	/**
	 * constuctor con todos los parametros
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param caballos
	 */
	public Vehiculo(String matricula, String marca, String modelo, String color, double precio, int caballos) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.caballos = caballos;
		this.estado = Estado.ENREPARACION;
	}

	/**
	 * Constructor copia
	 * @param v
	 */
	public Vehiculo(Vehiculo v) {
		super();
		this.matricula = v.matricula;
		this.marca = v.marca;
		this.modelo = v.modelo;
		this.color = v.color;
		this.precio = v.precio;
		this.caballos = v.caballos;
		this.estado = v.estado;
	}

	/**
	 * Constructor por defecto
	 */
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.precio = 0;
		this.caballos = 0;
		this.estado = Estado.ENREPARACION;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	 * @return the caballos
	 */
	public int getCaballos() {
		return caballos;
	}

	/**
	 * @param caballos the caballos to set
	 */
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", caballos=");
		builder.append(caballos);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public int compareTo(Vehiculo o) {
		return this.getMatricula().compareTo(o.getMatricula());
	}
	
	
}
