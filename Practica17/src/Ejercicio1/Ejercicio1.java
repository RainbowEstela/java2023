package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("The","Quick","BROWN","Fox","Jumped","Over","The","DOG","In","THE","Street");
		
		//apartado 1
		System.out.println("APARTADO1");
		System.out.println("---------");
		List<String> lista2 = lista.stream()
								.map( l -> l.toLowerCase())
								.collect(Collectors.toList());
		
		lista2.stream()
			.forEach(System.out::println);
		
		
		//apartado 2 forma 1
		//pinto todos pero solo paso a minusculas los mayores de 3 letras
		System.out.println("APARTADO 2 FORMA 1");
		System.out.println("---------");
		lista.stream()
			.map( l -> {
				if (l.length() > 3) {
					return l.toLowerCase();
				} else {
					return l;
				}
			})
			.forEach(System.out::println);
			
		//apartado 2 forma 2
		//somo mostrar los mayores de 3 en minusculas
		System.out.println("APARTADO2 FORMA 2");
		System.out.println("---------");
		lista.stream()
			.filter( l -> l.length() > 3)
			.map( l -> l.toLowerCase())
			.forEach(System.out::println);
		
		//apartado 3
		System.out.println("APARTADO 3");
		System.out.println("---------");
		lista2 = lista.stream()
					.filter( l -> l.length() > 3)
					.map( l -> l.toLowerCase())
					.collect(Collectors.toList());
		lista2.stream()
			.skip(2)
			.forEach(System.out::println);
		
		//apartado4
		System.out.println("APARTADO 4");
		System.out.println("---------");
		lista.stream()
			.sorted()
			.forEach(System.out::println);
		
		//apartado5
		System.out.println("APARTADO 5");
		System.out.println("---------");
		
		System.out.println( 
			lista.stream()
				.filter( l -> l.length() > 4)
				.count()
		);
		
		//apartado6
		System.out.println("APARTADO 6");
		System.out.println("---------");
		System.out.println(
			lista.stream()
				.reduce( (c1, c2) -> c1 + " - " + c2 )
				.orElse("Error")
		);
			
		//apartado7
		System.out.println("APARTADO 7");
		System.out.println("---------");
		System.out.println(
			lista.stream()
					.filter( l -> l.contains("O"))
					.findFirst()
					.get()
		);
		
		
	}

}
