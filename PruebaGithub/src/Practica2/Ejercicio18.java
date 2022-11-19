package Practica2;

public class Ejercicio18 {

	public static void main(String[] args) {
		int a = 10, b = 3, d, e; //e estaba definido dos veces y c ninguna
		boolean c = true; //asimiré el valor de c como verdadero
		float x,y;
		
		x = a/b; 
		/**
		 * no hay error de compilacion
		 * el resultado es 3 porque hace la operacion con enteros y luego el resultado entero lo guarda en el float
		 * si quisieramos la parte decimal deberiamos añadir (float) antes de la operacion para convertirla en float
		 */
		
		c = a < b && c;
		/**
		 * en este caso no funciona porque c no es boolean de hecho no estaba definido tendriamos que definirlo y darle un valor inicial
		 * como A no es menor que B es falso y como las dos sentencias deben ser verdaderas por el && c = false
		 */

		d = a + b++;
		/**
		 * D vale 13 y B vale 4 porque primero hace la operacion a + b y luego le suma el 1 de ++
		 */
		
		e = ++a - b;
		/**
		 * E vale 7 y A vale 11 primero le suma 1 a A y luego hace la operacion
		 */
		y = (float) a/b;
		/**
		 * en este caso los decimales si se guardaran
		 * el resultado de 11 / 4 es 2.75
		 */
		
	}

}
