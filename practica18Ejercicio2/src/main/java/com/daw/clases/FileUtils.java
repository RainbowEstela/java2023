/**
 * 
 */
package com.daw.clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author user
 *
 */
public class FileUtils {

	/**
	 * Metodo al que se le pasa una ruta y devuelve la el peso de todos sus archivos de forma recursiva
	 * @param ruta
	 * @return long totalSize
	 */
	public static long calcularRecursivamente(String ruta) {
		
		Path inicio = Paths.get(ruta);
		Long totalSize = (long) 0;
		try {
			totalSize = Files.walk(inicio, Integer.MAX_VALUE)
					.filter(Files::isRegularFile)
					.map(t -> {
						try {
							return Files.size(t);
						} catch (IOException e) {
							e.printStackTrace();
							return null;
						}	
					})
					.reduce( Math::addExact)
					.orElse(null);
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return totalSize;
	}
	
	/**
	 * muestra por pantalla todas las rutas que contengan el fichero o las conincidencias de ese fichero
	 * @param fichero
	 * @param ruta
	 */
	public static void buscarCoincidencias(String fichero, String ruta) {
		Path inicio = Paths.get(ruta);
		
		try {
			Files.find(inicio, Integer.MAX_VALUE, (path, attr) -> String.valueOf(path).contains(fichero))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * borra todas las coincidencias dentro de la ruta pasada del fichero pasado
	 * @param fichero
	 * @param ruta
	 */
	public static void eliminarCoincidencias(String fichero, String ruta) {
		Path inicio = Paths.get(ruta);
		
		try {
			Files.find(inicio, Integer.MAX_VALUE, (path, attr) -> String.valueOf(path).endsWith(fichero))
					.forEach(t -> {
						try {
							Files.deleteIfExists(t);
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Path> ficherosRuta(String ruta) {
		List<Path> archivos = null;
		
		Path inicio = Paths.get(ruta);
		
		try {
			archivos = Files.walk(inicio, Integer.MAX_VALUE)
						.filter(Files::isRegularFile)
						.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return archivos;
	}
}
