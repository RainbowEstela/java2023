package Practica2;

public class Ejercicio6 {

	public static void main(String[] args) {

		/**
		 * public class Ejercicio5 { 
		 * public static void main(String[] args) {
		 * System.out.println("Hola usuario."+" Bienvenido."); 
		 * String dia = "Lunes";
		 * System.out.println("Hoy es " + dia); int hora = 12;
		 * System.out.println("Son las " + hora + " en punto."); 
		 * System.out.println("Dentro de 2 horas serán las" + hora + 2 + " en punto"); 
		 * System.out.println("Dentro de 2 horas serán las" + (hora + 2) + " en punto"); 
		 * } 
		 * }
		 */
		
		//escribirá:
		/**
		 * Hola usuario. bienvenido //porque son dos strings de texto no hay problema
		 * Hoy es Lunes // como dia toma el valor "lunes" se suma al texto
		 * Son las 12 en punto //hora toma el valor 12 y aunque es un entero la funcion la escribe igualmente
		 * Dentro de 2 horas serán las 122 en punto //como hay strings en la funcion no hará la operacion y escribira 122 y no 14 que seria la suma
		 * Dentro de 2 horas serán las 14 en punto //en este caso al estar la operacion entre parentesis primero hace esa operacion y luego junta los strings
		 */

	}
}
