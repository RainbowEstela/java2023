package Ejercicioclase;

public class Test {

	public static void main(String[] args) {
		var quesadilla = new Receta("Quesadillas");
		
		quesadilla.addIngrediente(new Ingrediente("tortita mexicana", 4));
		quesadilla.addIngrediente(new Ingrediente("Queso havarty", 8));
		
		System.out.println(quesadilla.printarReceta());
		
		quesadilla.quitarIngrediente(new Ingrediente("Queso havarty", 7));
		
		System.out.println(quesadilla.printarReceta());

	}

}
