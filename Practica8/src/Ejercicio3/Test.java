package Ejercicio3;

public class Test {

	public static void main(String[] args) throws Exception {
	
		Direccion dir1 = new Direccion("naranjo", 3, "vera", "almeria", "04620", "espa�a", 35, 56);
		Direccion dir2 = new Direccion();
	
		
		System.out.println(dir1.distanciaKm(dir2));
	}

}
