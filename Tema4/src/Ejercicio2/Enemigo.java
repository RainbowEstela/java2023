/**
 * 
 */
package Ejercicio2;

/**
 * @author usuario1daw
 *
 */
public class Enemigo {
	private String nombre;
	private String tipo;
	private double salud;
	private double nivel;
	private double damage;
	
	public static int numEnemigos = 0;
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param salud
	 * @param nivel
	 * @param damage
	 */
	
	public Enemigo(String nombre, String tipo, int damage) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.salud = 100;
		this.nivel = 1;
		this.damage = damage;
		Enemigo.numEnemigos++;
	}

	/**
	 * @param nombre
	 * @param tipo
	 * @param salud
	 * @param nivel
	 * @param damage
	 */
	public Enemigo() {
		super();
		this.nombre = "zombie";
		this.tipo = "Undead";
		this.salud = 100;
		this.nivel = 1;
		this.damage = 5;
		Enemigo.numEnemigos++;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the salud
	 */
	public double getSalud() {
		return salud;
	}

	/**
	 * @param salud the salud to set
	 */
	public void setSalud(double salud) {
		this.salud = salud;
	}

	/**
	 * @return the nivel
	 */
	public double getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(double nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the damage
	 */
	public double getDamage() {
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(double damage) {
		this.damage = damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void subirNivel() {
		this.nivel += 1;
		this.salud += Math.pow(2, this.nivel);
	}
	
	public void recibirDamage(double damage) {
		this.salud -= damage;
		if (this.salud <= 0) {
			System.out.println("enemigo derrotado");
			Enemigo.numEnemigos--;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enemigo [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append(", damage=");
		builder.append(damage);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
