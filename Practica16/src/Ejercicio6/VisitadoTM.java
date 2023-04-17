/**
 * 
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author usuario1daw
 *
 */
public class VisitadoTM {
	private TreeMap<String, List<String>> mapa;

	/**
	 * Constructor
	 */
	public VisitadoTM() {
		super();
		this.mapa = new TreeMap<>(Comparator.reverseOrder());
	}
	
	/**
	 * añade un pais que no estuviera al mapa
	 * @param pais
	 */
	public void addPais(String pais) {
		mapa.put(pais, new ArrayList<>());
	}
	
	/**
	 * Añade una ciudad nueva a un pais del mapa
	 * @param pais
	 * @param ciudad
	 */
	public void addCiudad(String pais, String ciudad) {
		if (mapa.containsKey(pais)) {
			
			int index = Collections.binarySearch(mapa.get(pais), ciudad);
			if(index < 0) {
				mapa.get(pais).add(ciudad);
				Collections.sort(mapa.get(pais));
			}

		}
	}
	
	/**
	 * pinta todos los paises con las ciudades visitadas
	 */
	public void mostrarVisitados() {
		for(String k : mapa.keySet()) {
			System.out.println("De " + k + " ha visitado");
			for(String c : mapa.get(k)) {
				System.out.println("- " + c);
			}
		}
	}
	
	/**
	 * comprueba si la ciudad de un pais dados ha sido visitada o no
	 * @param pais
	 * @param ciudad
	 * @return
	 */
	public boolean heVisitado(String pais, String ciudad) {
		if (mapa.containsKey(pais)) {
			int index = Collections.binarySearch(mapa.get(pais), ciudad);
			
			if(index >= 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public Set<String> primeros(String pais) {
		if (mapa.containsKey(pais)) {
			return mapa.headMap(pais).keySet();
		} else {
			return new TreeSet<>();
		}
	}
	
}
