/**
 * 
 */
package Ejercicio1;

/**
 * @author user
 *
 */
public class Empleado {
	protected String nombre;
	protected int edad;
	protected double salario;
	protected final double PLUS = 300;
	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * @return the pLUS
	 */
	public double getPLUS() {
		return PLUS;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", PLUS=");
		if (plus() == 0) {
			builder.append(0);
		} else if (plus() == 1) {
			builder.append(PLUS);
		} else {
			double doble = PLUS * 2;
			builder.append(doble);
		}
		return builder.toString();
	}
	
	/**
	 * 0 no recive plus
	 * 1 recive plus
	 * 2 recive el doble del plus
	 * @return
	 */
	protected int plus() {
		return 0;
	}
	
	
}
