package Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio7.Cancion.Genero;

public class TestScotify {

	public static void main(String[] args) {
		var a1 = new Autor("Manolo", "autor musica electronica");
		var a2 = new Autor("Elena", "autora de musica tecno");
		var a3 = new Autor("Estela", "Autora musica de videojuegos");
		
		var c1 = new Cancion("battle", 180, 2021, 1, Genero.ELECTRONICA);
		c1.addAutor(a3);
		c1.addAutor(a2);
		var c2 = new Cancion("menu", 341, 2021, 2, Genero.ELECTRONICA);
		c2.addAutor(a1);
		c2.addAutor(a3);
		var c3 = new Cancion("nostalgia", 265, 2002, 1, Genero.DISCO);
		c3.addAutor(a1);
		var c4 = new Cancion("melancolia", 346, 2000, 2, Genero.CLASICA);
		c4.addAutor(a2);
		
		var d1 = new Disco("ost naraka bladepoint", LocalDate.of(2002, 4, 22), a3, "santillana");
		d1.addCancion(c1);
		d1.addCancion(c2);
		var d2 = new Disco("mix 2000 - 2002", LocalDate.of(2000, 1, 31), a1, "mercedes");
		d2.addCancion(c3);
		d2.addCancion(c4);
		
		var p1 = new Podcast("sobre la vida", 5000, 2023, LocalDate.of(2023, 2, 28), 67);
		p1.addAutor(a3);
		var p2 = new Podcast("el futuro", 4699, 2015, LocalDate.of(2015, 6, 22), 23);
		p2.addAutor(a2);
		var p3 = new Podcast("el pasado", 3459, 1998, LocalDate.of(1998, 11, 3), 52);
		
		var sct = new Scotify();
		sct.addMultimedia(c1);
		sct.addMultimedia(c2);
		sct.addMultimedia(c3);
		sct.addMultimedia(c4);
		sct.addMultimedia(p1);
		sct.addMultimedia(p2);
		sct.addMultimedia(p3);
		
		
		System.out.println(sct.buscar("el futuro").toString());
		ArrayList<Multimedia> porAutor = new ArrayList<>();
		
		System.out.println("*reproducioendo por autor*");
		porAutor = sct.buscarPorAutor(a2);
		for(Multimedia m : porAutor) {
			m.reproducir();
		}
		System.out.println("");
		System.out.println("*reproduciendo todo*");
		for (Multimedia m : sct.getMultimedia()) {
			m.reproducir();
		}
	}

}
