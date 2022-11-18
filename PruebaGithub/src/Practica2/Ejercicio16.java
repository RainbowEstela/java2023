package Practica2;

public class Ejercicio16 {

	public static void main(String[] args) {
		final double pi = 3.14;
		double diametro = 15.5, altura = 42.4;
		double area, perimetro;
		
		//calcular
		area = 2 * pi * (diametro / 2) * ((diametro /2) + altura);
		perimetro = 2 * pi * (diametro / 2) + altura;
		
		//pintar
		System.out.println("area: " + area + " cm3");
		System.out.println("perimetro: " + perimetro + " cm");

	}

}
