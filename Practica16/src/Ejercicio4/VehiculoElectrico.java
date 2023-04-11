/**
 * 
 */
package Ejercicio4;

/**
 * @author user
 *
 */
public class VehiculoElectrico extends Vehiculo {
	protected double kw;

	/**
	 * Constructor por defecto
	 */
	public VehiculoElectrico() {
		super();
		this.kw = 0;
	}

	/**
	 * Constructor con todos los parametros
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param caballos
	 * @param kw
	 */
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, double precio, int caballos,double kw) {
		super(matricula, marca, modelo, color, precio, caballos);
		this.kw = kw;
	}

	/**
	 * Constructor copia
	 * @param v
	 */
	public VehiculoElectrico(VehiculoElectrico v) {
		super(v);
		this.kw = v.kw;
	}

	/**
	 * @return the kw
	 */
	public double getKw() {
		return kw;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setKw(double kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoElectrico [matricula=");
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
		builder.append(", kw=");
		builder.append(kw);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
