package Ejercicio3;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		ArrayList<Serie> misSeries = new ArrayList<>();
		ArrayList<Videojuego> misVideojuegos = new ArrayList<>();
		
		misSeries.add(new Serie("breaking bad", 5, "drama", "unknown"));
		misSeries.add(new Serie("jojos bizarre adventure", 15, "humor", "araki"));
		misSeries.add(new Serie("better call saul", 3, "comedia", "unknown"));
		
		misVideojuegos.add(new Videojuego("naraka bloodpoint", 200, "battleroyale", "unknown"));
		misVideojuegos.add(new Videojuego("team fortress 2", 500, "shooter", "valve"));
		misVideojuegos.add(new Videojuego("minecraft", 50, "sandbox", "mojang"));
		
		misSeries.get(1).entregar();
		misVideojuegos.get(2).entregar();
		
		int prestados = 0;
		
		for (Videojuego v : misVideojuegos) {
			System.out.println(v.toString());
			if (v.isPrestado() == true) {
				prestados++;
			}
		}
		
		for (Serie s : misSeries) {
			System.out.println(s.toString());
			if (s.isPrestado() == true) {
				prestados++;
			}
		}
		
		System.out.println("numero de articulos prestados: " + prestados);
	}

}
