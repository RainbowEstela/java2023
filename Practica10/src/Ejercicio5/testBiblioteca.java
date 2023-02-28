package Ejercicio5;

import java.util.Scanner;

public class testBiblioteca {

	public static void main(String[] args) {
		var miBibloteca = new Biblioteca("c/ naranjo nº 7");
		int opc = 0;
		Scanner sc = new Scanner(System.in);
		String titulo = "";
		Publicacion pub = null;
		miBibloteca.adquirirMaterial(new Libro("123456789", "Platero y yo", 1798, 400));
		miBibloteca.adquirirMaterial(new Libro("435672123", "kika super bruja", 1999, 230));
		miBibloteca.adquirirMaterial(new Libro("763124556", "Quijote", 1898, 600));
		miBibloteca.adquirirMaterial(new Libro("758315463", "la mosca", 2021, 750));
		miBibloteca.adquirirMaterial(new Revista("542613267", "superciencia", 2023, 75, 1));
		miBibloteca.adquirirMaterial(new Libro("784395130", "mas que moda", 2022, 456));
		miBibloteca.adquirirMaterial(new Revista("65223425", "guru informatica", 2020, 45, 10));
		
		while (opc != 4) {
			System.out.println("1. prestar");
			System.out.println("2. devolver");
			System.out.println("3. buscar");
			System.out.println("4. salir");
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1:
				titulo = sc.nextLine();
				pub = miBibloteca.buscar(titulo);
				if (pub != null) {
					pub.
				}
				break;
			case 2:
				
				break;
			case 3:
		
				break;
			case 4:
				System.out.println("*que tenga un buen día*");
				break;
			default:
				System.out.println("*ERROR*: OPCION NO VÁLIDA");
				break;
			}
		}

	}

}
