package Ejercicio11;

import java.util.ArrayList;

public class TestRobot {

	public static void rellanaArrays(char[][] tablero) {
		for (char[] i : tablero) {
			for (char elemento: i) {
				elemento = 't';
			}
		}
		
	}
	
	public static void pintaArrays(char[][] tablero) {
		for (char[] i : tablero) {
			for (char elemento: i) {
				System.out.print(elemento);
			}
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		char tablero[][] = new char[101][101];
		
		for (char[] i : tablero) {
			for (char elemento: i) {
				elemento = 't';
			}
		}
		
		for (char[] i : tablero) {
			for (char elemento: i) {
				System.out.print(elemento);
			}
			
			System.out.println("");
		}
		
		
		
		System.out.println(tablero[1][1]);
		var misBots = new ArrayList<Robot>();
		
		for (int i = 1; i <= 1; i++ ) {
			
			var posX = (int) (Math.random() * (Robot.getColumnastablero() + 1));
			var posY = (int) (Math.random() * (Robot.getColumnastablero() + 1));
			var cha = (char) ((Robot.getContadorRobots() +1) + '0');
			
			misBots.add(new Robot(cha, posX, posY));
			
		}
		

		for (Robot i : misBots) {
			
			System.out.println(i.toString());
		}
		
	}

}
