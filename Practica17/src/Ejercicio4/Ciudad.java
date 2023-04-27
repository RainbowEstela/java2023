/**
 * 
 */
package Ejercicio4;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class Ciudad {
	private static int autoIncremento = 1;
	
	private int codigo;
	private String nombre;
	private int poblacion;
	private Pais pais;

	/**
	 * Constructor
	 * @param nombre
	 * @param poblacion
	 */
	public Ciudad(String nombre, int poblacion) {
		super();
		this.codigo = autoIncremento;
		autoIncremento++;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.pais = null;
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
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ciudad [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", pais=");
		builder.append(pais.getNombre());
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
		Ciudad other = (Ciudad) obj;
		return codigo == other.codigo;
	}
	
	
}
