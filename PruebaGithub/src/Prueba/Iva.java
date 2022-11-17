package Prueba;

public class Iva {

	public static void main(String[] args) {

		double precio = 295;
		double iva = 1.25;
		int cantidad = 4;
		
		if (cantidad >= 5) {
			
			precio = (precio * cantidad);
			System.out.println("se te descuenta el iva.");
			
		} else {
			
			precio = (precio * cantidad) * iva;
			
		}
		
		System.out.println("tienes que pagar " + precio + " euros");

	}

}
