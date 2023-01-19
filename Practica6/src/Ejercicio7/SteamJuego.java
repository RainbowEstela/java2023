/**
 * 
 */
package Ejercicio7;

/**
 * @author user
 *
 */
public class SteamJuego {
	private String nombre;
	private String descripcionCorta;
	private String imagen;
	private double mediaJugadoresDiarios;
	private int diasDesdeSalida;
	private double precio;
	private int puestoMasVendidos;
	
	/**
	 * @param nombre
	 * @param descripcionCorta
	 * @param imagen
	 * @param mediaJugadoresDiarios
	 * @param diasDesdeSalida
	 * @param precio
	 * @param puestoMasVendidos
	 */
	public SteamJuego(String nombre, String descripcionCorta, String imagen, double mediaJugadoresDiarios,
			int diasDesdeSalida, double precio, int puestoMasVendidos) {
		super();
		this.nombre = nombre;
		this.descripcionCorta = descripcionCorta;
		this.imagen = imagen;
		this.mediaJugadoresDiarios = mediaJugadoresDiarios;
		this.diasDesdeSalida = diasDesdeSalida;
		this.precio = precio;
		this.puestoMasVendidos = puestoMasVendidos;
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
	 * @return the descripcionCorta
	 */
	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	/**
	 * @param descripcionCorta the descripcionCorta to set
	 */
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the mediaJugadoresDiarios
	 */
	public double getMediaJugadoresDiarios() {
		return mediaJugadoresDiarios;
	}

	/**
	 * @param mediaJugadoresDiarios the mediaJugadoresDiarios to set
	 */
	public void setMediaJugadoresDiarios(double mediaJugadoresDiarios) {
		this.mediaJugadoresDiarios = mediaJugadoresDiarios;
	}

	/**
	 * @return the diasDesdeSalida
	 */
	public int getDiasDesdeSalida() {
		return diasDesdeSalida;
	}

	/**
	 * @param diasDesdeSalida the diasDesdeSalida to set
	 */
	public void setDiasDesdeSalida(int diasDesdeSalida) {
		this.diasDesdeSalida = diasDesdeSalida;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the puestoMasVendidos
	 */
	public int getPuestoMasVendidos() {
		return puestoMasVendidos;
	}

	/**
	 * @param puestoMasVendidos the puestoMasVendidos to set
	 */
	public void setPuestoMasVendidos(int puestoMasVendidos) {
		this.puestoMasVendidos = puestoMasVendidos;
	}
	
	public void jugadoresDia(int jugadoresHoy) {
		
		this.mediaJugadoresDiarios = ( (this.mediaJugadoresDiarios * this.diasDesdeSalida) + jugadoresHoy ) / (this.diasDesdeSalida + 1); 
		
	}
	
	
}
