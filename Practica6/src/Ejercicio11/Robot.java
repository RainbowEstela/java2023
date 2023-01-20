/**
 * 
 */
package Ejercicio11;

import java.util.Objects;

/**
 * @author user
 *
 */
public class Robot {
	
	private char imagen;
	private int posicionX;
	private int posiciony;
	private boolean haLlegado;
	private int numeroPasos;
	
	private static int contadorRobots;
	private final static int filasTablero = 25;
	private final static int columnasTablero = 25;
	public static int destinoX;
	public static int destinoY;
	/**
	 * metodo que decide el movimiento del robot e intenta moverlo
	 */
	public void turno() {
		int direccion = Robot.decidirMovimiento();
		
		switch (direccion) {
			case 0: {
				this.irArriba();
				break;
			}
			case 1: {
				this.irAbajo();
				break;
			}
			case 2: {
				this.irDerecha();
				break;
			}
			case 3: {
				this.irIzquierda();
				break;
			}

		}
		
		verificarLlegada();
	}
	
	private void verificarLlegada() {
		if ((this.posicionX == destinoX) && (this.posiciony == destinoY) ) {
			this.haLlegado = true;
		}
	}
	
	/**
	 * metodo que mueve el robot arriba si es posible
	 */
	public void irArriba() {
		int posX = this.posicionX - 1;
		
		if (posX >= 0) {
			this.posicionX = posX;
			this.numeroPasos++;
		}
	}
	
	/**
	 * metodo que mueve el robot abajo si es posible
	 */
	public void irAbajo() {
		int posX = this.posicionX + 1;
		
		if (posX <= filasTablero) {
			this.posicionX = posX;
			this.numeroPasos++;
		}
	}
	
	/**
	 * metodo que mueve el robot a la derecha si es posible
	 */
	public void irDerecha() {
		int posY = this.posiciony - 1;
		
		if (posY >= 0) {
			this.posiciony = posY;
			this.numeroPasos++;
		}
	}
	
	/**
	 * metodo que mueve el robot a la izquierda si es posible
	 */
	public void irIzquierda() {
		int posY = this.posiciony + 1;
		
		if (posY <= filasTablero) {
			this.posiciony = posY;
			this.numeroPasos++;
		}
	}
	
	/**
	 * retorna un numero del 0 al 3
	 * @return
	 */
	private static int decidirMovimiento() {
		return (int) (Math.random() * 4);
	}
	
	/**
	 * @param imagen
	 * @param posicionX
	 * @param posiciony
	 * @param haLlegado
	 * @param numeroPasos
	 */
	public Robot(char imagen, int posicionX, int posiciony) {
		super();
		this.imagen = imagen;
		this.posicionX = posicionX;
		this.posiciony = posiciony;
		this.haLlegado = false;
		this.numeroPasos = 0;
		contadorRobots++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [imagen=");
		builder.append(imagen);
		builder.append(", posicionX=");
		builder.append(posicionX);
		builder.append(", posiciony=");
		builder.append(posiciony);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append(", numeroPasos=");
		builder.append(numeroPasos);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the filastablero
	 */
	public static int getFilastablero() {
		return filasTablero;
	}

	/**
	 * @return the columnastablero
	 */
	public static int getColumnastablero() {
		return columnasTablero;
	}

	/**
	 * @return the contadorRobots
	 */
	public static int getContadorRobots() {
		return contadorRobots;
	}
	
	

	/**
	 * @return the imagen
	 */
	public char getImagen() {
		return imagen;
	}

	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}

	/**
	 * @return the posiciony
	 */
	public int getPosiciony() {
		return posiciony;
	}

	
	
	/**
	 * @return the destinoX
	 */
	public static int getDestinoX() {
		return destinoX;
	}

	/**
	 * @param destinoX the destinoX to set
	 */
	public static void setDestinoX(int destinoX) {
		Robot.destinoX = destinoX;
	}

	/**
	 * @return the destinoY
	 */
	public static int getDestinoY() {
		return destinoY;
	}

	/**
	 * @param destinoY the destinoY to set
	 */
	public static void setDestinoY(int destinoY) {
		Robot.destinoY = destinoY;
	}
	
	

	/**
	 * @return the haLlegado
	 */
	public boolean isHaLlegado() {
		return haLlegado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(posicionX, posiciony);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return posicionX == other.posicionX && posiciony == other.posiciony;
	}

	

	
	
	
	
	
}
