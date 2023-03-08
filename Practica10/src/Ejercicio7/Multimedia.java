/**
 * 
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author user
 *
 */
public class Multimedia implements Reproducible {
	protected String nombre;
	protected int duracion;
	protected int year;
	protected ArrayList<Autor> autores;
	protected int reproducciones;
	/**
	 * @param nombre
	 * @param duracion
	 * @param year
	 */
	public Multimedia(String nombre, int duracion, int year) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.year = year;
		this.autores = new ArrayList<>();
		this.reproducciones = 0;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the reproducciones
	 */
	public int getReproducciones() {
		return reproducciones;
	}

	
	public void addAutor(Autor unAutor) {
		if (this.autores.indexOf(unAutor) == -1) {
			this.autores.add(unAutor);
		}
	}
	
	public void quitarAutor(Autor unAutor) {
		this.autores.remove(unAutor);
		
	}
	
	public ArrayList<Autor> getAutores() {
		return this.autores;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", year=");
		builder.append(year);
		builder.append(", reproducciones=");
		builder.append(reproducciones);
		builder.append("] \n");
		builder.append(", autores=");
		for (Autor a : autores) {
			builder.append(a.toString());
			builder.append("\n");
		}
		
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return duracion == other.duracion && Objects.equals(nombre, other.nombre);
	}
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo " + this.nombre);
		this.reproducciones++;
	}
	
	
}
