package Prueba;

public class Calculadora {

	public static void main(String[] args) {
		int operando1 = 5, operando2 = 3;
		char operador = '%';
		
		switch (operador) {
		case '+':
			System.out.println(operando1 + operando2);
			break;
		case '-':
			System.out.println(operando1 - operando2);
			break;
		case '*':
			System.out.println(operando1 * operando2);
			break;
		case '/':
			System.out.println(operando1 / operando2);
			break;
		case '%':
			System.out.println(operando1 % operando2);
			break;
		case 's':
			System.out.println(Math.sin(operando1));
			
		default:
			System.out.println("operador incorrecto");
		}
		
	}

}
