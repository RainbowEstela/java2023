package Ejercicio5;

public class Test {

	public static void main(String[] args) {
		Numero num = new Numero();
		
		num.setEntero(35);
		System.out.println(num.getValor());
		num.suma(45);
		System.out.println(num.getDouble());
		num.resta(60);
		System.out.println(num.getValor());

	}

}
