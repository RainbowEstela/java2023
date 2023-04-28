package Ejercicio4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Ejercicio4.Pais.Continente;

public class TestPais {

	public static void main(String[] args) {
		Pais p1 = new Pais("Pais1", Continente.AFRICA , 4000000.0, 1000000, new Ciudad("Capital1", 60000));
		p1.addCiudad(new Ciudad("ciudad1", 300));
		p1.addCiudad(new Ciudad("Ciudad2", 30000));

		Pais p2 = new Pais("Pais2", Continente.AMERICANORTE, 6000000.0, 2000000, new Ciudad("DosCa", 80000));
		p2.addCiudad(new Ciudad("DosCi1", 7500));
		p2.addCiudad(new Ciudad("DosCiu2", 45000));
		
		Pais p3 = new Pais("Pais3", Continente.AMERICASUR, 500000.0, 8900000, new Ciudad("TresCa", 870000));
		p3.addCiudad(new Ciudad("TresCi1", 87000));
		p3.addCiudad(new Ciudad("TresCi2", 459000));
		
		Pais p4 = new Pais("Pais4", Continente.ANTARTIDA, 800000.0, 10000, new Ciudad("CuatroCa", 300));
		p4.addCiudad(new Ciudad("cuatroCi1", 60));
		p4.addCiudad(new Ciudad("CuatroCi2", 80));
		
		Pais p5 = new Pais("Pais5", Continente.ASIA, 90000000.0, 300000000, new Ciudad("CincoCa", 10000000));
		p5.addCiudad(new Ciudad("CinciCi", 8000000));
		p5.addCiudad(new Ciudad("CincoCi2", 4000000));
		
		Pais p6 = new Pais("Pais6", Continente.EUROPA, 7000000.0, 40000000, new Ciudad("SeisCa", 1000000));
		p5.addCiudad(new Ciudad("SeisCi", 700000));
		p5.addCiudad(new Ciudad("SeisCi2", 100000));
		
		Pais p7 = new Pais("Pais7", Continente.OCEANIA, 70000.0, 7890000, new Ciudad("SieteCa", 800000));
		p5.addCiudad(new Ciudad("SieteCi", 800));
		p5.addCiudad(new Ciudad("SieteCi2", 6000));
		
		Pais p8 = new Pais("Pais8", Continente.ASIA, 9000.0, 300, new Ciudad("OchoCa", 100));
		p5.addCiudad(new Ciudad("OchoCi", 80));
		p5.addCiudad(new Ciudad("OchoCi2", 40));
		
		Pais p9 = new Pais("Pais9", Continente.AFRICA, 670000.0, 980000, new Ciudad("NueveCa", 45900));
		p9.addCiudad(new Ciudad("NueveCi1", 7999));
		p9.addCiudad(new Ciudad("NueveCi2", 6790));
		
		Pais p10 = new Pais("Pais10", Continente.ASIA, 9000.0, 30000, new Ciudad("DiezCa", 1000));
		p5.addCiudad(new Ciudad("Diezci1", 800));
		p5.addCiudad(new Ciudad("DiezCi2", 400));
		
		List<Pais> paises = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
		
		//EJERCICIOS DE STREAMS
		
		//menor superficie
		System.out.println("MENOR SUPERFICIE\n");
		System.out.println(
		paises.stream()
			.min((pais1,pais2) ->(int) (pais1.getSuperficie() - pais2.getSuperficie()))
			.orElse(null)
		);
		
		System.out.println("");
		//poblacion descencente
		System.out.println("POBLACION DE PAISES DE FORMA DESCENDENTE\n");
		paises.stream()
			.sorted((pa1,pa2) -> pa2.getPoblacion() - pa1.getPoblacion())
			.forEach( pa -> System.out.println(pa.getNombre() + " - " + pa.getPoblacion()));
		
		System.out.println("");
		//5 mayores superficies
		System.out.println("5 primeros paises por superficie\n".toUpperCase());
		paises.stream()
			.sorted((pa1,pa2) ->(int) (pa2.getSuperficie() - pa1.getSuperficie()))
			.limit(5)
			.forEach(pa -> System.out.println(pa.getNombre() + " - " + pa.getSuperficie()));
		
		System.out.println("");
		//paises de las americas ordenados por poblacion
		System.out.println("paises de las americas ordenados por poblacion\n".toUpperCase());
		paises.stream()
			.filter(pa -> pa.getContinente().equals(Continente.AMERICANORTE) || pa.getContinente().equals(Continente.AMERICASUR))
			.sorted((pa1,pa2) -> pa1.getPoblacion() - pa2.getPoblacion())
			.forEach( pa -> System.out.println(pa.getNombre() + " - " + pa.getPoblacion()));
		
		System.out.println("");
		//Capitales ordenadas alfabeticamente
		System.out.println("Capitales ordenadas alfabeticamente\n".toUpperCase());
		paises.stream()
			.map(pa -> pa.getCapital())
			.sorted((ca1,ca2) -> ca1.getNombre().compareTo(ca2.getNombre()))
			.forEach(System.out::println);
		
		System.out.println("");
		//las tres capitales mas pobladas
		System.out.println("las tres capitales mas pobladas\n".toUpperCase());
		paises.stream()
			.map(pa -> pa.getCapital())
			.sorted((ca1,ca2) -> ca2.getPoblacion() - ca1.getPoblacion())
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println("");
		//Muestra cada continente, y seguido por ‘:’ los países de ese continente
		System.out.println("Muestra cada continente, y seguido por ‘:’ los países de ese continente\n".toUpperCase());
		Map<Continente, List<Pais>> porContinentes = paises.stream()
														.collect(Collectors.groupingBy(pa -> pa.getContinente()));
		porContinentes.forEach((k,v) -> System.out.println(k + ": " + v.stream().map(pa -> pa.getNombre()).reduce((no1,no2) -> no1 + ", " +no2).get()));
		
		System.out.println("");
		//Muestra si todos los países tienen más de 20 millones de habitantes o no.
		System.out.println("Muestra si todos los países tienen más de 20 millones de habitantes o no\n".toUpperCase());
		System.out.println(
		paises.stream()
			.allMatch(pa -> pa.getPoblacion() > 20000000)
		);
		
		System.out.println("");
		//Muestra la media de población de todos los países en conjunto.
		System.out.println("Muestra la media de población de todos los países en conjunto\n".toUpperCase());
		System.out.println(
		paises.stream()
			.collect(Collectors.averagingInt(Pais::getPoblacion))
		);
		
		System.out.println("");
		// Muestra todos los continentes, y cuántos países has metido en cada continente.
		System.out.println("Muestra todos los continentes, y cuántos países has metido en cada continente\n".toUpperCase());
		
		Map<Continente, Long> cantidadContinente = paises.stream()
			.collect(Collectors.groupingBy(Pais::getContinente, Collectors.counting()));
		cantidadContinente.forEach((k,v) -> System.out.println(k + " - " + v));
		
		System.out.println("");
		//Muestra los países ordenados por superficie, y para cada país sus ciudades ordenadas por población.
		System.out.println("Muestra los países ordenados por superficie, y para cada país sus ciudades ordenadas por población.\n".toUpperCase());
		paises.stream()
			.sorted((pa1,pa2) -> (int) (pa1.getSuperficie() - pa2.getSuperficie()) )
			.forEach( pa -> {
				System.out.println(pa.getNombre() + " - s: " + pa.getSuperficie() + ":\n--------------");
				pa.getCiudades().stream()
					.sorted((ci1,ci2) -> ci1.getPoblacion() - ci2.getPoblacion())
					.forEach(ci -> System.out.println("* "+ ci.getNombre() + " - p: " + ci.getPoblacion() ));
				System.out.println("");
			});
		
		System.out.println("");
		//Muestra cada país, la suma de las poblaciones de sus ciudades.
		System.out.println("Muestra cada país, la suma de las poblaciones de sus ciudades\n".toUpperCase());
		paises.stream()
			.forEach(pa -> {
				System.out.println(pa.getNombre() + " - " + pa.getCiudades().stream().collect(Collectors.summingInt(Ciudad::getPoblacion)));
			});
		
		System.out.println("");
		// Capital más poblada
		System.out.println("Capital más poblada".toUpperCase());
		System.out.println(
			paises.stream()
				.map(pa -> pa.getCapital())
				.max((ca1,ca2) -> ca1.getPoblacion() - ca2.getPoblacion())
				.orElse(null)
		);
		
		System.out.println("");
		//Países ordenados por densidad de población
		System.out.println("Países ordenados por densidad de población");
		paises.stream()
			.sorted((pa1,pa2) -> (int) ((pa1.getPoblacion() / pa1.getSuperficie()) - (pa2.getPoblacion() / pa2.getSuperficie())))
			.forEach(pa -> System.out.println(pa.getNombre() + " - " + (pa.getPoblacion() / pa.getSuperficie())));
		
		System.out.println("");
		//Devuelve la primera capital que empiece por C
		System.out.println("Devuelve la primera capital que empiece por C");
		System.out.println(
		paises.stream()
			.map(pa -> pa.getCapital())
			.filter(ca -> ca.getNombre().startsWith("C"))
			.findFirst()
			.orElse(null)
		);
		
		System.out.println("");
		//Muestra cada país y su ciudad más poblada
		System.out.println("Muestra cada país y su ciudad más poblada\n".toUpperCase());
		paises.stream()
			.forEach(pa -> System.out.println(pa.getNombre() + ": " + pa.getCiudades().stream().max((ci1,ci2) -> ci1.getPoblacion() - ci2.getPoblacion()).get().getNombre()));
		
		System.out.println("");
		//Muestra la ciudad más poblada. Puedes usar el ejercicio anterior y continuar a partir de él
		System.out.println("Muestra la ciudad más poblada. Puedes usar el ejercicio anterior y continuar a partir de él\n".toUpperCase());
		System.out.println(
			paises.stream()
				.flatMap(pa -> pa.getCiudades().stream())
				.max((ci1,ci2) -> ci1.getPoblacion() - ci2.getPoblacion())
				.get()
		);
	}

}
