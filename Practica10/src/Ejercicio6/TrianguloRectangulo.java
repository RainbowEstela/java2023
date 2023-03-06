/**
 * 
 */
package Ejercicio6;

/**
 * @author usuario1daw
 *
 */
public class TrianguloRectangulo extends Triangulo {

	
	
	/**
	 * 
	 */
	public TrianguloRectangulo() {
		super();
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloRectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	/**
	 * @param t
	 */
	public TrianguloRectangulo(TrianguloRectangulo t) {
		super(t);
	}

	@Override
	public double area() {
		return (this.lado2 * this.lado3) / 2;
	}

	@Override
	public boolean valido() {
		mayor();
		if (Math.pow(this.lado1, 2) == (Math.pow(lado2, 2) + Math.pow(lado3, 2))) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private void mayor() {
		double aux = 0;
		if (this.lado2 > this.lado1 && this.lado2 > this.lado3) {
			aux = this.lado2;
			this.lado2 = this.lado1;
			this.lado1 = aux;
		} else if (this.lado3 > this.lado1 && this.lado3 > this.lado2) {
			aux = this.lado3;
			this.lado3 = this.lado1;
			this.lado1 = aux;
		}
	}

}
