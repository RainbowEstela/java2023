package Practica2;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//a
		int a='a';
		
		System.out.println(a);
		
		/**
		 * funciona porque traduce el valor del caracter a ascii y nos dice su valor numérico
		 */
		
		
		//b
		//int PI = 3.14;
		//System.out.println(PI);
		
		/**
		 * no funciona porque PI es una palabra reservada, no se puede crear una variable con ese nombre
		 */
		
		//c
		//double PI = 3.14;
		//System.out.println(PI);
		
		/**
		 * no funciona por la misma razon por la que no funcionó el anterior apartado
		 */
		
		//d
		boolean adivina = (1 == 4);
		System.out.println(adivina);
		
		/**
		 * esta bien escrito podemos meter una condicion al inicializar la variable
		 * y la condicion está bien expresada
		 */
		
		//e
		//boolean adivina = (97 == 'a' == 97);
		//System.out.println(adivina);
		
		/**
		 * no funciona porque no se pueden comparar caracteres con numeros
		 */
		
		//f
		//boolean adivina = (97 == 'a' == true);
		//System.out.println(adivina);
		/**
		 * no funciona porque sigue habiendo una comparacion de numero con caracter
		 */
	}

}
