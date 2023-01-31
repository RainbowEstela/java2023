package Ejercicio1;

import java.util.Scanner;

import Ejercicio1.Persona.Genero;

public class Test {

	public static void main(String[] args) {
		var per = new Persona();
		var sc = new Scanner(System.in);
		boolean valido = false;
		
		//set nombre
		System.out.println("Nombre:");
		String nombre = sc.nextLine();
		per.setNombre(nombre);
		
		//set dni
		System.out.println("DNI");
		String dni = sc.nextLine();
		per.setDni(dni);
		
		//set genero
		do {
		System.out.println("1. Hombre");
		System.out.println("2. mujer");
		System.out.println("3. otro");
		System.out.println("Género:");
		int opcion = Integer.parseInt(sc.nextLine());
		
		switch (opcion) {
			case 1: {
				per.setGenero(Genero.H);
				valido = true;
				break;
			}
			case 2: {
				per.setGenero(Genero.M);
				valido = true;
				break;
			}
			case 3: {
				per.setGenero(Genero.O);
				valido = true;
				break;
			}
		}
		
		} while (valido == false);
		
		//set peso
		System.out.println("peso:");
		double peso = Double.parseDouble(sc.nextLine());
		per.setPeso(peso);
		
		//set altura
		System.out.println("altura:");
		double altura = Double.parseDouble(sc.nextLine());
		per.setAltura(altura);
		
		//set edad
		System.out.println("edad:");
		int edad = Integer.parseInt(sc.nextLine());
		per.setEdad(edad);
		
		//escribir persona
		System.out.println(per.toString());
		
		//decir si es mayor de edad
		if (per.esMayorDeEdad() == true) {
			System.out.println(per.getNombre() + " es mayor de edad");
		} else {
			System.out.println(per.getEdad() + " NO es mayor de edad");
		}
		
		
	}

}
