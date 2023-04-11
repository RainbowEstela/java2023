/**
 * 
 */
package Ejercicio4;

/**
 * @author user
 *
 */
public class VehiculoFosil extends Vehiculo {
	private TipoFosil tipoFosil;
	private double capacidadDeposito;
	/**
	 * Constructor por defecto
	 */
	public VehiculoFosil() {
		super();
		this.tipoFosil= TipoFosil.GASOLINA;
	}

	/**
	 * Constructor con todos los parametros
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param caballos
	 * @param tipoFosil
	 * @param capacidadDeposito
	 */
	public VehiculoFosil(String matricula, String marca, String modelo, String color, double precio, int caballos, TipoFosil tipoFosil, double capacidadDeposito) {
		super(matricula, marca, modelo, color, precio, caballos);
		this.tipoFosil= tipoFosil;
		this.capacidadDeposito= capacidadDeposito;
	}
	/**
	 * constructor copia
	 * @param v
	 */
	public VehiculoFosil(VehiculoFosil v) {
		super(v);
		this.capacidadDeposito= v.capacidadDeposito;
		this.tipoFosil= v.tipoFosil;
	}

	/**
	 * @return the tipoFosil
	 */
	public TipoFosil getTipoFosil() {
		return tipoFosil;
	}

	/**
	 * @param tipoFosil the tipoFosil to set
	 */
	public void setTipoFosil(TipoFosil tipoFosil) {
		this.tipoFosil = tipoFosil;
	}

	/**
	 * @return the capacidadDeposito
	 */
	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}

	/**
	 * @param capacidadDeposito the capacidadDeposito to set
	 */
	public void setCapacidadDeposito(double capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoFosil [matricula=");
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
		builder.append(", tipoFosil=");
		builder.append(tipoFosil);
		builder.append(", capacidadDeposito=");
		builder.append(capacidadDeposito);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
