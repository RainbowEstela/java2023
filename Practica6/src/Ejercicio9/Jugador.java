/**
 * 
 */
package Ejercicio9;

/**
 * @author usuario1daw
 *
 */
public class Jugador {

	private String nombre;
	private String clase;
	private int nivel;
	private int salud;
	private int weaponDamage;
	
	/**
	 * @param nombre
	 * @param clase
	 * @param nivel
	 * @param salud
	 * @param weaponDamage
	 */
	public Jugador(String nombre, String clase, int weaponDamage) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.nivel = 1;
		this.salud = 100;
		this.weaponDamage = weaponDamage;
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
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	/**
	 * @return the weaponDamage
	 */
	public int getWeaponDamage() {
		return weaponDamage;
	}
	/**
	 * @param weaponDamage the weaponDamage to set
	 */
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	
	/**
	 * método que sube de nivel a la entidad
	 */
	public void subirNivel() {
		this.nivel++;
		this.salud += (int) Math.pow(2.5, nivel);
	}
	
	public void golpear(Enemigo ene) {
		
		ene.recivirDamage(this.weaponDamage);
	}
	
	public void recivirDamage(int damage) {
		this.salud -= damage;
		this.comprobarVida();
	}
	
	public void comprobarVida() {
		if (this.salud <= 0) {
			this.salud = 0;
			System.out.println( this.nombre + " " + "muerto");
		} else {
			System.out.println(this.nombre + " tiene " + this.salud + " puntos de salud restantes");
		}
	}
}
