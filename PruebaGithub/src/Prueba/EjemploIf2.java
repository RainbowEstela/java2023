package Prueba;

public class EjemploIf2 {

	public static void main(String[] args) {

		int edad = 30;
		char sexo = 'M';
		
		if (sexo == 'M') { //genero mujer
			
			if ((edad >= 0) && (edad <= 11)) { //niña
				
				System.out.println("hola niña");
				
			} else if ((edad >= 12) && (edad <= 18)) { //adolescente
				
				System.out.println("hola adolescente");
				
			} else if ((edad >= 19) && (edad <= 29)) { //joven
				
				System.out.println("hola joven");
				
			} else if ((edad >= 30) && (edad <= 55)) { //mujer
				
				System.out.println("hola mujer");
				
			} else if (edad >= 56) { //vieja
				
				System.out.println("hola vieja");
				
			} else { //dato erroneo
				
				System.out.println("datos erroneos");
			}
				
			
		} else if (sexo == 'H') { //genero hombre
			
			if ((edad >= 0) && (edad <= 11)) { //niño
				
				System.out.println("hola niño");
				
			} else if ((edad >= 12) && (edad <= 18)) { //adolescente
				
				System.out.println("hola adolescente");
				
			} else if ((edad >= 19) && (edad <= 29)) { //joven
				
				System.out.println("hola joven");
				
			} else if ((edad >= 30) && (edad <= 55)) { //hombre
				
				System.out.println("hola hombre");
				
			} else if (edad >= 56) { //viejo
				
				System.out.println("hola viejo");
				
			} else { //dato erroneo
				
				System.out.println("datos erroneos");
			}
						
		} else { //genero erroneo
			
			System.out.println("genero erroneo");
		}

	}

}
