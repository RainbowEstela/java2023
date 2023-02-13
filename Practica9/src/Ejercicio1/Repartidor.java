/**
 * 
 */
package Ejercicio1;

/**
 * @author user
 *
 */
public class Repartidor extends Operario {
	private String zona;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param haceHorasExtra
	 * @param zona
	 */
	public Repartidor(String nombre, int edad, double salario, boolean haceHorasExtra, String zona) {
		super(nombre, edad, salario, haceHorasExtra);
		this.zona = zona;
	}
	

	/**
	 * @return the comision
	 */
	public String getZona() {
		return zona;
	}



	/**
	 * @param comision the comision to set
	 */
	public void setComision(String zona) {
		this.zona = zona;
	}
	
	
	@Override
	protected int plus() {
		if (this.zona == "zona 3" && this.edad < 25) {
			if (this.haceHorasExtra == true) {
				return 2;
			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", zona=");
		builder.append(zona);
		return builder.toString();
	}
}
