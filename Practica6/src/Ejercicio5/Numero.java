/**
 * 
 */
package Ejercicio5;

/**
 * @author usuario1daw
 *
 */
public class Numero {

	private Integer entero;

	/**
	 * @param entero
	 */
	public Numero() {
		super();
		this.entero = 0;
	}

	/**
	 * @param entero
	 */
	public Numero(Integer entero) {
		super();
		this.entero = entero;
	}
	
	/**
	 * suma un valor al entero
	 * @param num
	 */
	public void suma(int num) {
		
		this.entero += num;
	}
	
	/**
	 * resta un numero al entero
	 * @param num
	 */
	public void resta(int num) {
		this.entero -= num;
	}
	
	/**
	 * devuelve el valor entero del entero
	 * @return
	 */
	public int getValor() {
		return this.entero;
	}
	
	/**
	 * devuelve el valor double del entero
	 * @return
	 */
	public double getDouble() {
		return this.entero.doubleValue();
	}


	/**
	 * @param entero the entero to set
	 */
	public void setEntero(Integer entero) {
		this.entero = entero;
	}
	
	
}
