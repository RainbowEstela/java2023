package Ejercicio6;

public class TestVisitados {

	public static void main(String[] args) {
		System.out.println("TEST de visitadoHM");
		System.out.println("------------------");
		VisitadoHM vhm = new VisitadoHM();
		
		vhm.addPais("Espa�a");
		vhm.addPais("Francia");
		
		vhm.addCiudad("Espa�a", "Almeria");
		vhm.addCiudad("Espa�a", "Murcia");
		vhm.addCiudad("Espa�a", "Murcia"); //comprobacion de repetido
		vhm.addCiudad("Espa�", "Alicante"); //comprobacion de meter una ciudad mal

		vhm.mostrarVisitados();
		
		System.out.println("");
		System.out.println("Granada?");
		System.out.println(vhm.heVisitado("Espa�a", "Granada"));
		System.out.println("Almeria?");
		System.out.println(vhm.heVisitado("Espa�a", "Almeria"));
		
		System.out.println("TEST de visitadoTM");
		System.out.println("------------------");
		VisitadoTM vtm = new VisitadoTM();
		
		vtm.addPais("Espa�a");
		vtm.addPais("Francia");
		vtm.addPais("Japon");
		vtm.addPais("Estados Unidos");
		
		vtm.addCiudad("Espa�a", "Almeria");
		vtm.addCiudad("Espa�a", "Murcia");
		vtm.addCiudad("Espa�a", "Madrid");
		vtm.addCiudad("Espa�a", "Murcia"); //comprobacion de repetido
		vtm.addCiudad("Espa�", "Alicante"); //comprobacion de meter una ciudad mal

		vtm.mostrarVisitados();
		
		System.out.println("");
		System.out.println("Granada?");
		System.out.println(vtm.heVisitado("Espa�a", "Granada"));
		System.out.println("Almeria?");
		System.out.println(vtm.heVisitado("Espa�a", "Almeria"));
		
		System.out.println(vtm.primeros("China"));
	}

}
