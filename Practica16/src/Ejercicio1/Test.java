package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		ColaList<Proceso> miCola = new ColaList<>();
		
		miCola.meter(new Proceso(1, "chrome", 0.6, 0.5, 5));
		miCola.meter(new Proceso(1, "virus", 0.9, 0.9, 1));
		miCola.meter(new Proceso(45, "Naraka", 0.3, 0.1, 10));
		miCola.meter(new Proceso(7, "Discord", 0.2, 0.3, 7));
		//comprobacion de que no acepta repetidos y añade en orden
		System.out.println(miCola.toString());
		
		//comprobacion de que peek no quita de la cola
		System.out.println("");
		System.out.println("uso de peek");
		System.out.println(miCola.peek());
		System.out.println(miCola.toString());
		
		//comprobacion 
		System.out.println("");
		System.out.println("uso de poll");
		System.out.println(miCola.poll());
		System.out.println(miCola.toString());
	}

}
