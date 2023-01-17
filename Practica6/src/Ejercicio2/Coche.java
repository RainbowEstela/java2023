/**
 * 
 */
package Ejercicio2;

/**
 * @author usuario1daw
 *
 */
public class Coche {

	private int velocidad;

	/**
	 * @param velocidad
	 */
	public Coche() {
		super();
		this.velocidad = 0;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelera(int mas) {
		this.velocidad += mas;
	}
	
	public void frena(int menos) {
		
		this.velocidad -= menos;
		if (this.velocidad < 0) {
			this.velocidad = 0;
		}
	}
	
	
}
