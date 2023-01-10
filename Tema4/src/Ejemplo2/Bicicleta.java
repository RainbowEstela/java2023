/**
 * 
 */
package Ejemplo2;

/**
 * @author Estela
 *
 */
public class Bicicleta {

	/**
	 * Propiedades
	 */
	
	public boolean esElectrica;
	public String marca;
	public String frenos;
	public String cambio;
	public String orquilla;
	public String material;
	public double precio;
	
	
	/**
	 * CONSTRUCTOR CON ARGUMENTOS
	 * Constructor
	 */
	
	public Bicicleta(boolean esElectrica, String marca, String frenos, String cambio, String orquilla, String material,
			double precio) {
		super();
		this.esElectrica = esElectrica;
		this.marca = marca;
		this.frenos = frenos;
		this.cambio = cambio;
		this.orquilla = orquilla;
		this.material = material;
		this.precio = precio;
	}



	/**
	 * CONSTRUCTOR POR DEFECTO
	 * valores por defecto
	 */
	
	public Bicicleta() {
		super();
		this.esElectrica = false;
		
	}
	
	
	/**
	 * Comportamiento
	 */
	
	public double precioConDescuento() {
		double precioDescuento = 0;
		
		if (this.esElectrica == true) {
			precioDescuento = this.precio * 0.85;
		} else {
			precioDescuento = this.precio * 0.85;
		}
		
		return precioDescuento;
	}
}
