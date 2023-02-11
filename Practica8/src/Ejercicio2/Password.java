/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class Password {
	private int longitud;
	private String password;
	
	//CONSTRUTORES
	/**
	 * @param longitud
	 * @param password
	 */
	public Password() {
		super();
		this.longitud = 8;
		this.password = generarPassword();
	}

	/**
	 * @param longitud
	 * @param password
	 */
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.password = generarPassword();
	}

	/**
	 * @param longitud
	 * @param password
	 */
	public Password(Password pass) {
		super();
		this.longitud = pass.longitud;
		this.password = pass.password;
	}
	
	//METODOS
	
	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		int especiales = 0;
		
		String numLista = "0123456789";
		String minusLista = "abcdefghijklmnñopqrstuvwxyz";
		String especialesLista = "!/=?¿#$%&";
		
		for (int i = 0; i < this.password.length(); i++) {
			//contador de numeros
			for(int j = 0; j < numLista.length(); j++) {
				if (this.password.charAt(i) == numLista.charAt(j)) {
					numeros++;
				}
			}
			//contador de minusculas
			for(int k = 0; k < minusLista.length(); k++) {
				if (this.password.charAt(i) == minusLista.charAt(k)) {
					minus++;
				}
			}
			//contador de mayusculas
			for(int l = 0; l < minusLista.length(); l++) {
				if (this.password.charAt(i) == minusLista.toUpperCase().charAt(l)) {
					mayus++;
				}
			}
			//contador de especiales
			for(int m = 0; m < especialesLista.length(); m++) {
				if(this.password.charAt(i) == especialesLista.charAt(m)) {
					especiales++;
				}
			}
		}
		//System.out.println(mayus + " " + minus + " " + numeros + " " + especiales);
		
		if ((mayus >= 1) && (minus >= 2) && (numeros >= 2) && (especiales >= 1)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * método que genera una contraseña segura de minimo 8 caracteres
	 */
	public String generarPassword() {
		StringBuffer passBuffer = new StringBuffer();
		int	letras;
		int mayus;
		int numeros;
		int especiales;
		
		if (this.longitud >= 8) {
			letras = longitudPass((this.longitud - 5), 2);
			mayus = longitudPass((this.longitud - letras - 3), 1); 
			numeros = longitudPass((this.longitud - letras - mayus - 1), 2);
			especiales = this.longitud - letras - mayus - numeros;
		} else {
			letras = longitudPass((8 - 5), 2);
			mayus = longitudPass((8 - letras - 3), 1); 
			numeros = longitudPass((8 - letras - mayus - 1), 2);
			especiales = 8 - letras - mayus - numeros;
		}
		
		int eleccion = 0;
		
		while ((letras > 0) || (mayus > 0) || (especiales > 0) || (numeros > 0)){
			eleccion = longitudPass(4,1);
			
			switch (eleccion) {
				case 1: {
					if (letras > 0) {
						passBuffer.append( (char) longitudPass(122,97));
						letras--;
					}
					break;
				}
				case 2: {
					if (mayus > 0) {
						passBuffer.append( (char) longitudPass(90,65));
						mayus--;
					}
					break;
				}
				case 3: {
					if (especiales > 0) {
						passBuffer.append( eligeEspecial());
						especiales--;
					}
					break;
				}
				
				case 4: {
					if (numeros > 0) {
						passBuffer.append( longitudPass(9, 0));
						numeros--;
					}
					break;
				}
			}	
		}
		
		return passBuffer.toString();
	}
	
	/**
	 * método que retorna un número entre la longitud maxima y la logitud minima
	 * @param max
	 * @param min
	 * @return
	 */
	private static int longitudPass(int max, int min) {
		int longitud = (int) (Math.random() * (max + 1 - min) ) + min;
		return longitud;
	}
	
	/**
	 * metodo que devuelve un caracter especial
	 * @return
	 */
	private static char eligeEspecial(){
		char especial = '\0';
		int opcion = longitudPass(6,1);
		
		switch (opcion) {
			case 1: {
				especial = '!';
				break;
			}
			case 2: {
				especial = (char) longitudPass(38,35);
				break;
			}
			case 3: {
				especial = '/';
				break;
			}
			case 4: {
				especial = '=';
				break;
			}
			case 5: {
				especial = '?';
				break;
			}
			case 6: {
				especial = '¿';
				break;
			}

		}
		
		return especial;
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword();
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	
	
}
