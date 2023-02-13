/**
 * 
 */
package Ejercicio1;

/**
 * @author user
 *
 */
public class Operario extends Empleado {
	protected boolean haceHorasExtra;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param haceHorasExtra
	 */
	public Operario(String nombre, int edad, double salario, boolean haceHorasExtra) {
		super(nombre, edad, salario);
		this.haceHorasExtra = haceHorasExtra;
	}

	/**
	 * @return the haceHorasExtra
	 */
	public boolean isHaceHorasExtra() {
		return haceHorasExtra;
	}

	/**
	 * @param haceHorasExtra the haceHorasExtra to set
	 */
	public void setHaceHorasExtra(boolean haceHorasExtra) {
		this.haceHorasExtra = haceHorasExtra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", horas Extra");
		builder.append(haceHorasExtra);
		return builder.toString();
	}
	
	
	
	
}
