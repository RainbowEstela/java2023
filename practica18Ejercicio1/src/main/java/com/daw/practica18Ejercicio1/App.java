package com.daw.practica18Ejercicio1;

import java.util.Scanner;

import clases.Discord;
import clases.Gamer;
import clases.Nivel;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * pinta el menu
	 */
	public static void pintarMenu() {
		System.out.println("1. Añadir jugador");
		System.out.println("2. Eliminar jugador");
		System.out.println("3. Buscar jugador");
		System.out.println("4. Listar jugadores");
		System.out.println("5. Salir");
	}
	
	/**
	 * pasa un texto a un enum nivel
	 * @param nivelString
	 * @return
	 */
	public static Nivel pasarANivel(String nivelString) {
		Nivel n = null;
		nivelString = nivelString.toUpperCase();
		
		switch (nivelString) {
			case "DIOS": {
				n = Nivel.DIOS;
				break;
			}
			case "MAQUINA": {
				n = Nivel.MAQUINA;
				break;
			}
			case "BUENO": {
				n = Nivel.BUENO;
				break;
			}
			case "NORMAL": {
				n = Nivel.NORMAL;
				break;
			}
			case "REGULAR": {
				n = Nivel.REGULAR;
				break;
			}
			case "MALILLO": {
				n = Nivel.MALILLO;
				break;
			}
			case "PAQUETE": {
				n = Nivel.PAQUETE;
				break;
			}
		}
		
		return n;
	}
	
    public static void main( String[] args )
    {
    	Discord dc = new Discord();
    	int opc = 0;
    	Scanner sc = new Scanner(System.in);
    	String[] parametrosGamer = new String[4];//nombre,email,juego,nivel
    	
    	while (opc != 5) {
			pintarMenu();
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
				case 1: {//añadir jugador
					System.out.println("CREAR NUEVO GAMER:");
					System.out.println("-----------------");
					System.out.println("nombre:");
					parametrosGamer[0] = sc.nextLine();
					System.out.println("email:");
					parametrosGamer[1] = sc.nextLine();
					System.out.println("juego:");
					parametrosGamer[2] = sc.nextLine();
					System.out.println("nivel:");
					System.out.println("(DIOS,MAQUINA,BUENO,NORMAL,REGULAR,MALILLO,PAQUETE)");
					parametrosGamer[3] = sc.nextLine();
					
					Nivel nivel = pasarANivel(parametrosGamer[3]);
					
					if (nivel != null) {
						dc.addGamer(new Gamer(parametrosGamer[0], parametrosGamer[1], parametrosGamer[2], nivel));
					} else {
						System.out.println("Error: nivel no reconocido");
					}
					
					break;
				}
				case 2: {//eliminar jugador
					System.out.println("BORRAR GAMER:");
					System.out.println("-------------");
					System.out.println("nombre:");
					parametrosGamer[0] = sc.nextLine();
					
					dc.removeGamer(new Gamer(parametrosGamer[0], "", "", null));
					break;
				}
				case 3: {//buscar jugador
					System.out.println("BUSCAR GAMER:");
					System.out.println("-------------");
					System.out.println("nombre:");
					parametrosGamer[0] = sc.nextLine();
					
					System.out.println(dc.findGamer(parametrosGamer[0]));
					break;
				}
				case 4: {//listar jugadores
					dc.listGamers();
					break;
				}
				case 5: {//guardamos los cambios en el fichero y salimos del menu
					dc.saveGamers();
					break;
				}
				default:
					System.out.println("ERROR: OPCION NO VALIDA");
			}
			
		}
    
    }
}
