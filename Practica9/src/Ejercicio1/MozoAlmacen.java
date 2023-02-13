/**
 * 
 */
package Ejercicio1;

/**
 * @author user
 *
 */
public class MozoAlmacen extends Operario {
	private int peligrosidad;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param haceHorasExtra
	 * @param peligrosidad
	 */
	public MozoAlmacen(String nombre, int edad, double salario, boolean haceHorasExtra, int peligrosidad) {
		super(nombre, edad, salario, haceHorasExtra);
		this.peligrosidad = peligrosidad;
	}

	/**
	 * @return the peligrosidad
	 */
	public int getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * @param peligrosidad the peligrosidad to set
	 */
	public void setPeligrosidad(int peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	@Override
	protected int plus() {
		
		if ( (this.peligrosidad == 3) || (this.peligrosidad == 2 && this.edad > 30) || (this.peligrosidad == 1 && edad <= 30)) {
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
		builder.append(", peligrosidad=");
		builder.append(peligrosidad);
		return builder.toString();
	}
	
	
	
}
