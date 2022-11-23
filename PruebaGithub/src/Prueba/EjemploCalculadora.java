package Prueba;

import java.util.Scanner;

public class EjemploCalculadora {

	public static void main(String[] args) {
		double num1 = 0, num2 = 0, resultado = 0;
		int opcion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//mostrar opciones
			System.out.println("1. sumar");
			System.out.println("2. restar");
			System.out.println("3. multiplicar");
			System.out.println("4. dividir");
			System.out.println("5. salir");
			
			//elegir opcion
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("error al elegir");
				opcion = 0;
			}
			
			//calculos
			switch (opcion) {
				case 1: {//sumar
					//pedir numeros
					System.out.println("dime primer operando");
					num1 = Double.parseDouble(sc.nextLine());
					System.out.println("dime segundo operando");
					num2 = Double.parseDouble(sc.nextLine());
					
					//operacion
					resultado = num1 + num2;
					
					//mostrar resultado
					System.out.println("resultado = "+ resultado);
					break;
				}
				case 2: {//restar
					//pedir numeros
					System.out.println("dime primer operando");
					num1 = Double.parseDouble(sc.nextLine());
					System.out.println("dime segundo operando");
					num2 = Double.parseDouble(sc.nextLine());
					
					//calcular
					resultado = num1 - num2;
					
					//mostrar
					System.out.println("resultado = "+ resultado);
					break;
				}
				case 3: {//multiplicar
					//pedir
					System.out.println("dime primer operando");
					num1 = Double.parseDouble(sc.nextLine());
					System.out.println("dime segundo operando");
					num2 = Double.parseDouble(sc.nextLine());
					
					//operar
					resultado = num1 * num2;
					
					//mostrar
					System.out.println("resultado = "+ resultado);
					break;
				}
				case 4: {//dividir
					try {
						//pedir
						System.out.println("dime primer operando");
						num1 = Double.parseDouble(sc.nextLine());
						System.out.println("dime segundo operando");
						num2 = Double.parseDouble(sc.nextLine());
						
						//operar
						resultado = num1 / num2;
						
						System.out.println("resultado = "+ resultado);
						break;
					} catch(Exception e) {
						System.out.println("division por 0");
					}
				}
				case 5: {
					System.out.println("fin de programa");
					break;
				}
			}
			
			
		} while(opcion !=5);
		

	}

}
