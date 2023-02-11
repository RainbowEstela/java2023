package Ejercicio1;

import java.util.Scanner;

import Ejercicio1.Persona.Genero;

public class Test {

	public static void main(String[] args) {
		var per = new Persona();
		var sc = new Scanner(System.in);
		int mci = 0;
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
		System.out.println("altura (en metros):");
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
		
		//comporbar MCI
		mci = per.calcularIMC();
		
		switch (mci) {
			case -1:
				System.out.println(per.getNombre() + " tiene sobrepeso");
				break;
			case 0:
				System.out.println(per.getNombre() + " está en su peso ideal");
				break;
			case 1:
				System.out.println(per.getNombre() + " tiene infrapeso");
				break;
	
		}
		
		//creacion de persona igual
		var per2 = new Persona(per);
		per2.setAltura(0);
		per2.setEdad(0);
		per2.setGenero(Genero.O);
		per2.setNombre("nombre");
		per2.setPeso(400);
		
		if (per.equals(per2)) {
			System.out.println("son la misma persona");
		} else {
			System.out.println("no son la misma persona");
		}
		
	}

}
