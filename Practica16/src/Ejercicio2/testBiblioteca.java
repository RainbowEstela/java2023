package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class testBiblioteca {

	public static void main(String[] args) {
		var miBibloteca = new Biblioteca("c/ naranjo n� 7");
		int opc = 0;
		Scanner sc = new Scanner(System.in);
		String titulo = "";
		String nomAutor = "";
		String apelAutor = "";
		Publicacion pub = null;
		ArrayList<Publicacion> encontrados = new ArrayList<>();
		
		var l1 = new Libro("123456789", "Platero y yo", 1798, 400);
		var l2 = new Libro("435672123", "kika super bruja", 1999, 230);
		var l3 = new Libro("763124556", "Quijote", 1898, 600);
		var l4 = new Libro("758315463", "la mosca", 2021, 750);
		var l5 = new Libro("784395130", "mas que moda", 2022, 456);
		var r1 = new Revista("542613267", "superciencia", 2023, 75, 1);
		var r2 = new Revista("65223425", "guru informatica", 2020, 45, 10);
		
		var a1 = new Autor("pepe", "garcia", 35, "madrid", "c/ fernandez", "autor1@gmail.com");
		var a2 = new Autor("maria", "garcia", 32, "alicante", "c/ naranjo", "autor2@gmail.com");
		var a3 = new Autor("manolo", "torres", 40, "almeria", "c/ mercedes", "autor3@gmail.com");
		
		l1.addAutor(a1);
		l1.addAutor(a2);
		l1.addAutor(a3);
		
		l2.addAutor(a2);
		
		l3.addAutor(a3);
		
		l4.addAutor(a1);
		l4.addAutor(a3);
		
		l5.addAutor(a1);
		
		r1.addAutor(a2);
		
		r2.addAutor(a1);
		
		miBibloteca.adquirirMaterial(l1);
		miBibloteca.adquirirMaterial(l2);
		miBibloteca.adquirirMaterial(l3);
		miBibloteca.adquirirMaterial(l4);
		miBibloteca.adquirirMaterial(l5);
		miBibloteca.adquirirMaterial(r1);
		miBibloteca.adquirirMaterial(r2);
		
		while (opc != 5) {
			System.out.println("1. prestar");
			System.out.println("2. devolver");
			System.out.println("3. buscar por titulo");
			System.out.println("4. buscar por autor");
			System.out.println("5. salir");
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1:
				System.out.println("Introduce el titulo de la publicacion");
				titulo = sc.nextLine();
				pub = miBibloteca.buscar(titulo);
				if (pub != null) {
					pub.presta();
					System.out.println("le hemos prestado el articulo " + pub.toString());
				} else {
					System.out.println("Error: el libro no está en la libreria");
				}
				break;
			case 2:
				System.out.println("Introduce el titulo de la publicacion");
				titulo = sc.nextLine();
				pub = miBibloteca.buscar(titulo);
				if (pub != null) {
					pub.devuelve();
					System.out.println("ha devuelto el articulo " + pub.toString());
				} else {
					System.out.println("Error: el libro no está en la libreria");
				}
				break;
			case 3:
				System.out.println("Introduce el titulo de la publicacion");
				titulo = sc.nextLine();
				pub = miBibloteca.buscar(titulo);
				if (pub != null) {
					System.out.println("hemos encontrado el siguiente articulo " + pub.toString());
				} else {
					System.out.println("lo sentimos no disponemos de esa publicacion");
				}
				break;
			case 4:
				System.out.println("digame el nombre del autor");
				nomAutor = sc.nextLine();
				System.out.println("digame el apellido del autor");
				apelAutor =sc.nextLine();
				encontrados = miBibloteca.buscar(new Autor(nomAutor, apelAutor, 0, "", "", ""));
				
				System.out.println("hemos encontrado las siguientes publicaciones del autor " + nomAutor + " " + apelAutor);
				for (Publicacion p : encontrados) {
					System.out.println(p.toString());
				}
				break;
			case 5:
				System.out.println("*que tenga un buen dia*");
				break;
			default:
				System.out.println("*ERROR*: OPCION NO VALIDA");
				break;
			}
		}

	}

}
