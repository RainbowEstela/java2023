package Practica2;

public class Ejercicio15 {

	public static void main(String[] args) {
		double miDinero = 2000, interes = 0.0275, hacienda = 0.18;
		double generado;
		
		//interes en un año
		generado = miDinero * interes;
		generado = generado - (generado * hacienda);
		
		//interes en medio año
		generado = generado / 2;
		
		System.out.println("me corresponden " + generado + " euros");
	}

}
