/**
 * 
 */
package Ejercicio5;

import java.util.ArrayList;
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
		for(Publicacion p : miMaterial) {
			if (p.getTitulo().equals(titulo)) {
				return p;
			}
		}
		
		return null;
	}
	
	public ArrayList<Publicacion> buscar(Autor unAutor) {
		ArrayList<Publicacion> porAutor = new ArrayList<>();
		
		for (Publicacion p : miMaterial) {
			for (Autor a : p.misAutores) {
				if (a.equals(unAutor)) {
					porAutor.add(p);
					break;
				}
			}
		}
		
		return porAutor;
	}
	
}
