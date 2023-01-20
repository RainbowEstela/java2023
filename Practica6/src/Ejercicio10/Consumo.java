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
	
	/**
	 * metodo que dice el tiempo en horas en llegar al destino
	 * @return
	 */
	public double getTiempo() {
		
		return this.kms / this.vmed;
	}
	
	/**
	 * metodo que devuelve el consumo medio de gasolina por cada 100 kms
	 * @return
	 */
	public double consumoMedio() {
		return (this.litros / this.kms) * 100;
	}
	
	/**
	 * metodo que devuelve el consumo medio de euros por cada 100 kms
	 * @return
	 */
	public double consumoEuros() {
		return (this.pgas / this.kms) * 100;
	}

	/**
	 * @param kms the kms to set
	 */
	public void setKms(int kms) {
		this.kms = kms;
	}

	/**
	 * @param litros the litros to set
	 */
	public void setLitros(double litros) {
		this.litros = litros;
	}

	/**
	 * @param vmed the vmed to set
	 */
	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	/**
	 * @param pgas the pgas to set
	 */
	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	/**
	 * @param kms
	 * @param litros
	 * @param vmed
	 * @param pgas
	 */
	public Consumo(int kms, double litros, double vmed, double pgas) {
		super();
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}
	
	
	
	
}
