package Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TestPelicula {

	public static void pelisOrdenadasPorAnio(List<Pelicula> pelis) {
		pelis.stream()
				.sorted(new Comparator<Pelicula>() {

					@Override
					public int compare(Pelicula o1, Pelicula o2) {
						return o1.getAnio() - o2.getAnio();
					}
				})
				.forEach(System.out::println);
	}
	
	public static void scifi2000(List<Pelicula> pelis) {
		pelis.stream()
				.filter( l -> l.getAnio() > 2000)
				.filter( l -> l.getGeneros().stream()
												.anyMatch( g -> g.getNombre().equals("Ciencia ficcion")))
				.forEach(l -> System.out.println(l.getTitulo() + " " + l.getAnio() + " " + l.getGeneros()));
	}
	
	public static void tituloMasLargo(List<Pelicula> pelis) {
		System.out.println(
		pelis.stream()
				.max( (l1, l2) -> l1.getTitulo().length() - l2.getTitulo().length())
				.get()
		);
	}
	
	public static void directoresMayusculas(List<Pelicula> pelis) {
		pelis.stream()
				.flatMap( l -> l.getDirectores().stream())
				.distinct()
				.map( d -> d.getNombre().toUpperCase())
				.forEach(System.out::println);		
	}
	
	public static void numPelis(List<Pelicula> pelis) {
		HashMap<String, List<Pelicula>> mapPelis = (HashMap<String, List<Pelicula>>) pelis.stream()
				.flatMap( p -> p.getDirectores().stream())
				.distinct()
				.collect(Collectors.toMap(Director::getNombre, Director::getPeliculas));
		
		for(String k : mapPelis.keySet()) {
			System.out.println(k + ": " + mapPelis.get(k).size());
		}
	}
	
	public static void dramaYMafia(List<Pelicula> pelis) {
		pelis.stream()
				.filter( l -> l.getGeneros().stream()
												.anyMatch(g -> g.getNombre().equals("Drama"))
								&&
								l.getGeneros().stream()
												.anyMatch(g -> g.getNombre().equals("Mafia")))
				.forEach(System.out::println);
	}
	
	public static void filmografia(List<Pelicula> pelis) {
		HashMap<String, List<Pelicula>> mapPelis = (HashMap<String, List<Pelicula>>) pelis.stream()
				.flatMap( p -> p.getDirectores().stream())
				.distinct()
				.collect(Collectors.toMap(Director::getNombre, Director::getPeliculas));
		
		
		for(String k : mapPelis.keySet()) {
			System.out.println(k + ": ");
			
			mapPelis.get(k).stream()
							.sorted((l1, l2) -> l1.getAnio() - l2.getAnio())
							.forEach(System.out::println);
		}
	}
	
	public static void main(String[] args) {
		
		Director d1 = new Director("Ridley Scott");
		Director d2 = new Director("F.F. Coppola");
		Director d3 = new Director("C.Nolan");
		Director d4 = new Director("Martin Scorsese");
		Director d5 = new Director("Quentin Tarantino");
		
		Genero g1 = new Genero("Ciencia ficcion");
		Genero g2 = new Genero("Terror");
		Genero g3 = new Genero("Accion");
		Genero g4 = new Genero("Drama");
		Genero g5 = new Genero("Mafia");
		
		
		Pelicula p1 = new Pelicula("Pull Fiction", 2001);
		
		p1.addDirector(d1);
		p1.addDirector(d3);
		p1.addDirector(d4);
		
		p1.addGenero(g1);
		
		Pelicula p2 = new Pelicula("Reservoir Dogs", 1998);
		
		p2.addDirector(d5);
		p2.addDirector(d2);
		
		p2.addGenero(g5);
		p2.addGenero(g4);
		
		Pelicula p3 = new Pelicula("Gladiatos",2001);
		
		p3.addDirector(d2);
		p3.addDirector(d4);
		
		p3.addGenero(g3);
		
		Pelicula p4 = new Pelicula("Blade Runner", 2000);
		
		p4.addDirector(d3);
		p4.addDirector(d5);
		
		p4.addGenero(g1);
		
		Pelicula p5 = new Pelicula("Alien", 2009);
		
		p5.addDirector(d3);
		
		p5.addGenero(g1);
		
		Pelicula p6 = new Pelicula("Apocalyse now", 2007);
		
		p6.addDirector(d2);
		p6.addDirector(d1);
		
		p6.addGenero(g1);
		p6.addGenero(g4);
		
		Pelicula p7 = new Pelicula("El padrino", 1990);
		
		p7.addDirector(d5);
		p7.addDirector(d4);
		
		p7.addGenero(g5);
		p7.addGenero(g4);
		
		Pelicula p8 = new Pelicula("Tenet", 1999);
		
		p8.addDirector(d3);
		p8.addDirector(d4);
		
		p8.addGenero(g2);
		p8.addGenero(g4);
		
		Pelicula p9 = new Pelicula("Origen", 2003);
		
		p9.addDirector(d1);
		p9.addDirector(d5);
		
		p9.addGenero(g2);
		
		Pelicula p10 = new Pelicula("Casino", 1890);
		
		p10.addDirector(d4);
		p10.addDirector(d2);
		p10.addDirector(d3);
		
		p10.addGenero(g5);
		p10.addGenero(g4);
		
		Pelicula p11 = new Pelicula("Godfellas", 2005);
		
		p11.addDirector(d5);
		
		p11.addGenero(g3);
		p11.addGenero(g4);
		
		Pelicula p12 = new Pelicula("El lobo de Wall Street", 1999);
		
		p12.addDirector(d4);
		p12.addDirector(d1);
		
		p12.addGenero(g1);
		
		List<Pelicula> misPeliculas = new ArrayList<>();
		misPeliculas.add(p1);
		misPeliculas.add(p2);
		misPeliculas.add(p3);
		misPeliculas.add(p4);
		misPeliculas.add(p5);
		misPeliculas.add(p6);
		misPeliculas.add(p7);
		misPeliculas.add(p8);
		misPeliculas.add(p9);
		misPeliculas.add(p10);
		misPeliculas.add(p11);
		misPeliculas.add(p12);
		
		//pelisOrdenadasPorAnio(misPeliculas);
		//scifi2000(misPeliculas);
		//tituloMasLargo(misPeliculas);
		//directoresMayusculas(misPeliculas);
		//numPelis(misPeliculas);
		//dramaYMafia(misPeliculas);
		filmografia(misPeliculas);

	}

}
