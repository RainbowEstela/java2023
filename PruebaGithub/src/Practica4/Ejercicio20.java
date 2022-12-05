package Practica4;

import java.util.Scanner;

public class Ejercicio20 {
	/*
	 * rellena una pila con \0
	 */
	public static void crearPila(String array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = "*";
		}
	}
	
	/*
	 * muestra el contenido de la pila
	 */
	public static void mostrarPila(String array[]) {
		System.out.print("( ");
		for (int i = 0; i < array.length; i++) {
			if (i == (array.length - 1)) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println(" )");
	}
	
	/*
	 * llena el elemento
	 */
	public static void insertarElemento(String array[]) {
		int ultimoVacio = -1;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("*")) {
				ultimoVacio = i;
				break;
			}
		}

		if (ultimoVacio == -1) {
			System.out.println("Error: Pila llena");
		} else {
			System.out.print("Introcuzca nuevo valor: ");
			array[ultimoVacio] = sc.nextLine();
		}

	}
	
	/*
	 * saca el ultimo elemento de la pila
	 */
	public static void sacarElemento(String array[]) {
		int ultimoLleno = -1;
		
		for (int i = (array.length - 1); i >= 0; i--) {
			if (array[i].equals("*")) {
			} else {
				ultimoLleno = i;
				break;
			}
		}
		
		if (ultimoLleno == -1) {
			System.out.println("Error: pila vacia");
		} else {
			System.out.println("Se borró el siguiente elemento: " + array[ultimoLleno]);
			array[ultimoLleno] = "*";
		}
	}
	
	public static void main(String[] args) {
		String pila[] = new String[10];
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		crearPila(pila);
		
		do {
			System.out.println("1. mostrar pila");
			System.out.println("2. añadir a la pila");
			System.out.println("3. sacar ultimo elemento");
			System.out.println("4. finalizar programa");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				mostrarPila(pila);
				break;
			}
			case 2: {
				insertarElemento(pila);
				break;
			}
			case 3: {
				sacarElemento(pila);
				break;
			}
			case 4: {
				System.out.println("que tenga un buen dia");
				break;
			}
			default:
				System.out.println("Error: opcion no valida");
			}
			
		} while (opcion != 4);
		

		
	}

}
