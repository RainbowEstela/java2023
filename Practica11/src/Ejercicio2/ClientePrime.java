/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class ClientePrime extends Cliente {
	
	private static final double MIPRECIOFINAL = 3;
	
	
	
	/**
	 * 
	 */
	public ClientePrime() {
		super();
		this.precioMensual = MIPRECIOFINAL;
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = MIPRECIOFINAL;
	}

	@Override
	public boolean esPro() {
		return false;
	}

	@Override
	public double getPrecioMensual() {
		return this.precioMensual;
	}

}
