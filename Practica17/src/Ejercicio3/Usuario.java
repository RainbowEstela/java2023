/**
 * 
 */
package Ejercicio3;

import java.util.HashMap;

/**
 * @author user
 *
 */
public class Usuario implements Comparable<Usuario> {
	private static int autoincremento = 1;
	
	private int id;
	private String nombre;
	private String email;
	private String nick;
	private HashMap<Integer, Puntuacion> puntuaciones;

	/**
	 * Constructor
	 * @param nombre
	 * @param email
	 * @param nick
	 */
	public Usuario(String nombre, String email, String nick) {
		super();
		this.id = autoincremento;
		autoincremento++;
		this.nombre = nombre;
		this.email = email;
		this.nick = nick;
		this.puntuaciones = new HashMap<>();
	}

	/**
	 * Constructor con solo la id para buscar otros objetos
	 * @param id
	 */
	public Usuario(int id) {
		super();
		this.id = id;
		this.nombre = "";
		this.email = "";
		this.nick = "";
		this.puntuaciones = new HashMap<>();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the puntuaciones
	 */
	public HashMap<Integer, Puntuacion> getPuntuaciones() {
		return puntuaciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(nick);
		builder.append(" - ");
		builder.append(email);
	
		return builder.toString();
	}
	
	//METODOS PROPIOS
	
	/**
	 * add idjuego con las puntuaciones pasadas si no existe, si ya existe la id sumara los resultados a los resultados anteriores
	 * @param idJuego
	 * @param haGanado
	 * @param puntosObtenidos
	 */
	public void addPuntuacion(int idJuego, boolean haGanado, int puntosObtenidos) {
		if ( !puntuaciones.containsKey(idJuego) ) {
			puntuaciones.put(idJuego, new Puntuacion());
			
		}
		
		Puntuacion puntuacionEncontrada = puntuaciones.get(idJuego);
		
		puntuacionEncontrada.setPartidasJugadas( puntuacionEncontrada.getPartidasJugadas() + 1);
		puntuacionEncontrada.setPuntos( puntuacionEncontrada.getPuntos() + puntosObtenidos);
		
		if (haGanado) {
			puntuacionEncontrada.setPartidasGanadas(puntuacionEncontrada.getPartidasGanadas() + 1);
		} else {
			puntuacionEncontrada.setPartidasPerdidas(puntuacionEncontrada.getPartidasPerdidas() + 1);
		}
		
	}
	
	/**
	 * Devuelve la puntuacion correspondiente a la id pasada, o null si no esta esa id registrada
	 * @param idJuego
	 * @return
	 */
	public Puntuacion getPuntuacion(int idJuego) {
		return puntuaciones.get(idJuego);
	}

	@Override
	public int compareTo(Usuario o) {
		return this.id - o.id;
	}
	
}
