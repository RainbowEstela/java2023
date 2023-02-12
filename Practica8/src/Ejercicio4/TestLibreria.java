package Ejercicio4;

public class TestLibreria {

	public static void main(String[] args) {
		var majuelos = new Libreria();
		
		for (int i = 1; i < 200; i++) {
			majuelos.adquirir(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		}
		
		majuelos.adquirir(new Libro("2222222222", "Como ser buen programador", "Javier Guillén Benavente", 600), 64.99);
		
		majuelos.vender(new Libro("2222222222", "Como ser buen programador", "Javier Guillén Benavente", 600), 55.44);
		majuelos.vender(new Libro("2222222222", "Como ser buen programador", "Javier Guillén Benavente", 600), 55.44); //no puede venderse un libro vendido
		
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 45.60);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 32.55);
		majuelos.vender(new Libro("1111111111", "El quijote de la mancha", "Miguel de Cervantes", 590), 32.55);
		
		System.out.println("ganacias: " + majuelos.getGanancias() + " euros");
	}
	
}
