/**
 * 
 */
package Ejercicio8;

/**
 * @author user
 *
 */
public class Arma {
	private String nombre;
	private int damage;
	private int durabilidad;
	
	
	/**
	 * @param nombre
	 * @param damage
	 * @param durabilidad
	 */
	public Arma(String nombre, int damage, int durabilidad) {
		super();
		this.nombre = nombre;
		this.damage = damage;
		this.durabilidad = durabilidad;
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
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}
	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
	/**
	 * @return the durabilidad
	 */
	public int getDurabilidad() {
		return durabilidad;
	}
	/**
	 * @param durabilidad the durabilidad to set
	 */
	public void setDurabilidad(int durabilidad) {
		this.durabilidad = durabilidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nombre);
		builder.append(", daño:");
		builder.append(damage);
		builder.append(", durabilidad:");
		builder.append(durabilidad);
		return builder.toString();
	}
	
	
}
