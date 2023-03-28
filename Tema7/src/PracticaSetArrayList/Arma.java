/**
 * 
 */
package PracticaSetArrayList;

/**
 * @author usuario1daw
 *
 */
public class Arma {
	enum Tipo {ESPADA,HACHA,MAZO,BASTON,BARITA,ARCO,DAGA};
	
	private String nombre;
	private Tipo miTipo;
	private boolean esMagico;
	private int danioFisico;
	private int danioMagico;
	
	/**
	 * @param nombre
	 * @param miTipo
	 * @param esMagico
	 * @param danioFisico
	 * @param danioMagico
	 */
	public Arma(String nombre, Tipo miTipo, boolean esMagico, int danioFisico, int danioMagico) {
		super();
		this.nombre = nombre;
		this.miTipo = miTipo;
		this.esMagico = esMagico;
		this.danioFisico = danioFisico;
		this.danioMagico = danioMagico;
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
	 * @return the miTipo
	 */
	public Tipo getMiTipo() {
		return miTipo;
	}

	/**
	 * @param miTipo the miTipo to set
	 */
	public void setMiTipo(Tipo miTipo) {
		this.miTipo = miTipo;
	}

	/**
	 * @return the esMagico
	 */
	public boolean isEsMagico() {
		return esMagico;
	}

	/**
	 * @param esMagico the esMagico to set
	 */
	public void setEsMagico(boolean esMagico) {
		this.esMagico = esMagico;
	}

	/**
	 * @return the danioFisico
	 */
	public int getDanioFisico() {
		return danioFisico;
	}

	/**
	 * @param danioFisico the danioFisico to set
	 */
	public void setDanioFisico(int danioFisico) {
		this.danioFisico = danioFisico;
	}

	/**
	 * @return the danioMagico
	 */
	public int getDanioMagico() {
		return danioMagico;
	}

	/**
	 * @param danioMagico the danioMagico to set
	 */
	public void setDanioMagico(int danioMagico) {
		this.danioMagico = danioMagico;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", miTipo=");
		builder.append(miTipo);
		builder.append(", esMagico=");
		builder.append(esMagico);
		builder.append(", danioFisico=");
		builder.append(danioFisico);
		builder.append(", danioMagico=");
		builder.append(danioMagico);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
