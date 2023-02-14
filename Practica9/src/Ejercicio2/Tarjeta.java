/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class Tarjeta {
	protected String numCuenta;

	/**
	 * @param numCuenta
	 */
	public Tarjeta(String numCuenta) {
		super();
		this.numCuenta = numCuenta;
	}

	/**
	 * @return the numCuenta
	 */
	public String getNumCuenta() {
		return numCuenta;
	}

	/**
	 * @param numCuenta the numCuenta to set
	 */
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("numCuenta=");
		builder.append(numCuenta);
		return builder.toString();
	}
	
	
}
