/**
 * 
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 * @author usuario1daw
 *
 */
public class Scotify {
	private ArrayList<Multimedia> miMultimedia;

	/**
	 */
	public Scotify() {
		super();
		this.miMultimedia = new ArrayList<>();
	}
	
	public void addMultimedia(Multimedia unMultimedia) {
		if (this.miMultimedia.indexOf(unMultimedia) == -1) {
			this.miMultimedia.add(unMultimedia);
		}
	}
	
	public void quitarMultimedia(Multimedia unMultimedia) {
		this.miMultimedia.remove(unMultimedia);
		
	}
	
	public Multimedia buscar(String nombre) {
		for (Multimedia m : miMultimedia) {
			if (nombre.equals(m.getNombre())) {
				return m;
			}
		}
		
		return null;
	}
	
	public ArrayList<Multimedia> buscarPorAutor(Autor unAutor) {
		ArrayList<Multimedia> encontrados = new ArrayList<>();
		
		for (Multimedia m : miMultimedia) {
			for (Autor a : m.getAutores()) {
				if (a.equals(unAutor)) {
					encontrados.add(m);
				}
			}
		}
		
		return encontrados;	
	}
	
	public ArrayList<Multimedia> getMultimedia() {
		return miMultimedia;
	}
	
}
