/**
 * 
 */
package com.daw.clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author usuario1daw
 *
 */
public class DAOFinca {

	private List<Finca> fincas;

	/**
	 * Constructor
	 */
	public DAOFinca() {
		super();
		this.fincas = new ArrayList<>();
		this.cargarDatos();
	}
	
	//METODOS PROPIOS
	/**
	 * Carga en memoria los datos del fichero finca.csv dentro de src/resources
	 */
	private void cargarDatos() {
		Path ruta = Paths.get("./src/resources/fincas.csv");
		
		try {
			Files.readAllLines(ruta).stream()
					.forEach( linea -> {
						String[] datos = linea.split(",");
						
						this.fincas.add(new Finca(Integer.parseInt(datos[0]),// id
										datos[1], //nombre
										Double.parseDouble(datos[2]), //longitud
										Double.parseDouble(datos[3]), //latitud
										Double.parseDouble(datos[4]), // superficie
										datos[5], //provincia
										datos[6])); //localidad
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * devuelve la finca de la id pasada si la hubiera sino devuelve null
	 * @param id
	 * @return Finca
	 */
	public Finca findById(int id) {
		Finca f = this.fincas.stream()
					.filter( finca -> finca.getId() == id)
					.findFirst()
					.orElse(null);
		return f;
	}
	
	/**
	 * añade una finca a la lista si no esta, devuelve true si la consigue añadir, false si no la añade
	 * @param f
	 * @return exito true o false
	 */
	public boolean addFinca(Finca f) {
		if(!this.fincas.contains(f)) {
			this.fincas.add(f);
			return true;
		}
		
		return false;
	}
	
	/**
	 * borra de la lista la finca pasada si está, devuelve true si la borra o false si no la borra
	 * @param f
	 * @return exito true o false
	 */
	public boolean deleteFinca(Finca f) {
		if(this.fincas.contains(f)) {
			this.fincas.remove(f);
			return true;
		}
		
		return false;
	}
	
	/**
	 * devuelve una lista de fincas que coincidan con el nombre pasado por teclado
	 * @param nombre
	 * @return
	 */
	public List<Finca> findByName(String nombre) {
		return this.fincas.stream()
					.filter( finca -> finca.getNombre().equals(nombre))
					.collect(Collectors.toList());
	}
}
