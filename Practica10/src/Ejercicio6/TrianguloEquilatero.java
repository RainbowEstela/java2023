/**
 * 
 */
package Ejercicio6;

/**
 * @author usuario1daw
 *
 */
public class TrianguloEquilatero extends Triangulo {

	/**
	 * 
	 */
	public TrianguloEquilatero() {
		super();
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloEquilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	/**
	 * @param t
	 */
	public TrianguloEquilatero(TrianguloRectangulo t) {
		super(t);
	}

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * (Math.pow(lado1, 2));
	}

	@Override
	public boolean valido() {
		if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
