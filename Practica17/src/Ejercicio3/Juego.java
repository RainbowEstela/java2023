/**
 * 
 */
package Ejercicio3;

/**
 * @author usuario1daw
 *
 */
public class Juego {
	private int autoIncremento = 1;
	
	private int id;
	private String nombre;
	private String plataforma;
	
	/**
	 * Constructor parametrizado
	 * @param nombre
	 * @param plataforma
	 */
	public Juego(String nombre, String plataforma) {
		super();
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.id = autoIncremento;
		autoIncremento++;
	}

	/**
	 * Constructor con solo id como parametro
	 * usar solo para buscar otros objetos juego
	 * no incrementa las ids
	 * @param id
	 */
	public Juego(int id) {
		super();
		this.id = id;
		this.nombre = "";
		this.plataforma = "";
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
	 * @return the plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * @param plataforma the plataforma to set
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
	
		builder.append(nombre);
		builder.append(" - ");
		builder.append(plataforma);

		return builder.toString();
	}
	
	
	
	
}
