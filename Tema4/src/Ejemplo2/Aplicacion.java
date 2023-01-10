package Ejemplo2;

public class Aplicacion {

	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta();
		System.out.println(bici1.cambio);
		bici1.precio = 1200;
		
		System.out.println(bici1.precioConDescuento());

	}

}
