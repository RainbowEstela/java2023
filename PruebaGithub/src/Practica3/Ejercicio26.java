package Practica3;

import java.util.Scanner;

public class Ejercicio26 {
	public static boolean aseguraFecha(int dia, int mes) {
		boolean valida = true;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12: {
			if ((dia < 1) || (dia > 31)) {
				valida = false;
			}
			break;
		}
		case 4, 6, 9, 11: {
			if ((dia < 1) || (dia > 30)) {
				valida = false;
			}
			break;
		}
		case 2: {
			if ((dia < 1) || (dia > 28)) {
				valida = false;
			}
			break;
		}
		default: {
			valida = false;
		}

		}
		return valida;

	}

	public static void main(String[] args) {
		int dia = 0, mes = 0, year = 0;
		boolean valida = false;
		Scanner sc = new Scanner(System.in);
		
		while (valida == false) {
			System.out.print("día: ");
			try {
				dia = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error: caracter invalido");
			}
			
			System.out.print("mes: ");
			try {
				mes = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error: caracter invalido");
			}
			
			System.out.print("año: ");
			try {
				year = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error: caracter invalido");
			}
			
			valida = aseguraFecha(dia,mes);	
		}
		
		switch (mes) {
			case  1, 3, 5, 7, 8, 10: {
				if (dia == 31) {
					dia = 1;
					mes++;
				} else {
					dia++;
				}
				break;
			}
			case 4, 6, 9, 11: {
				if (dia == 30) {
					dia = 1;
					mes++;
				} else {
					dia++;
				}
				break;
			}
			
			case 2: {
				if (dia == 28) {
					dia = 1;
					mes++;
				} else {
					dia++;
				}
				break;
			}
			case 12: {
				if (dia == 31) {
					dia = 1;
					mes = 1;
					year++;
				} else {
					dia++;
				}
				break;
			}
		}
		
		System.out.println("El dia siguiente es " + dia + "/" + mes + "/" + year);
		
	}

}
