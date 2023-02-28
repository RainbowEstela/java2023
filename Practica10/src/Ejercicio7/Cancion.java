package Ejercicio7;

public class Cancion extends Multimedia {
	enum Genero {ROCK,POP,DISCO,HIPHOP,TRAP,SOUL,JAZZ,ELECTRONICA,METAL,CLASICA,LATINO};
	
	private int posicion;
	private Genero genero;
	private Disco miDisco;
	/**
	 * @param nombre
	 * @param duracion
	 * @param year
	 * @param posicion
	 * @param genero
	 * @param miDisco
	 */
	public Cancion(String nombre, int duracion, int year, int posicion, Genero genero, Disco miDisco) {
		super(nombre, duracion, year);
		this.posicion = posicion;
		this.genero = genero;
		this.miDisco = miDisco;
	}
	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	/**
	 * @return the miDisco
	 */
	public Disco getMiDisco() {
		return miDisco;
	}
	/**
	 * @param miDisco the miDisco to set
	 */
	public void setMiDisco(Disco miDisco) {
		this.miDisco = miDisco;
	}
	
	
	

}
