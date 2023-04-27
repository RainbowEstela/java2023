/**
 * 
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class Pais {
	
	enum Continente{ASIA,AFRICA,AMERICANORTE,AMERICASUR,ANTARTIDA,EUROPA,OCEANIA}
	
	private static int autoIncremento = 1;
	
	private int codigo;
	private String nombre;
	private Continente continente;
	private double superficie;
	private int poblacion;
	private Ciudad capital;
	private List<Ciudad> ciudades;
	
	/**
	 * Constructor
	 * @param codigo
	 * @param nombre
	 * @param continente
	 * @param superficie
	 * @param poblacion
	 * @param capital
	 * @param ciudades
	 */
	public Pais(String nombre, Continente continente, double superficie, int poblacion, Ciudad capital) {
		super();
		this.codigo = autoIncremento;
		autoIncremento++;
		this.nombre = nombre;
		this.continente = continente;
		this.superficie = superficie;
		this.poblacion = poblacion;
		this.ciudades = new ArrayList<>();
		this.capital = capital;
		addCiudad(capital);
	
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
	 * @return the continente
	 */
	public Continente getContinente() {
		return continente;
	}

	/**
	 * @param continente the continente to set
	 */
	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the poblacion
	 */
	public int getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the capital
	 */
	public Ciudad getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(Ciudad capital) {
		this.capital = capital;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the ciudades
	 */
	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pais [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", continente=");
		builder.append(continente);
		builder.append(", superficie=");
		builder.append(superficie);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", capital=");
		builder.append(capital.getNombre());
		builder.append(", ciudades=");
		builder.append(ciudades);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return codigo == other.codigo;
	}
	
	//Metodos propios
	/**
	 * Añade la ciudad si no estaba y le asigna a esa ciudad este pais
	 * @param c
	 */
	public void addCiudad(Ciudad c) {
		if (!this.ciudades.contains(c)) {
			this.ciudades.add(c);
			c.setPais(this);
		}
	}
	
	/**
	 * Elimina la ciudad del pais y borra el pais de la ciudad
	 * @param c
	 */
	public void deleteCiudad(Ciudad c) {
		if (this.ciudades.contains(c)) {
			this.ciudades.get(this.ciudades.indexOf(c)).setPais(null);
			this.ciudades.remove(c);
		}
	}
	
}
