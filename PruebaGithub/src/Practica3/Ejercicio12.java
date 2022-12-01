package Practica3;

public class Ejercicio12 {

	public static void main(String[] args) {
		int numero =3468, contador = 0;
		
		if (numero > 3999) {
			System.out.println("numero demasiado grande");
			
		} else {
			//para escribir M 1000
			contador = numero / 1000;
			numero %= 1000;
			for(int i = contador; i > 0; i--) {
				System.out.print("M");
			}
			
			//para los CM 900
			contador = numero / 900;
			numero %= 900;
			if (contador == 1) {
				System.out.print("CM");
			}
			
			//para los D 500
			contador = numero / 500;
			numero %= 500;
			if (contador == 1) {
				System.out.print("D");
			}
			
			//para los CD 400
			contador = numero / 400;
			numero %= 400;;
			if (contador == 1) {
				System.out.print("CD");
			}
			
			//para los C 100
			contador = numero / 100;
			numero %= 100;
			for(int i = contador; i > 0; i--) {
				System.out.print("C");
			}
			
			//para los XC 90
			contador = numero / 90;
			numero %= 90;
			if (contador == 1) {
				System.out.print("XC");
			}
			
			//para los L 50
			contador = numero / 50;
			numero %= 50;
			if (contador == 1) {
				System.out.print("L");
			}
			
			//para los XL 40
			contador = numero / 40;
			numero %= 40;
			if (contador == 1) {
				System.out.print("XL");
			}
			
			//para los X 10
			contador = numero / 10;
			numero %= 10;
			for(int i = contador; i > 0; i--) {
				System.out.print("X");
			}
			
			//para los IX 9
			contador = numero / 9;
			numero %= 9;
			if (contador == 1) {
				System.out.print("IX");
			}
			
			//para los V 5
			contador = numero / 5;
			numero %= 5;
			if (contador == 1) {
				System.out.print("V");
			}
			
			//para los IV 4
			contador = numero / 4;
			numero %= 4;
			if (contador == 1) {
				System.out.print("IV");
			}
			
			//para los I 1
			contador = numero / 1;
			numero %= 1;
			for(int i = contador; i > 0; i--) {
				System.out.print("I");
			}
		}

	}

}
