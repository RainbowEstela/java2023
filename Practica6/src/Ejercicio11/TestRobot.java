package Ejercicio11;

import java.util.ArrayList;
import java.lang.Thread;

public class TestRobot {
	/**
	public static void noRellanaArrays(char[][] tablero) {
		for (char[] i : tablero) {
			for (char elemento: i) {
				elemento = 't';
			}
		}
		
	}
	
	public static void noPintaArrays(char[][] tablero) {
		for (char[] i : tablero) {
			for (char elemento: i) {
				System.out.print(elemento);
			}
			
			System.out.println("");
		}
	}
	*/
	/**
	 * funcion que rellana un array doble de characters con *
	 * @param tablero
	 */
	public static void rellenaArrays(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = '*';
			}
		}
	}
	
	/**
	 * pinta un array doble tipo char
	 * @param tablero
	 */
	public static void pintaArrays(char [][] tablero) {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
	
	/**
	 * crear tantos robots en un arraylist de robots como cantidad se aporte
	 * @param misBots
	 * @param cantidad
	 */
	public static void crearRobots(ArrayList<Robot> misBots, int cantidad) {
		for (int i = 1; i <= cantidad; i++ ) {
			
			var posX = (int) (Math.random() * (Robot.getColumnastablero() + 1));
			var posY = (int) (Math.random() * (Robot.getColumnastablero() + 1));
			var cha = (char) ((Robot.getContadorRobots() +1) + '0');
			
			misBots.add(new Robot(cha, posX, posY));
			
		}
	}
	
	/**
	 * pasa las coordenadas de un robot al tablero
	 * @param misBots
	 * @param tablero
	 */
	public static void pasarRobots(ArrayList<Robot> misBots, char[][] tablero) {
		for(Robot i: misBots) {
			tablero[i.getPosiciony()][i.getPosicionX()] = i.getImagen();
		}
	}
	
	/**
	 * funcion que pinta el primer turno
	 * @param misBots
	 * @param tablero
	 */
	public static void primerTurno(ArrayList<Robot> misBots, char[][] tablero) {
		rellenaArrays(tablero);
		tablero[Robot.getDestinoY()][Robot.getDestinoX()] = 'X';
		try {
			pasarRobots(misBots, tablero);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		pintaArrays(tablero);
		System.out.println("------------------------------");
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	/**
	 * funcion que pinta y mueve cada turno de los robots
	 * @param misBots
	 * @param tablero
	 */
	public static void turno(ArrayList<Robot> misBots, char[][] tablero) {
		rellenaArrays(tablero);
		tablero[Robot.getDestinoY()][Robot.getDestinoX()] = 'X';
		moverRobots(misBots);
		pasarRobots(misBots, tablero);
		pintaArrays(tablero);
		System.out.println("------------------------------");
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static boolean comprobarNoHaLlegado(ArrayList<Robot> misBots) {
		
		for (Robot i : misBots) {
			if (i.isHaLlegado() == true) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void moverRobots(ArrayList<Robot> misBots) {
		for(Robot i: misBots) {
			i.turno();
		}
	}
	
	public static void main(String[] args) {
		boolean noLlegoRobot = true;
		char tablero[][] = new char[Robot.getColumnastablero() + 1][Robot.getFilastablero() + 1];
		Robot.setDestinoX((int) (Math.random() * (Robot.getColumnastablero() + 1)));
		Robot.setDestinoY((int) (Math.random() * (Robot.getColumnastablero() + 1)));
		var misBots = new ArrayList<Robot>();
		/*
		 * cambia el numero para meter más robots en el tablero
		 */
		crearRobots(misBots, 9);
		for (Robot i : misBots) {
			
			System.out.println(i.toString());
		}
		primerTurno(misBots, tablero);
		do {
			turno(misBots, tablero);
			noLlegoRobot = comprobarNoHaLlegado(misBots);
			
		} while (noLlegoRobot == true);
	
		for(Robot i: misBots) {
			System.out.println(i.toString());
		}
	}

}
