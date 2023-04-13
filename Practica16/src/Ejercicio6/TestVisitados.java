package Ejercicio6;

public class TestVisitados {

	public static void main(String[] args) {
		System.out.println("TEST de visitadoHM");
		System.out.println("------------------");
		VisitadoHM vhm = new VisitadoHM();
		
		vhm.addPais("España");
		vhm.addPais("Francia");
		
		vhm.addCiudad("España", "Almeria");
		vhm.addCiudad("España", "Murcia");
		vhm.addCiudad("España", "Murcia"); //comprobacion de repetido
		vhm.addCiudad("Españ", "Alicante"); //comprobacion de meter una ciudad mal

		vhm.mostrarVisitados();
		
		System.out.println("");
		System.out.println("Granada?");
		System.out.println(vhm.heVisitado("España", "Granada"));
		System.out.println("Almeria?");
		System.out.println(vhm.heVisitado("España", "Almeria"));
		
		System.out.println("TEST de visitadoTM");
		System.out.println("------------------");
		VisitadoTM vtm = new VisitadoTM();
		
		vtm.addPais("España");
		vtm.addPais("Francia");
		vtm.addPais("Japon");
		vtm.addPais("Estados Unidos");
		
		vtm.addCiudad("España", "Almeria");
		vtm.addCiudad("España", "Murcia");
		vtm.addCiudad("España", "Madrid");
		vtm.addCiudad("España", "Murcia"); //comprobacion de repetido
		vtm.addCiudad("Españ", "Alicante"); //comprobacion de meter una ciudad mal

		vtm.mostrarVisitados();
		
		System.out.println("");
		System.out.println("Granada?");
		System.out.println(vtm.heVisitado("España", "Granada"));
		System.out.println("Almeria?");
		System.out.println(vtm.heVisitado("España", "Almeria"));
		
		System.out.println(vtm.primeros("China"));
	}

}
