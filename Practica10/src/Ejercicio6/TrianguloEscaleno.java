/**
 * 
 */
package Ejercicio6;

/**
 * @author usuario1daw
 *
 */
public class TrianguloEscaleno extends Triangulo {

	/**
	 * 
	 */
	public TrianguloEscaleno() {
		super();
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloEscaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	/**
	 * @param t
	 */
	public TrianguloEscaleno(TrianguloEscaleno t) {
		super(t);
	}

	@Override
	public double area() {
		double s = (this.lado1 + this.lado2 + this.lado3) /2;
		return Math.sqrt( s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
	}

	@Override
	public boolean valido() {
		if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
