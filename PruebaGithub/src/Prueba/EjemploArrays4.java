package Prueba;

public class EjemploArrays4 {
	public static void pintaVector(int vector[]) {
			
			for(int j = vector.length -1; j > 1; j--) {
				if (vector[j] % j != 0) {
					System.out.print(vector[j] + " ");
				}
			}

		
		System.out.println("");
	}
	public static void main(String[] args) {
		int primos[] = new int[100];

		for (int i = 0; i < primos.length; i++) {

			primos[i] = (int) (Math.random() * 100) + 1;
		}
		
		pintaVector(primos);
		

	}

}
