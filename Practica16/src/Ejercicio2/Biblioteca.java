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
	 * constructor de la clase biblioteca
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
	
	/**
	 * añade un objeto publicacion a la lista de publicaciones de la biblioteca
	 * @param unaPub
	 */
	public void adquirirMaterial(Publicacion unaPub) {
		miMaterial.add(unaPub);
	}
	
	/**
	 * Busca y devuelve las publicaciones de la biblioteca que coincidan con el string pasado por parametro a modo de titulo
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		Collections.sort(miMaterial);
		//decidí usar uno de los hijos de publicacion para hacer el binary search para no cambiar el par�metro de esta funcion
		//hacer este apaño me ahorra tener que cambiar mas codigo en la clase testbiblioteca pero si el ejercicio lo hubiera empezado de cero
		//pediria por parametro un objeto publicacion
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
	
	/**
	 * Busca y retorna las publicaciciones de la biblioteca que contengan el autor que se le pase por parametro
	 * @param unAutor
	 * @return
	 */
	public ArrayList<Publicacion> buscar(Autor unAutor) {
		ArrayList<Publicacion> porAutor = new ArrayList<>();
		
		//en este caso no se puede hacer una busqueda eficiente por autor ya que hay que recorrerse todas las publicaciones en busca del autor
		//solo se puede hacer de forma eficiente la busqueda del autor pero no tiene mucho sentido por solo tener unos pocos autores
		//si la clase autor guardase a su vez las publicaciones que tiene si se podria buscar de forma eficiente por autor
		for (Publicacion p : miMaterial) {
			 if (p.getAutores().contains(unAutor) ) {
				 porAutor.add(p);
			 }
		}
		
		return porAutor;
	}
	
}
