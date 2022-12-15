package primeraevaulacion;

import java.util.Scanner;
import java.lang.Thread;

public class Ejercicio4 {
	/**
	 * crea el tablero
	 * @param array
	 */
	public static void rellenaArrays(char array[][], int[] coordenadasSalida, int[] jugador) {
		//creo campo
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if ( (i == 0 || i == (array.length -1) ) && (j != 0 && j != (array[0].length -1) ) ) {
					array[i][j] = '-'; 
				} else if ( (j == 0) || (j == array.length -1) ) {
					array[i][j] = '|';
				} else {
					array[i][j] = '.';
				}
			}
		}
		
		//creo salida
		array[coordenadasSalida[0]][coordenadasSalida[1]] = '#';
		
		//creo jugador
		array[jugador[0]][jugador[1]] = '@';
		
		
	}
	
	/**
	 * genera una entrada aleatoria
	 * @param array
	 */
	public static void generarEntrada(char array[][], int coordenadas[], int[] bomba) {
		int coorX = 0, coorY = 0;
		//int bombaX = 0, bombaY = 0;
		int aux = 0;
		
		coorX = (int) (Math.random() * (array.length));
		
		while ( (coorX == 0) && (coorY == 0) ) {
			
			if (coorX == 0) {
				coorY = (int) (Math.random() * (array.length - 1)) + 1;
			} else if (coorX == array.length - 1) {
				coorY = (int) (Math.random() * (array.length));
			} else {
				aux = (int) (Math.random() * 100) + 1;
				if (aux > 50) {
					coorY = 0;
				} else {
					coorY = array[0].length -1;
				}
			}
			
		}
		
		
		bomba[0] = (int) (Math.random() * (array.length - 2)) + 1;
		bomba[1] = (int) (Math.random() * (array.length - 2)) + 1;
		
		
	
		
		coordenadas[0] = coorX;
		coordenadas[1] = coorY;
		
		array[coorX][coorY] = '#';
		
	}
	
	/**
	 * muestra el estado del tablero
	 * @param array
	 */
	public static void mostrarTablero(char array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " "); 
			}
			System.out.println("");
		}
	}
	
	public static void avance(int[] jugador, int opcion) {
		switch (opcion) {
			case 1: {
				jugador[1] += 1;
				break;
			}
			case 2: {
				jugador[1] -=1;
				break;
			}
			case 3: {
				jugador[0] +=1;
				break;
			}
			case 4: {
				jugador[0] -=1;
				break;
			}
			

		}
	}
	
	
	public static void main(String[] args) {
		char[][] tablero = new char[20][20];
		int[] coordenadasSalida = new int[2];
		int[] coordenadasBomba = new int[2];
		int[] jugador = new int[2];
		boolean finPartida = false;
		boolean ganador = false;
		boolean explotar = false;
		int iA = 0;
		int pasos = 0;
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		generarEntrada(tablero, coordenadasSalida, coordenadasBomba);
		
	
		
		while (finPartida == false) {
			if (opcion == 5) {
				try {
					rellenaArrays(tablero,coordenadasSalida, jugador);
					mostrarTablero(tablero);
					Thread.sleep(200);
					iA = (int) (Math.random() * 4) + 1;
				} catch (Exception e) {
					if (iA == 1) {
						iA = 2;
					} else if (iA == 2) {
						iA = 1;
					} else if (iA == 3) {
						iA = 4;
					} else if (iA == 4) {
						iA = 3;
					}
				}
				avance(jugador, iA);
				
				//toque salida
				if ( (jugador[0] == coordenadasSalida[0]) && (jugador[1] == coordenadasSalida[1]) ) {
					finPartida = true;
					ganador = true;
				}
				
				//toque bomba
				if ( (jugador[0] == coordenadasBomba[0]) && (jugador[1] == coordenadasBomba[1]) ) {
					finPartida = true;
					explotar = true;
				}
				
			} else {
				try {
				rellenaArrays(tablero,coordenadasSalida, jugador);
				mostrarTablero(tablero);
				
				
					System.out.println("Introduce opcion");
					System.out.println("1. Derecha");
					System.out.println("2. Izquierda");
					System.out.println("3. Abajo");
					System.out.println("4. Arriba");
					System.out.println("5. juega la maquina");
					opcion = Integer.parseInt(sc.nextLine());
					
				} catch (IndexOutOfBoundsException e) {
					finPartida = true;
				}
			}
			avance(jugador, opcion);
			//toque salida
			if ( (jugador[0] == coordenadasSalida[0]) && (jugador[1] == coordenadasSalida[1]) ) {
				finPartida = true;
				ganador = true;
			}
			
			//toque bomba
			if ( (jugador[0] == coordenadasBomba[0]) && (jugador[1] == coordenadasBomba[1]) ) {
				finPartida = true;
				explotar = true;
			}
			
		}
		try {
			rellenaArrays(tablero,coordenadasSalida, jugador);
		} catch (Exception e) {
		}
		
		if (explotar == true) {
			tablero[coordenadasBomba[0]][coordenadasBomba[1]] = 'X';
		} else {
			tablero[coordenadasBomba[0]][coordenadasBomba[1]] = '*';
		}
		
		mostrarTablero(tablero);
		
		if (ganador == true) {
			System.out.println("¡HAS GANADO!");
		} else {
			System.out.println("¡PERDISTE!");
		}
		
		
		
	}

}
