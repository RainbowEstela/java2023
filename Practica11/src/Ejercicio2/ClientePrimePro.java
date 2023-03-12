/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class ClientePrimePro extends Cliente {

	private static final double MIPRECIOFINAL = 5;
	
	/**
	 * 
	 */
	public ClientePrimePro() {
		super();
		this.precioMensual = MIPRECIOFINAL;	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = MIPRECIOFINAL;	}

	@Override
	public boolean esPro() {
		return true;
	}

	@Override
	public double getPrecioMensual() {
		return this.precioMensual;
	}
	
	

}
