/**
 * 
 */
package Ejercicio8;

/**
 * @author user
 *
 */
public class Jugador {
	private String nick;
	private String clase;
	private int salud;
	private Arma miArma;
	/**
	 * @param nick
	 * @param clase
	 * @param miArma
	 */
	public Jugador(String nick, String clase, int salud, Arma miArma) {
		super();
		this.nick = nick;
		this.clase = clase;
		this.salud = salud;
		this.miArma = miArma;
	}
	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}
	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
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
	 * @return the miArma
	 */
	public Arma getMiArma() {
		return miArma;
	}
	/**
	 * @param miArma the miArma to set
	 */
	public void setMiArma(Arma miArma) {
		this.miArma = miArma;
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
	 * metodo toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador ");
		builder.append(nick);
		builder.append(", clase: ");
		builder.append(clase);
		builder.append(", salud: ");
		builder.append(this.salud);
		builder.append(", miArma: ");
		builder.append(miArma);
		return builder.toString();
	}
	
	public void golpear(Enemigo ene) {
		if(this.miArma == null) {
			ene.quitarVida(20);
		} else {
			ene.quitarVida(this.miArma.getDamage());
			this.miArma.setDurabilidad(this.miArma.getDurabilidad() - 1);
			if (this.miArma.getDurabilidad() <= 0) {
				this.miArma = null;
			}
		}
	}
	
	
}
