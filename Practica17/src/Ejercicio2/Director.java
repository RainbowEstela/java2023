/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author user
 *
 */
public class Director {
	private static int autoincremento = 1;
	
	private int id;
	private String nombre;
	private List<Pelicula> peliculas;
	/**
	 * Constructor por defecto
	 * no aumenta el autoincremento de ids
	 * puede usarse para la busqueda de objetos Director
	 */
	public Director() {
		super();
		this.id = 0;
		this.nombre = "";
		this.peliculas = new ArrayList<>();
	}
	
	/**
	 * Constructor parametrizado, usa un autoincremento para gestionar las ids
	 * @param nombre
	 */
	public Director(String nombre) {
		super();
		this.id = autoincremento;
		autoincremento++;
		this.nombre = nombre;
		this.peliculas = new ArrayList<>();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the peliculas
	 */
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Director [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		return id == other.id;
	}
	
	//METODOS PROPIOS
	
	public void addPelicula(Pelicula p) {
		if (this.peliculas.indexOf(p) == -1) {
			this.peliculas.add(p);
			p.addDirector(this);
			
		}
	}
	
	public void removePelicula(Pelicula p) {
		if (this.peliculas.indexOf(p) != -1) {
			this.peliculas.get(this.peliculas.indexOf(p)).removeDirector(this);
			this.peliculas.add(p);
		}
	}
	
}
