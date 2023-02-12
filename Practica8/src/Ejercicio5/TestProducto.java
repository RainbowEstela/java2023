package Ejercicio5;

public class TestProducto {

	public static void main(String[] args) {
		var pizzaTarradellas = new Producto(789, "Pizza de jamón y queso", 5.50, 300, 500, 0.5);
		
		pizzaTarradellas.vender(-1);
		System.out.println(pizzaTarradellas.getUnidadesDisponibles());
		pizzaTarradellas.vender(290);
		System.out.println(pizzaTarradellas.getUnidadesDisponibles());
		pizzaTarradellas.vender(15);
		System.out.println(pizzaTarradellas.getUnidadesDisponibles());
		int respuesto = pizzaTarradellas.reponer();
		System.out.println("se han respuesto " + respuesto + " hay disponibles a la venta " + pizzaTarradellas.getUnidadesDisponibles());

	}

}
