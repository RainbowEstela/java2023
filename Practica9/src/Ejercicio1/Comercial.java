/**
 * 
 */
package Ejercicio1;

/**
 * @author user
 *
 */
public class Comercial extends Empleado {
	private double comision;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param comision
	 */
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	/**
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	protected int plus() {
		if (this.edad > 30 && this.comision > 200) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", comision=");
		builder.append(comision);
		return builder.toString();
	}
	
	
	
}
