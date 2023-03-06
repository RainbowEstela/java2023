package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class Aplicacion {

	public static void main(String[] args) {
		TrianguloRectangulo tr = new TrianguloRectangulo(3,4,5);
		TrianguloIsosceles ti = new TrianguloIsosceles(2, 2, 3);
		TrianguloEscaleno te = new TrianguloEscaleno(5, 7, 3);
		TrianguloEquilatero teq = new TrianguloEquilatero(2, 2, 2);
		
		ArrayList<Triangulo> misTriangulos = new ArrayList<>();
		misTriangulos.add(teq);
		misTriangulos.add(te);
		misTriangulos.add(ti);
		misTriangulos.add(tr);
		
		Collections.sort(misTriangulos);
		
		for (Triangulo t : misTriangulos) {
			System.out.println(t.area());
		}
	}

}
