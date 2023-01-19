/**
 * 
 */
package Ejercicio10;

/**
 * @author usuario1daw
 *
 */
public class Consumo {
	
	private int kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	public double getTiempo() {
		
		return this.kms / this.vmed;
	}
	
	public double consumoMedio() {
		return (this.litros / this.kms) * 100;
	}
	
	public double consumoEuros() {
		return 0;
	}
}
