/**
 * 
 */
package com.daw.clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author usuario1daw
 *
 */
public class DAOLectura {

	private Set<Lectura> lecturas;

	/**
	 * Constructor
	 */
	public DAOLectura() {
		super();
		this.lecturas = new HashSet<>();
		this.cargarDatos();
	}
	
	/**
	 * Carga los datos del archivo lecturas.csv al set de lecturas
	 */
	public void cargarDatos() {
		DAOFinca fincas = new DAOFinca();
		Path ruta = Paths.get("./src/resources/lecturas.csv");
		
		try {
			this.lecturas = Files.readAllLines(ruta).stream()
								.map( linea -> {
									String[] datos = linea.split(","); 
									
									return new Lectura(Integer.parseInt(datos[0]),//id
											Double.parseDouble(datos[1]),// temperatura
											Double.parseDouble(datos[2]),// humedad
											LocalDate.parse(datos[3],DateTimeFormatter.ofPattern("yyyy/MM/dd")),// momento
											fincas.findById(Integer.parseInt(datos[4])));//finca
								})
								.collect(Collectors.toSet());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * guarda las modificaciones de las lecturas al archivo .csv
	 */
	public void grabarDatos() {
		
		Path ruta = Paths.get("./src/resources/lecturas.csv");
		
		List<String> lecturasString = this.lecturas.stream()
											.sorted((l1,l2) -> l1.getId() - l2.getId())
											.map( lectura -> {
												StringBuilder sb = new StringBuilder();
												
												sb.append(lectura.getId());
												sb.append(",");
												sb.append(lectura.getTemperatura());
												sb.append(",");
												sb.append(lectura.getHumedad());
												sb.append(",");
												sb.append(lectura.getMomento().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
												sb.append(",");
												sb.append(lectura.getFinca().getId());
												
												return sb.toString();
											})
											.collect(Collectors.toList());
										
		try {
			Files.write(ruta, lecturasString, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * añade una nueva lectura si no esta repetida
	 * @param l
	 */
	public void addlectura(Lectura l) {
		this.lecturas.add(l);
	}
	
	/**
	 * borra la lectura si esta en la lista de lecturas
	 * @param l
	 */
	public void deleteLectura(Lectura l) {
		this.lecturas.remove(l);
	}
	
	//METODOS DE STREAMS
	
	public HashMap<Integer, List<Lectura>> getLecturasPorFinca() {
		Map<Integer, List<Lectura>> lecturasPorFinca = this.lecturas.stream()
															.collect(Collectors.groupingBy( l -> l.getFinca().getId() ));
		return (HashMap<Integer, List<Lectura>>) lecturasPorFinca;
	}
	
	
	/**
	 * devuelve la temperatura maxima de una finca o null si no encuentra
	 * @param id
	 * @return
	 */
	public Double getTempMaximaFinca(int id) {
		return this.lecturas.stream()
						.filter( lectura -> lectura.getFinca().getId() == id)
						.map(Lectura::getTemperatura)
						.reduce( (t1, t2) -> Math.max(t1, t2))
						.orElse(null);
	}
	
	/**
	 * devuelve la temperatura minima de una finca o null si no encuentra
	 * @param id
	 * @return
	 */
	public Double getTempMinimaFinca(int id) {
		return this.lecturas.stream()
				.filter( lectura -> lectura.getFinca().getId() == id)
				.map(Lectura::getTemperatura)
				.reduce( (t1, t2) -> Math.min(t1, t2))
				.orElse(null);
	}
	
	/**
	 * devuelve la lista de humedades ordenadas por fecha
	 * @param id
	 * @return
	 */
	public List<Double> getHumedadPorFinca(int id) {
		return this.lecturas.stream()
						.filter(lectura -> lectura.getFinca().getId() == id)
						.sorted( (l1,l2) -> l1.getMomento().compareTo(l2.getMomento()))
						.map(lectura -> lectura.getHumedad())
						.collect(Collectors.toList());
	}
	
	/**
	 * devuelve la lista de temperaturas por finca ordenadas por fecha
	 * @param id
	 * @return
	 */
	public List<Double> getTemperaturaPorFinca(int id) {
		return this.lecturas.stream()
				.filter(lectura -> lectura.getFinca().getId() == id)
				.sorted( (l1,l2) -> l1.getMomento().compareTo(l2.getMomento()))
				.map(lectura -> lectura.getTemperatura())
				.collect(Collectors.toList());
	}
	
	public List<Double> getTempDiaPorFinca(int id, LocalDate dia) {
		return this.lecturas.stream()
						.filter(l -> l.getFinca().getId() == id)
						.filter(l -> l.getMomento().equals(dia))
						.map(l -> l.getTemperatura())
						.collect(Collectors.toList());
	}
}
