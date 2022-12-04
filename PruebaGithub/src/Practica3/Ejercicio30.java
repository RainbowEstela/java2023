package Practica3;

public class Ejercicio30 {
	/*
	 * devuelve un numero aleatorio entre 8 y 25
	 */
	public static int longitudPass(int max, int min) {
		int longitud = (int) (Math.random() * (max + 1 - min) ) + min;
		return longitud;
	}
	
	/*
	 * 
	 */
	public static char eligeEspecial(){
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
	
	/*
	 * devuelve una contraseña váñida
	 */
	public static String geradorDePass() {
		int longitud = longitudPass(25,8);
		String pass = "";
		StringBuffer passBuffer = new StringBuffer();
		int letras = longitudPass((longitud - 2), 1); 
		int mayus = longitudPass((longitud - letras - 1), 1); 
		int especiales = longitud - letras - mayus;
		int eleccion = 0;
		
		while ((letras != 0) || (mayus != 0) || (especiales != 0)) {
			eleccion = longitudPass(3,1);
			
			switch (eleccion) {
				case 1: {
					if (letras != 0) {
						passBuffer.append( (char) longitudPass(122,97));
						letras--;
					}
					break;
				}
				case 2: {
					if (mayus != 0) {
						passBuffer.append( (char) longitudPass(90,65));
						mayus--;
					}
					break;
				}
				case 3: {
					if (especiales != 0) {
						passBuffer.append( eligeEspecial());
						especiales--;
					}
					break;
				}
			}	
		}
		
		pass = passBuffer.toString();
		return pass;
	}
	public static void main(String[] args) {

		System.out.println("Su contraseña segura es: " + geradorDePass());
	}

}
