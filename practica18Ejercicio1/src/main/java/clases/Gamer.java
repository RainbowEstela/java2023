/**
 * 
 */
package clases;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Gamer implements Comparable<Gamer> {
	
	private String nick;
	private String email;
	private String juego;
	private Nivel nivel;
	
	/**
	 * Constructor
	 * @param nick
	 * @param email
	 * @param juego
	 * @param nivel
	 */
	public Gamer(String nick, String email, String juego, Nivel nivel) {
		super();
		this.nick = nick;
		this.email = email;
		this.juego = juego;
		this.nivel = nivel;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the juego
	 */
	public String getJuego() {
		return juego;
	}

	/**
	 * @param juego the juego to set
	 */
	public void setJuego(String juego) {
		this.juego = juego;
	}

	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nick=");
		builder.append(nick);
		builder.append(", email=");
		builder.append(email);
		builder.append(", juego=");
		builder.append(juego);
		builder.append(", nivel=");
		builder.append(nivel);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nick);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gamer other = (Gamer) obj;
		return Objects.equals(nick, other.nick);
	}

	@Override
	public int compareTo(Gamer o) {
		return this.getNick().compareTo(o.getNick());
	}
	
	
	
}
