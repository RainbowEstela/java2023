/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class TarjetaDebito extends Tarjeta {
	private String fechaAlta;

	/**
	 * @param numCuenta
	 * @param fechaAlta
	 */
	public TarjetaDebito(String numCuenta, String fechaAlta) {
		super(numCuenta);
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaDebito ");
		builder.append(super.toString());
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		return builder.toString();
	}
	
	
}
