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
	
	/**
	 * @param palabraResolver
	 * @param palabraProgreso
	 */
	public Ahorcado() {
		super();
		this.palabraResolver = PALABRAS[(int) (Math.random() * PALABRAS.length)];
		this.palabraProgreso = palabraOculta(palabraResolver);
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
	public boolean intentar(char letra) {
		boolean letraEsta = false;
		var sb = new StringBuffer();
		
		for (int i = 0; i < this.palabraResolver.length(); i++) {
			
			if (letra == this.palabraResolver.charAt(i)) {
				sb.append(letra);
				letraEsta = true;
			} else {
				sb.append('*');
			}
		}
		
		this.palabraProgreso = sb.toString();
		return letraEsta;
	}
	
	/**
	 * recive una palabra y devuelve si son iguales o no
	 */
	public boolean resolver(String palabra) {
		if (this.palabraResolver.equals(palabra)) {
			this.palabraProgreso = this.palabraResolver;
			return true;
		} else {
			return false;
		}
	}
	
}
