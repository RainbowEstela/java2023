/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author user
 *
 */
public class Biblioteca {
	private ArrayList<Publicacion> miMaterial;
	private String direccion;
	
	/**
	 * @param direccion
	 */
	public Biblioteca(String direccion) {
		super();
		this.miMaterial = new ArrayList<>();
		this.direccion = direccion;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public void adquirirMaterial(Publicacion unaPub) {
		miMaterial.add(unaPub);
	}
	
	public Publicacion buscar(String titulo) {
		Collections.sort(miMaterial);
		int index = Collections.binarySearch(miMaterial, new Libro("", titulo, 0, 0));
		/*
		if (index == -1) {
			index = Collections.binarySearch(miMaterial, new Revista("", titulo, 0, 0, 0));
		}
		*/
		if (index != -1) {
			return miMaterial.get(index);
		}
		
		return null;
	}
	
	public ArrayList<Publicacion> buscar(Autor unAutor) {
		ArrayList<Publicacion> porAutor = new ArrayList<>();
		
		for (Publicacion p : miMaterial) {
			 if (p.getAutores().contains(unAutor) ) {
				 porAutor.add(p);
			 }
		}
		
		return porAutor;
	}
	
}
