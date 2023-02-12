package Ejercicio6;


public class TestTienda {

	public static void main(String[] args) {
		var mercadona = new Tienda();
		mercadona.adquirirProd(new Producto(10, "yogurt natural sabor limón", 3.50, 200, 400, 0.1));
		mercadona.adquirirProd(new Producto(11, "Tableta de chocalate negro", 1.5, 300, 500, 0.2));
		mercadona.adquirirProd(new Producto(13, "Pizza tarradellas jamon y queso", 4.99, 100, 600, 0.5));
		
		mercadona.venderProd(10, 200);
		System.out.println(mercadona.getVentas());
		mercadona.venderProd(10, 2); //no se puede vender lo que ya se ha agotado
		System.out.println(mercadona.getVentas());
		mercadona.venderProd(13, 50);
		System.out.println(mercadona.getVentas());
	}

}
