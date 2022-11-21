package Prueba;

public class EjemploFor2 {

	public static void main(String[] args) {
		int sumaImpar = 0;
		
		for (int i = 1; i <= 1000; i += 2) {
			sumaImpar += i;
		}
		System.out.println(sumaImpar);
	}

}
