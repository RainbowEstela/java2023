package Ejercicio4;

public class TestFinanzas {

	public static void main(String[] args) {
		Finanzas fin = new Finanzas();
		Finanzas fin2 = new Finanzas(2);
		double miCambio = 0;
		
		miCambio = fin.dolarToEuro(25);
		System.out.println(miCambio + " euros");
		miCambio = fin.euroToDolar(34);
		System.out.println(miCambio + " dollars");
 
	}

}
