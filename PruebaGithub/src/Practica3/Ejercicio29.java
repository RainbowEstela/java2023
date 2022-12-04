package Practica3;

import java.util.Scanner;

public class Ejercicio29 {
	/*
	 * comprueba si el año es bisiesto
	 */
	public static boolean esAnioBisiesto(int year) {
		boolean esBisiesto = false;
		
		if ( (year % 4 == 0) && ( (year % 100 != 0) || (year % 400 == 0) ) ) {
			esBisiesto = true;
		}
		
		return esBisiesto;
	}
	
	/*
	 * comprueba si hay un numero negativo
	 */
	public static boolean esFechaNegativa(int num1, int num2, int num3) {
		boolean hayNegativo = false;
		
		if ( (num1 < 0) || (num2 < 0) || (num3 <0) ) {
			hayNegativo = true;
		}
		
		return hayNegativo;
	}
	
	/*
	 * comprueba si el mes no supera el 12
	 */
	public static boolean esMesValido(int mes) {
		boolean mesValido = true;
		
		if ( (mes > 12) || (mes < 1) ) {
			mesValido = false;
		}
		
		return mesValido;
	}
	
	/*
	 * comprueba si el dia es valido
	 */
	public static boolean esDiaValido(int dia, int mes, int year) {
		boolean diaValido = true;
		boolean esBisiesto = esAnioBisiesto(year);
		
		switch (mes) {
			case 1,3,5,7,8,10,12: {
				if ( (dia < 1) || (dia > 31 )) {
					diaValido = false;
				}
				break;
			}
			case 4,6,9,11: {
				if ( (dia < 1) || (dia > 30 )) {
					diaValido = false;
				}
				break;
			}
			case 2: {
				if (esBisiesto == true) {
					if ( (dia < 1) || (dia > 29 )) {
						diaValido = false;
					}
				} else {
					if ( (dia < 1) || (dia > 28 )) {
						diaValido = false;
					}
				}
				break;
			}
		}
		
		return diaValido;
	}
	
	/*
	 * comprueba si la fecha es valida
	 */
	public static boolean esFechaValida(int dia, int mes, int year) {
		boolean fechaValida = true;
		
		if (esFechaNegativa(dia,mes,year) == true) {
			fechaValida = false;
		} else {
			if (esMesValido(mes) == true) {
				if (esDiaValido(dia,mes,year) == false) {
					fechaValida = false;
				}
			} else {
				fechaValida = false;
			}
		}
		
		return fechaValida;
		
	}

	public static void main(String[] args) {
		int dia = 0, mes = 0, year = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Dia:");
			dia = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error caracter no válido");
		} 
		
		try {
			System.out.print("mes:");
			mes = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error caracter no válido");
		} 
		
		try {
			System.out.print("año:");
			year = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error caracter no válido");
		} 
		
		if (esFechaValida(dia,mes,year) == true) {
			System.out.println("Fecha válida");
		} else {
			System.out.println("Fecha no válida");
		}
	}

}
