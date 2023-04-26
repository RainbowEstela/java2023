/**
 * 
 */
package Ejercicio3;

/**
 * @author user
 *
 */
public class Puntuacion {
	private int puntos;
	private int partidasJugadas;
	private int partidasGanadas;
	private int partidasPerdidas;
	
	/**
	 * Constructor
	 */
	public Puntuacion() {
		super();
		this.puntos = 0;
		this.partidasJugadas = 0;
		this.partidasGanadas = 0;
		this.partidasPerdidas = 0;
	}

	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the partidasJugadas
	 */
	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	/**
	 * @param partidasJugadas the partidasJugadas to set
	 */
	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	/**
	 * @return the partidasGanadas
	 */
	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	/**
	 * @param partidasGanadas the partidasGanadas to set
	 */
	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	/**
	 * @return the partidasPerdidas
	 */
	public int getPartidasPerdidas() {
		return partidasPerdidas;
	}

	/**
	 * @param partidasPerdidas the partidasPerdidas to set
	 */
	public void setPartidasPerdidas(int partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("puntos: ");
		builder.append(puntos);
		builder.append(" - PJ: ");
		builder.append(partidasJugadas);
		builder.append(" - PG: ");
		builder.append(partidasGanadas);
		builder.append(" - PP: ");
		builder.append(partidasPerdidas);
		return builder.toString();
	}
	
}
