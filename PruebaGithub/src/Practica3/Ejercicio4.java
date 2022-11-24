package Practica3;

import java.util.Scanner;

public class Ejercicio4 {
	public static void billeteador(int dinero) {
		
		if (dinero / 500 != 0) {
			System.out.println((dinero / 500) + " billetes de 500");
			dinero = dinero % 500;
		}
		if (dinero / 200 != 0) {
			System.out.println((dinero / 200) + " billetes de 200");
			dinero = dinero % 200;
		}
		if (dinero / 100 != 0) {
			System.out.println((dinero / 100) + " billetes de 100");
			dinero = dinero % 100;
		}
		if (dinero / 50 != 0) {
			System.out.println((dinero / 50) + " billetes de 50");
			dinero = dinero % 50;
		}
		if (dinero / 20 != 0) {
			System.out.println((dinero / 20) + " billetes de 20");
			dinero = dinero % 20;
		}
		if (dinero / 10 != 0) {
			System.out.println((dinero / 10) + " billetes de 10");
			dinero = dinero % 10;
		}
		if (dinero / 5 != 0) {
			System.out.println((dinero / 5) + " billetes de 5");
			dinero = dinero % 5;
		}
		System.out.println("Y sobran "+ dinero + " euros");
	}
	
	public static void main(String[] args) {
		int euros = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//pedir euros
		System.out.println("Dime tu cantidad de euros");
		try {
			euros = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error: datos erroneos");
		}
		
		//mostrar billetes
		billeteador(euros);
	}

}
