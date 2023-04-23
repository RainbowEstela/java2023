/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author user
 *
 */
public class Pelicula {
	private static int autoincremental = 1;
	
	private int id;
	private String titulo;
	private int anio;
	private ArrayList<Genero> generos;
	private ArrayList<Director> directores;
	
	
	
	/**
	 * Constructor por defecto
	 * no aumenta el autoincremento de las ids
	 * puede usarse en caso de querer buscar un objeto pelicula por id
	 */
	public Pelicula() {
		super();
		this.id = 0;
		this.titulo = "";
		this.anio = 0;
		this.generos = new ArrayList<>();
		this.directores = new ArrayList<>();
	}

	/**
	 * Constructor con parametros, tiene una id autoincremental por cada pelicula nueva creada
	 * @param id
	 * @param titulo
	 * @param anio
	 */
	public Pelicula(String titulo, int anio) {
		super();
		this.id = autoincremental;
		autoincremental++;
		this.titulo = titulo;
		this.anio = anio;
		this.generos = new ArrayList<>();
		this.directores = new ArrayList<>();
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the generos
	 */
	public ArrayList<Genero> getGeneros() {
		return generos;
	}

	/**
	 * @return the directores
	 */
	public ArrayList<Director> getDirectores() {
		return directores;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [id=");
		builder.append(id);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", generos=");
		builder.append(generos);
		builder.append(", directores=");
		builder.append(directores);
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
		Pelicula other = (Pelicula) obj;
		return id == other.id;
	}
	
	//METODOS Propios
	
	public void addGenero(Genero g) {
		this.generos.add(g);
	}
	
	public void removeGenero(Genero g) {
		this.generos.remove(g);
	}
	
	public void addDirector(Director d) {
		//como una pelicula no suele tener muchos autores no ganamos mucho rendimiento haciendo una busqueda eficiente
		if (this.directores.indexOf(d) == -1) {
			this.directores.add(d);
			d.addPelicula(this);
		}
		
	}
	
	public void removeDirector(Director d) {
		
		if (this.directores.indexOf(d) != -1) {
			this.directores.get(this.directores.indexOf(d)).removePelicula(this);
			this.directores.remove(d);
		}
	}
	
}
