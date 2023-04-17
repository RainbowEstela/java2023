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
	
	//crea un vehiculo si de dan los datos de forma correcta si no devulve null
	public static Vehiculo crearVehiculo(int opc) {
		Scanner sc = new Scanner(System.in);
		TipoFosil tipoFosil = null;
		int opc2 = 0;
		double kw = 0;
		
		if (opc < 1 || opc > 3) {
			System.out.println("Error: opcion no válida");
			return null;
		}
		
		try {
			//pedir datos comunes
			System.out.println("-matricula:");
			String matricula = sc.nextLine();
			
			System.out.println("-marca:");
			String marca = sc.nextLine();
			
			System.out.println("-modelo:");
			String modelo = sc.nextLine();
			
			System.out.println("-color:");
			String color = sc.nextLine();
			
			System.out.println("-precio:");
			double precio = Double.parseDouble(sc.nextLine());
		
			System.out.println("-caballos");
			int caballos = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
				case 1:
					
					System.out.println("-KW:");
					kw = Double.parseDouble(sc.nextLine());
					
					VehiculoElectrico ve = new VehiculoElectrico(matricula, marca, modelo, color, precio, caballos, kw);
					
					return ve;
				case 2:
					
					System.out.println("-KW:");
					kw = Double.parseDouble(sc.nextLine());
					
					System.out.println("1. gasolina");
					System.out.println("2. diesel");
					opc2 = Integer.parseInt(sc.nextLine());
					
					switch (opc2) {
						case 1:
							tipoFosil = TipoFosil.GASOLINA;
							break;
	
						case 2:
							tipoFosil = TipoFosil.DIESEL;
							break;
					}
					
					
					VehiculoHibrido vh = new VehiculoHibrido(matricula, marca, modelo, color, precio, caballos, kw, tipoFosil);
					
					return vh;
				case 3:
					
					System.out.println("1. gasolina");
					System.out.println("2. diesel");
					opc2 = Integer.parseInt(sc.nextLine());
					
					switch (opc2) {
						case 1:
							tipoFosil = TipoFosil.GASOLINA;
							break;
	
						case 2:
							tipoFosil = TipoFosil.DIESEL;
							break;
					}
					
					System.out.println("-capacidad del deposito:");
					double capacidadDeposito = Double.parseDouble(sc.nextLine());
					
					VehiculoFosil vf = new VehiculoFosil(matricula, marca, modelo, color, precio, caballos, tipoFosil, capacidadDeposito);
					return vf;
			}
			
		} catch (Exception e) {
			System.out.println("Datos erroneos");
		}
		
		return null;
	}
	
	//metodo MAIN
	public static void main(String[] args) {
		//declaracion de variables
		Taller tl= new Taller();
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int elec = 0;
		boolean exito =false;
		String matricula = "";
		Vehiculo v = null;
		//bucle menu
		while (opc != 5) {
			menu();
			try {
				opc = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				opc= 0;
			}
			
			
			//opciones
			switch (opc) {
			case 1://ingresar coche
				menuCoches();
				try {
					elec = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					elec= 0;
				}
				
				v = crearVehiculo(elec);
				
				if (v != null) {
					exito = ingresar(tl, v);
					
					if(exito == true) {
						System.out.println("Coche aceptado");
					} else {
						System.out.println("Coche repetido, no se pudo añadir");
					}
					
				} else {
					System.out.println("ERROR: opción no válida");
				}
				break;
			case 2://reparar coche
				System.out.println("matricula del coche reparado:");
				matricula = sc.nextLine();
				v = tl.vehiculoReparado(new Vehiculo(matricula, "", "", "", 0, 0));
				
				if (v != null) {
				System.out.println("datos del vehiculo reparado:");
				System.out.println(v.toString());
				} else {
					System.out.println("Ese coche no est� en el taller");
				}
				break;

			case 3://buscar matricula
				System.out.println("Matricula del coche a buscar");
				matricula = sc.nextLine();
				v = tl.buscarVehiculo(matricula);
				
				if (v != null) {
					System.out.println(v.toString());
				} else {
					System.out.println("Coche no encontrado");
				}
				break;

			case 4://listar coches
				System.out.println(tl.toString()); 
				break;

			case 5://salir
				System.out.println("tenga un buen día");
				break;


			default:
				System.out.println("ERROR: opcion no válida");
				break;
			}
			
		}
	}

}
