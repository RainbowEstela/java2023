package Ejercicio10;

public class Test {

	public static void main(String[] args) {
		Consumo car1 = new Consumo(260, 40, 110, 1.94);
		
		System.out.println("el coche consume " + car1.consumoMedio() + " litros por cada 100 kms");
		System.out.println("el coche consume " + car1.consumoEuros() + " euros por cada 100 kms");
	}

}
