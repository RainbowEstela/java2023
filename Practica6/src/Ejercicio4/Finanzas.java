/**
 * 
 */
package Ejercicio4;

/**
 * @author usuario1daw
 *
 */
public class Finanzas {
	
	private double cambioDolarEuro;

	/**
	 * @param cambioDolarEuro
	 */
	public Finanzas() {
		super();
		this.cambioDolarEuro = 1.36;
	}

	/**
	 * @param cambioDolarEuro
	 */
	public Finanzas(double cambioDolarEuro) {
		super();
		this.cambioDolarEuro = cambioDolarEuro;
	}

	/**
	 * @return the cambioDolarEuro
	 */
	public double getCambioDolarEuro() {
		return cambioDolarEuro;
	}

	/**
	 * @param cambioDolarEuro the cambioDolarEuro to set
	 */
	public void setCambioDolarEuro(double cambioDolarEuro) {
		this.cambioDolarEuro = cambioDolarEuro;
	}
	
	public double dolarToEuro(double dolares) {
		return dolares * this.cambioDolarEuro;
	}
	
	public double euroToDolar(double euros) {
		return euros / this.cambioDolarEuro;
	}
}
