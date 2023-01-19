/**
 * 
 */
package Ejercicio8;

/**
 * @author usuario1daw
 *
 */
public class Incidencia {

	private int codigo;
	private String estado;
	private String problema;
	private String solucion;
	
	private static int pendientes;
	
	
	/**
	 * @param codigo
	 * @param problema
	 * @param solucion
	 */
	public Incidencia(int codigo, String problema) {
		super();
		this.codigo = codigo;
		this.problema = problema;
		this.estado = "abierta";
		pendientes++;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


	/**
	 * @return the problema
	 */
	public String getProblema() {
		return problema;
	}


	/**
	 * @param problema the problema to set
	 */
	public void setProblema(String problema) {
		this.problema = problema;
	}


	/**
	 * @return the solucion
	 */
	public String getSolucion() {
		return solucion;
	}


	/**
	 * @param solucion the solucion to set
	 */
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}


	/**
	 * decrementa en uno el numero de pendientes si no está resuelta la incidencia
	 */
	public void resuelve(String solucion) {
		if (this.estado != "resuelta") {
			this.solucion = solucion;
			this.estado = "resuelta";
			pendientes--;
		}
	}
	
	/**
	 * metodo que retorna el numero de incidencias pendientes a resolver
	 * @return
	 */
	public static int getPendientes() {
		return pendientes;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incidencia [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}



	
	
	
}
