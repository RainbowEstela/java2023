package Ejercicio4;

import java.util.Scanner;

import Ejercicio4.Vehiculo.Estado;

public class TestTaller {
	//muestra el menu principal
	public static void menu() {
		System.out.println("1. ingresar coche");
		System.out.println("2. coche reparado");
		System.out.println("3. buscar por matricula");
		System.out.println("4. listar coches en el taller");
		System.out.println("5. salir");
	}
	
	//muestra el menu de coches
	public static void menuCoches() {
		System.out.println("1. vehiculo electrico");
		System.out.println("2. vehiculo hibrido");
		System.out.println("3. vehiculo fosil");
	}
	
	//ingresa un vehiculo al taller
	public static boolean ingresar(Taller t, Vehiculo v) {
		return t.ingresarCoche(v); 
	}
	
	//repara un vehiculo
	public static void reparado(Taller t, String matricula) {
		Vehiculo v = t.vehiculoReparado(t.buscarVehiculo(matricula));
		if (v != null) {
			System.out.println("Se reparó el coche:");
			System.out.println(v.toString());
			t.eliminarVehiculo(v);
		} else {
			System.out.println("El coche no se encuentra en el taller");
		}
	}
	
	//pinta el vehiculo a buscar si lo encuentra
	public static void buscar(Taller t, String matricula) {
		Vehiculo v = t.buscarVehiculo(matricula);
		
		if(v != null) {
			System.out.println("encontrado:");
			System.out.println(v.toString());
		} else {
			System.out.println("El coche de matricula " + matricula + " no se encuentra en el taller");
		}
	}
	
	//lista los vehiculos del taller
	public static void listar(Taller t) {
		t.toString();
	}
	
	public static Vehiculo crearVehiculo(int opc) {
		Scanner sc = new Scanner(System.in);
		
		switch (opc) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
	
			break;

		default:
			System.out.println("Error: opcion no válida");
			break;
		}
	}
	
	public static void main(String[] args) {
		Taller tl= new Taller();
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int elec = 0;
		
		while (opc != 5) {
			menu();
			try {
				opc = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				opc= 0;
			}
			
			
			
			switch (opc) {
			case 1:
				menuCoches();
				try {
					elec = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					elec= 0;
				}
				
				
				ingresar(tl, null);
				break;
			case 2:
				
				break;

			case 3:
		
				break;

			case 4:
		
				break;

			case 5:
				System.out.println("tenga un buen día");
				break;


			default:
				System.out.println("ERROR: opcion no válida");
				break;
			}
			
		}
	}

}
