/**
 * 
 */
package PracticaSetArrayList;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class TipoArmadura {

	enum Zona {CABEZA,TORSO,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER}
	
	private String nombre;
	private Zona miZona;
	private int defensaFisica;
	private int defensaMagica;
	
	/**
	 * @param nombre
	 * @param miZona
	 * @param defensaFisica
	 * @param defensaMagica
	 */
	public TipoArmadura(String nombre, Zona miZona, int defensaFisica, int defensaMagica) {
		super();
		this.nombre = nombre;
		this.miZona = miZona;
		this.defensaFisica = defensaFisica;
		this.defensaMagica = defensaMagica;
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
	 * @return the miZona
	 */
	public Zona getMiZona() {
		return miZona;
	}
	/**
	 * @param miZona the miZona to set
	 */
	public void setMiZona(Zona miZona) {
		this.miZona = miZona;
	}
	/**
	 * @return the defensaFisica
	 */
	public int getDefensaFisica() {
		return defensaFisica;
	}
	/**
	 * @param defensaFisica the defensaFisica to set
	 */
	public void setDefensaFisica(int defensaFisica) {
		this.defensaFisica = defensaFisica;
	}
	/**
	 * @return the defensaMagica
	 */
	public int getDefensaMagica() {
		return defensaMagica;
	}
	/**
	 * @param defensaMagica the defensaMagica to set
	 */
	public void setDefensaMagica(int defensaMagica) {
		this.defensaMagica = defensaMagica;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoArmadura [nombre=");
		builder.append(nombre);
		builder.append(", miZona=");
		builder.append(miZona);
		builder.append(", defensaFisica=");
		builder.append(defensaFisica);
		builder.append(", defensaMagica=");
		builder.append(defensaMagica);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(miZona);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoArmadura other = (TipoArmadura) obj;
		return miZona == other.miZona;
	}
	
	
}
