package Practica2;

public class Ejercicio12 {

	public static void main(String[] args) {
		int a = 10, b = 5, aux;
		
		System.out.println("El valor de A era: " + a);
		System.out.println("El valor de B era: " + b);
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("El valor de A es: " + a);
		System.out.println("El valor de B es: " + b);

	}

}
