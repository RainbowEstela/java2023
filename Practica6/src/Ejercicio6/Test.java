package Ejercicio6;

public class Test {

	public static void main(String[] args) {
		Satelite sat = new Satelite();
		
		sat.printPosicion();
		System.out.println("");
		System.out.println(sat.enOrbita());
		sat.variaPosicion(60, -50);
		sat.variaAltura(1400);
		sat.printPosicion();
		System.out.println("");
		System.out.println(sat.enOrbita());

	}

}
