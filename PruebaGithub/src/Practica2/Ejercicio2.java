package Practica2;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		int a = 0, b = 0, c = 0;
		
		//a
		a = 3; //a vale 3 porque acabamos de asignarle 3
		
		System.out.println(a);
		
		//b
		b = 4; //b vale b porque acabamos de asignarle 4
		
		System.out.println(b);
		
		//c
		c = 2 * a * b; //como a vale 3 y b vale 4 al multiplicar los 3 numeros nos da 24, c = 24
		
		System.out.println(c);
		
		//d
		a = a + 2; //como a valia 2 le estamos sumando 2 y guardandolo en la misma variable por tanto a = 5
		
		System.out.println(a);
		
		//e
		b = c - a; //a vale 5 y c 24 la resta es 19, b = 19
		
		System.out.println(b);
		
		
	}

}
