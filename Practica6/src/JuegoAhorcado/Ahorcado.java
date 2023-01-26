/**
 * 
 */
package JuegoAhorcado;

/**
 * @author user
 *
 */
public class Ahorcado {
	
	final private static String PALABRAS[] = {"coche", "gato", "hormiga", "escalera", "cocina", "cama", "galleta", "chocolate", "bocadillo", "dinosaurio"};
	
	private String palabraResolver;
	private String palabraProgreso;
	private int fallos;
	
	/**
	 * @param palabraResolver
	 * @param palabraProgreso
	 */
	public Ahorcado() {
		super();
		this.palabraResolver = PALABRAS[(int) (Math.random() * PALABRAS.length)];
		this.palabraProgreso = palabraOculta(palabraResolver);
		this.fallos = 0;
	}
	
	private String palabraOculta(String palabra) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < palabra.length(); i++) {
			sb.append('*');
		}
		
		return sb.toString();
	}

	/**
	 * @return the palabraResolver
	 */
	public String getPalabraResolver() {
		return palabraResolver;
	}

	/**
	 * @return the palabraProgreso
	 */
	public String getPalabraProgreso() {
		return palabraProgreso;
	}
	

	/**
	 * mandas una letra y te dice si esta o no y si esta pone la letra donde corresponde en la palabra progreso
	 * @param letra
	 * @return
	 */
	private void intentar(char letra) {
		
		boolean letraEsta = false;
		var sb = new StringBuffer();
		
		for (int i = 0; i < this.palabraResolver.length(); i++) {
			
			if (letra == this.palabraResolver.charAt(i)) {
				sb.append(letra);
				letraEsta = true;
			} else {
				sb.append(this.palabraProgreso.charAt(i));
			}
		}
		
		if (letraEsta == false) {
			this.fallos++;
		}
		
		this.palabraProgreso = sb.toString();
	}
	
	/**
	 * recive una palabra y devuelve si son iguales o no
	 */
	private void resolver(String palabra) {
		if (this.palabraResolver.equals(palabra)) {
			this.palabraProgreso = this.palabraResolver;
		} else {
			this.fallos = 7;
		}
	}
	
	/**
	 * introduce una letra o una palabra para adivinar letra o resolver
	 * suma uno a fallos si no acierta la letra
	 * se acaba el juego si no acierta palabra
	 * retorna true si has perdido y false si aun tienes intentos
	 * @param instruccion
	 * @return
	 */
	public int intento(String instruccion) {
		
		if (this.fallos != 7) {
			if (instruccion.length() == 1 ) {
				this.intentar(instruccion.charAt(0));
			} else {
				this.resolver(instruccion);
			}	
		}
		
		return this.fallos;
	}
	
	/**
	 * metodo que dice si has ganado o no
	 * @return
	 */
	public boolean hasGanado() {
		if (this.palabraResolver.equals(this.palabraProgreso)) {
			return true;
		} else {
			return false;
		}
	}
	
}
