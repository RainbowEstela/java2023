/**
 * 
 */
package Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Disco {
	private String titulo;
	private LocalDate fecha;
	private Autor grupo;
	private String discografica;
	private ArrayList<Cancion> misCanciones;
	/**
	 * @param titulo
	 * @param fecha
	 * @param grupo
	 * @param discografica
	 * @param misCanciones
	 */
	public Disco(String titulo, LocalDate fecha, Autor grupo, String discografica) {	
		this.titulo = titulo;
		this.fecha = fecha;
		this.grupo = grupo;
		this.discografica = discografica;
		this.misCanciones = new ArrayList<>();
	}
	
	public void addCancion(Cancion unaCancion) {
		if (this.misCanciones.indexOf(unaCancion) == -1) {
			unaCancion.setMiDisco(this);
			this.misCanciones.add(unaCancion);
		}
	}
	
	public void quitarCancion(Cancion unaCancion) {
		this.misCanciones.remove(unaCancion);
		
	}
	
	public ArrayList<Cancion> getCanciones() {
		return this.misCanciones;
	}
	
	public int getDuracion() {
		int total = 0;
		for (Cancion c : misCanciones) {
			total += c.getDuracion();
		}
		
		return total;
	}
}
