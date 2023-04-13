/**
 * 
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author usuario1daw
 *
 */
public class VisitadoHM {
	private HashMap<String, List<String>> mapa;

	/**
	 * Constructor
	 */
	public VisitadoHM() {
		super();
		this.mapa = new HashMap<>();
	}
	
	/**
	 * añade un nuevo pais al mapa
	 * @param nombre
	 */
	public void addPais(String nombre) {
		mapa.put(nombre, new ArrayList<String>());
	}
	
	/**
	 * añade a un pais que esté en el mapa una ciudad visitada
	 * @param nomPais
	 * @param nombCiudad
	 */
	public void addCiudad(String nomPais, String nombCiudad) {
		if (mapa.containsKey(nomPais)) {
			
			int index = Collections.binarySearch(mapa.get(nomPais), nombCiudad);
			if(index < 0) {
				mapa.get(nomPais).add(nombCiudad);
				Collections.sort(mapa.get(nomPais));
			}

		}
	}
	
	/**
	 * pinta por pantalla todos los paises con sus ciudades visitadas
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
	 * comprueba que se haya visitado una ciudad de un pais
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
}
