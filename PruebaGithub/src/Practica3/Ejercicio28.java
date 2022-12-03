package Practica3;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		String nombrePersonaUno = "", primeroPersonaUno = "", segundoPersonaUno = "";
		String nombrePersonaDos = "", primeroPersonaDos = "", segundoPersonaDos = "";
		boolean segundoAntesQuePrimero = false;
		int longitud = 0;
		Scanner sc = new Scanner(System.in);
		
		//datos primera persona
		
		System.out.println("Primera persona: primer apellido");
		primeroPersonaUno = sc.nextLine();
		
		System.out.println("Primera persona: segundo apellido");
		segundoPersonaUno = sc.nextLine();
		
		System.out.println("Primera persona: nombre");
		nombrePersonaUno = sc.nextLine();
		
		
		//datos segunda persona
		
		System.out.println("Segunda persona: primer apellido");
		primeroPersonaDos = sc.nextLine();
		
		System.out.println("Segunda persona: segundo apellido");
		segundoPersonaDos = sc.nextLine();
		
		System.out.println("Segunda persona: nombre");
		nombrePersonaDos = sc.nextLine();
		

		/*
		 * comparacion del primer apellido
		 */
		//son iguales?
		if (primeroPersonaUno.equals(primeroPersonaDos)) {
			/*
			 * comparacion segundo apellido
			 */
			//son iguales?
			if (segundoPersonaUno.equals(segundoPersonaDos)) {
				/*
				 * comparacion nombre
				 */
				//son iguales?
				if (nombrePersonaUno.equals(nombrePersonaDos)) {
					
				} else {
					
					//es igual pero uno mas corto?
					if (nombrePersonaUno.length() <= nombrePersonaDos.length()) {
						//dos es uno pero con cosas?
						if (nombrePersonaUno.equals(nombrePersonaDos.substring(0, nombrePersonaUno.length()) ) ) {
							segundoAntesQuePrimero = false;
						} else {
							for (int i = 0; i < nombrePersonaUno.length(); i++) {
								if ((int) nombrePersonaUno.charAt(i) < (int) nombrePersonaDos.charAt(i) ) {
									segundoAntesQuePrimero = false;
									break;
								} else if ( (int) nombrePersonaUno.charAt(i) > (int) nombrePersonaDos.charAt(i) ) {
									segundoAntesQuePrimero = true;
									break;
								}
							}
						}
					} else { //primero mas largo que segundo
						
						//dos es uno pero con cosas?
						if (nombrePersonaDos.equals(nombrePersonaUno.substring(0, nombrePersonaDos.length()) ) ) {
							segundoAntesQuePrimero = true;
						} else {
							for (int i = 0; i < nombrePersonaDos.length(); i++) {
								if ((int) nombrePersonaUno.charAt(i) < (int) nombrePersonaDos.charAt(i) ) {
									segundoAntesQuePrimero = false;
									break;
								} else if ( (int) nombrePersonaUno.charAt(i) > (int) nombrePersonaDos.charAt(i) ) {
									segundoAntesQuePrimero = true;
									break;
								}
							}
						}	
					}
				}
				
			} else {
				
				//es igual pero uno mas corto?
				if (segundoPersonaUno.length() <= segundoPersonaDos.length()) {
					//dos es uno pero con cosas?
					if (segundoPersonaUno.equals(segundoPersonaDos.substring(0, segundoPersonaUno.length()) ) ) {
						segundoAntesQuePrimero = false;
					} else {
						for (int i = 0; i < segundoPersonaUno.length(); i++) {
							if ((int) segundoPersonaUno.charAt(i) < (int) segundoPersonaDos.charAt(i) ) {
								segundoAntesQuePrimero = false;
								break;
							} else if ( (int) segundoPersonaUno.charAt(i) > (int) segundoPersonaDos.charAt(i) ) {
								segundoAntesQuePrimero = true;
								break;
							}
						}
					}
				} else { //primero mas largo que segundo
					
					//dos es uno pero con cosas?
					if (segundoPersonaDos.equals(segundoPersonaUno.substring(0, segundoPersonaDos.length()) ) ) {
						segundoAntesQuePrimero = true;
					} else {
						for (int i = 0; i < segundoPersonaDos.length(); i++) {
							if ((int) segundoPersonaUno.charAt(i) < (int) segundoPersonaDos.charAt(i) ) {
								segundoAntesQuePrimero = false;
								break;
							} else if ( (int) segundoPersonaUno.charAt(i) > (int) segundoPersonaDos.charAt(i) ) {
								segundoAntesQuePrimero = true;
								break;
							}
						}
					}	
				}
				
			}
		} else {
			//es igual pero uno mas corto?
			if (primeroPersonaUno.length() <= primeroPersonaDos.length()) {
				//dos es uno pero con cosas?
				if (primeroPersonaUno.equals(primeroPersonaDos.substring(0, primeroPersonaUno.length()) ) ) {
					segundoAntesQuePrimero = false;
				} else {
					for (int i = 0; i < primeroPersonaUno.length(); i++) {
						if ((int) primeroPersonaUno.charAt(i) < (int) primeroPersonaDos.charAt(i) ) {
							segundoAntesQuePrimero = false;
							break;
						} else if ( (int) primeroPersonaUno.charAt(i) > (int) primeroPersonaDos.charAt(i) ) {
							segundoAntesQuePrimero = true;
							break;
						}
					}
				}
			} else { //primero mas largo que segundo
				
				//dos es uno pero con cosas?
				if (primeroPersonaDos.equals(primeroPersonaUno.substring(0, primeroPersonaDos.length()) ) ) {
					segundoAntesQuePrimero = true;
				} else {
					for (int i = 0; i < primeroPersonaDos.length(); i++) {
						if ((int) primeroPersonaUno.charAt(i) < (int) primeroPersonaDos.charAt(i) ) {
							segundoAntesQuePrimero = false;
							break;
						} else if ( (int) primeroPersonaUno.charAt(i) > (int) primeroPersonaDos.charAt(i) ) {
							segundoAntesQuePrimero = true;
							break;
						}
					}
				}	
			}
		}
		
		//montrar nombres
		if (segundoAntesQuePrimero == true) {
			System.out.println(primeroPersonaDos + " " + segundoPersonaDos + ", " + nombrePersonaDos);
			System.out.println(primeroPersonaUno + " " + segundoPersonaUno + ", " + nombrePersonaUno);
		} else if (segundoAntesQuePrimero == false){
			System.out.println(primeroPersonaUno + " " + segundoPersonaUno + ", " + nombrePersonaUno);
			System.out.println(primeroPersonaDos + " " + segundoPersonaDos + ", " + nombrePersonaDos);
		}
		
		/*
		 * Nota para mi
		 * PODIA HABER HECHO 4 FUNCIONES Y ME HUBIERA EVITADO TANTO CODIGO REPETIDOOOOOO
		 */
		
	}

}
