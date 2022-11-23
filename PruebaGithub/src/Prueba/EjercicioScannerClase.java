package Prueba;

import java.util.Scanner;

public class EjercicioScannerClase {
	
	public static void main(String[] args) {
		String empleado = "";
		double sueldo = 0;
		double irpf = 0;
		double sueldoNeto = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("dime nombre del empleado");
			empleado = sc.nextLine();
			System.out.println("dime su sueldo");
			sueldo = Double.parseDouble(sc.nextLine());
			System.out.println("dime el IRPF");
			irpf = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sueldoNeto = sueldo - (sueldo * (irpf / 100) );
		
		System.out.println(empleado + " gana " + sueldoNeto + " euros");
		

	}

}
