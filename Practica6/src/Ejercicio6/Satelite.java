/**
 * 
 */
package Ejercicio6;

/**
 * @author usuario1daw
 *
 */
public class Satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	public void printPosicion() {
		System.out.print("El satélite se encuentra en ");
		System.out.print("el paralelo " + paralelo + " meridiano " + meridiano);
		System.out.print(" a una distancia de la Tierra de" + distancia_tierra + " kms.");
	}
	
	/**
	 * funcion que desplaza la altura del satelite
	 * @param desplazamiento
	 */
	public void variaAltura(double desplazamiento) {
		this.distancia_tierra += desplazamiento;
		if (this.distancia_tierra < 0) {
			this.distancia_tierra = 0;
		}
	}
	
	/**
	 * devuelve si el satelite está en orbita o no
	 * @return
	 */
	public boolean enOrbita() {
		if (this.distancia_tierra == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * ajusta la posicion del paralelo y el meridiano
	 * @param variaP
	 * @param variam
	 */
	public void variaPosicion(double variaP, double variam) {
		this.paralelo += variaP;
		this.meridiano += variam;
	}

}
