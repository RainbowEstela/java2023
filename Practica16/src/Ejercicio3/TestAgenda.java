package Ejercicio3;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		var agen = new Agenda();
		int opc = 0;
		String nombre = "";
		String telefono ="";
		boolean exito = false;
		Scanner sc = new Scanner(System.in);
		
		while (opc != 6) {
			System.out.println("AGENDA TELEFÓNICA");
			System.out.println("-----------------");
			System.out.println("1. añadir nuevo contacto");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contactos");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Estado de la agenda");
			System.out.println("6. salir");
			System.out.println("Elige una opci�n (1-6):");
			
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1 :{
				System.out.println("nombre:");
				nombre = sc.nextLine();
				System.out.println("telefono:");
				telefono = sc.nextLine();
				
				exito = agen.addContacto(nombre,telefono);
				
				if (exito == true) {
					System.out.println("contacto añadido correctamente");
				} else {
					System.out.println("ERROR: contacto existente");
				}
				break;
			}
			case 2:{
				System.out.println(agen.listarContactos());
				break;
			}
			case 3:{
				System.out.println("nombre del contacto a buscar:");
				System.out.println("*se mostraron las coincidencias en caso de no estar completo*");
				nombre = sc.nextLine();
				System.out.println(agen.BuscarContacto(nombre));
				break;
			}
			case 4:{
				System.out.println("nombre y apellidos del contacto a borrar:");
				nombre = sc.nextLine();
				
				exito = agen.eliminar(nombre);
				if (exito == true) {
					System.out.println("contacto borrado");
				} else {
					System.out.println("ERROR: el contacto no existe");
				}
				break;
			}
			case 5:{
				System.out.println("agenda operativa");
				break;
			}
			case 6:
				System.out.println("Adios, tenga un buen día");
				break;
			default:
				System.out.println("Error: opcion no válida");
				break;
			}
			
		}

	}

}
