package Ejercicio2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		PrimeVideo pv = new PrimeVideo();
		
		for(int i = 1; i <= 30; i++) {
			pv.addMultimedia(new Pelicula("Shrek 2", true, 10, 180));
		}
		
		for(int i = 1; i <= 170; i++) {
			pv.addMultimedia(new Pelicula("Shrek", false, 10, 180));
		}
		
		for (int z = 1; z <= 10; z++) {
			Serie serie = new Serie("Breaking Bad", true, 10);
			for(int i=0; i<10; i++) {
				Temporada t = new Temporada(i);
				for(int j=0; j<10; j++) {
					t.addEpisodio(new Episodio("Episodio "+j, 50));
				}
				serie.addTemporada(t);
			}
			
			pv.addMultimedia(serie);
		}
		
		

		
		for(int i = 1; i <= 1000; i++) {
			String dni = i + "";
			if (i <= 250) {
				pv.addSuscricion(new ClientePrimePro( dni, "", ""));
			} else {
				pv.addSuscricion(new ClientePrime(dni, "", ""));
			}
		}
		
		ArrayList<Serie> lasSeries = new ArrayList<>();
		for(Multimedia m : pv.getMultimedia())
			if (m instanceof Serie) {
				lasSeries.add((Serie) m);
			}
		
		for(Cliente c : pv.getSuscripciones()) {
			for(int i = 0; i < 40; i++ ) {
				Multimedia p = pv.getMultimedia().get(i);
				pv.ver(p, c);
			}
			
			for(int j = 0; j < 5; j++) {
				Serie s = lasSeries.get(j);
				pv.ver(s, c);
			}
		}
		
		
		
		
		System.out.println("La prueba esta hecha con 1000 subcripciones porque si no tarda demasiado el programa en dar la respuesta");
		System.out.println("Ganancias = " + pv.getGanancias());
	}

}
