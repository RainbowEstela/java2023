/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class TarjetaCredito extends Tarjeta {
	private String fechaCaducidad;

	/**
	 * @param numCuenta
	 * @param fechaCaducidad
	 */
	public TarjetaCredito(String numCuenta, String fechaCaducidad) {
		super(numCuenta);
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * @return the fechaCaducidad
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaCredito");
		builder.append(super.toString());
		builder.append(", fechaCaducidad=");
		builder.append(fechaCaducidad);
		return builder.toString();
	}
	
	
}
