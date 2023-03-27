package ArrayVsTree;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) {
		TreeSet<Libro> album = new TreeSet<>(new Comparator<Libro>() {

			@Override
			public int compare(Libro o1, Libro o2) {
				
				return o1.getAutor().compareTo(o2.getAutor());
			}
			
		});
		
		album.add(new Libro("hola", "mundo"));
		album.add(new Libro("Estela", "Ruiz"));
		album.add(new Libro("Estela", "Ruiz"));
		
		for (Libro l : album) {
			System.out.println(l);
		}
	}
}
