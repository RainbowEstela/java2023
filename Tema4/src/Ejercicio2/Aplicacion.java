package Ejercicio2;

public class Aplicacion {

	public static void main(String[] args) {
		Enemigo ene1 = new Enemigo();
		Enemigo ene2 = new Enemigo("fantasma", "Undead", 30);
		
		for (int i = 1; i <= 6; i++) {
			ene1.subirNivel();
		}
		for (int i = 1; i <= 2; i++) {
			ene2.subirNivel();
		}
		
		System.out.println(Enemigo.numEnemigos);
		System.out.println(ene1.toString());
		System.out.println(ene2.toString());
		
		ene1.recibirDamage(500);
		ene2.recibirDamage(100);

		System.out.println(ene1.toString());
		System.out.println(ene2.toString());
		System.out.println(Enemigo.numEnemigos);
	}

}
