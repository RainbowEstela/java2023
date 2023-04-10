/**
 * 
 */
package Ejercicio1;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class Proceso {
	private int pid;
	private String nombre;
	private double cpu;
	private double ram;
	private int prioridad;
	
	/**
	 * Metodo constructor de la clase
	 * @param pid
	 * @param nombre
	 * @param cpu
	 * @param ram
	 * @param prioridad
	 */
	public Proceso(int pid, String nombre, double cpu, double ram, int prioridad) {
		super();
		this.pid = pid;
		this.nombre = nombre;
		this.cpu = cpu;
		this.ram = ram;
		this.prioridad = prioridad;
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
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
	 * @return the cpu
	 */
	public double getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the ram
	 */
	public double getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(double ram) {
		this.ram = ram;
	}

	/**
	 * @return the prioridad
	 */
	public int getPrioridad() {
		return prioridad;
	}

	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Proceso [pid=");
		builder.append(pid);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", cpu=");
		builder.append(cpu);
		builder.append(", ram=");
		builder.append(ram);
		builder.append(", prioridad=");
		builder.append(prioridad);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proceso other = (Proceso) obj;
		return pid == other.pid;
	}
	
	
}
