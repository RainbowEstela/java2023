package Practica2;

public class Ejercicio17 {

	public static void main(String[] args) {
		//a
		int n = (int)(Math.random() * ((49 + 1) - 1) + 1);
		System.out.println("a) " + n);
		
		//b
		int par = (int) ((Math.random() * ((20 + 1) - 1) + 1)) * 2;
		System.out.println("b) " + par);
		
		//c
		double real = (Math.random() * ((10 + 1) - 1) + 1);
		System.out.println("c)" + real);
		
		//d
		int neg = (int) (Math.random() * ((-150 + 1) + 50) - 50);
		System.out.println("d) " + neg);
		
		//e
		int n2 = (int) (Math.random() * ((100 + 1) + 100) - 100);
		System.out.println("e)" + n2);
		
		//f
		int n3 = (int) (Math.random() * ((5 + 1) - 1) + 1);
		
		switch (n3) {
		case 1:
			n3 = 5;
			break;
		case 2:
			n3 = 7;
			break;
		case 3:
			n3 = 33;
			break;
		case 4:
			n3 = 125;
			break;
		case 5:
			n3 = 77;
			break;
			
		default:
			break;
		}
		
		System.out.println("f) " + n3);
		
		//g
		int mes = (int) (Math.random() * ((12 + 1) - 1) + 1);
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octrubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			break;
		}
		

	}

}
