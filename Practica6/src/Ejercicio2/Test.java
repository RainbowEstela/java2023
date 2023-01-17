package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		Coche ch = new Coche();
		
		System.out.println(ch.getVelocidad());
		ch.acelera(120);
		System.out.println(ch.getVelocidad());
		ch.frena(130);
		System.out.println(ch.getVelocidad());

	}

}
