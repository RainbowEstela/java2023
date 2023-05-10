/**
 * 
 */
package com.daw.clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
	
	private void cargarDatos() {
		DAOFinca fincas = new DAOFinca();
		Path ruta = Paths.get("./src/resources/lecturas.csv");
		
		try {
			this.lecturas = Files.readAllLines(ruta).stream()
								.map( linea -> {
									String[] datos = linea.split(","); 
									
									return new Lectura(Integer.parseInt(datos[0]),//id
											Double.parseDouble(datos[1]),// temperatura
											Double.parseDouble(datos[2]),// humedad
											LocalDate.parse(datos[3]),// momento
											fincas.findById(Integer.parseInt(datos[4])));//finca
								})
								.collect(Collectors.toSet());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
