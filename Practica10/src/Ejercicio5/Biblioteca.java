/**
 * 
 */
package Ejercicio5;

import java.util.ArrayList;

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
		int posicion = miMaterial.indexOf(titulo);
		if (posicion != -1) {
			return miMaterial.get(posicion);
		} else {
			return null;
		}
	}
	
}
