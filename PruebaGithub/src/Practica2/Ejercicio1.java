package Practica2;

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 6, b=2, c =3;
		int resultado = 0;
		
		//a
		resultado = (a * c) % c;
		
		/**
		 * primero se hace la multiplicacion a * c -> 6 * 3 = 18
		 * luego se hace el modulo 18 % c -> 18 % 3 = 0
		 * resultado = 0 
		 */
		
		System.out.println(resultado);
		
		//b
		resultado = a * b / c;
		
		/**
		 * como los dos operadores son del mismo nivel se ejecutan en orden de izquierda a derecha
		 * primero a * b -> 6 * 2 -> 12
		 * luego 12 / c -> 12 / 3 -> 4
		 * resultado = 4
		 */
		
		System.out.println(resultado);
		
		//c
		resultado = c % b + c * b;
		
		/**
		 * primero se hara el modulo c % b -> 3 % 2 = 1
		 * segundo hace la multiplicacion c * b -> 3 * 2 = 6
		 * por ultimo se hace la suma 1 + 6 = 7
		 * resultado = 7
		 */
		
		System.out.println(resultado);
		
		//d
		resultado = a % (a * b * c / (b + c));
		
		/**
		 * primero se ejecuta la suma por estar dentro de los parentesis dentro de los primeros parentesis
		 * b + c -> 2 + 3 = 5
		 * luego se hace la multiplicacion a * b porque el resto de operandos son del mismo nivel
		 * a * b -> 6 * 2 = 12
		 * despues la siguiente multipliacion
		 * 12 * c -> 12 * 3 = 36
		 * ahora se haria la division
		 * 36 / 5 = 7 (es 7 porque es un entero obvia los decimales)
		 * y una vez acabado con el parentesis con lo que nos sobra se hace el modulo
		 * a % 7 -> 6 % 7 = 6
		 */
		
		System.out.println(resultado);
	}

}
