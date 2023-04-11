/**
 * 
 */
package Ejercicio4;

/**
 * @author user
 *
 */
public class VehiculoHibrido extends VehiculoElectrico {
	
	private TipoFosil tipoFosil;

	/**
	 * 
	 */
	public VehiculoHibrido() {
		super();
		this.tipoFosil= TipoFosil.GASOLINA;
	}

	/**
	 * constructor con todos los parametros
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param caballos
	 * @param kw
	 * @param tipo
	 */
	public VehiculoHibrido(String matricula, String marca, String modelo, String color, double precio, int caballos,
			double kw, TipoFosil tipo) {
		super(matricula, marca, modelo, color, precio, caballos, kw);
		this.tipoFosil = tipo;
	}

	/**
	 * Constructor copia
	 * @param v
	 */
	public VehiculoHibrido(VehiculoHibrido v) {
		super(v);
		this.tipoFosil = v.tipoFosil;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoHibrido [kw=");
		builder.append(kw);
		builder.append(", matricula=");
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
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
