/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class PrimeVideo {

	private ArrayList<Multimedia> catalogo;
	private ArrayList<Cliente> suscripciones;
	private double ganancias;
	
	/**
	 * 
	 */
	public PrimeVideo() {
		super();
		this.catalogo = new ArrayList<>();
		this.suscripciones = new ArrayList<>();
		this.ganancias = 0;
	}
	
	public void addSuscricion(Cliente unCliente) {
		int indice = this.suscripciones.indexOf(unCliente);
		
		if (indice == -1) {
			this.suscripciones.add(unCliente);
		}
	}
	
	public void addMultimedia(Multimedia unMultimedia) {
		int indice = this.catalogo.indexOf(unMultimedia);
		
		if (indice == -1) {
			this.catalogo.add(unMultimedia);
		}
	}
	
	/**
	 * devuelve si la opceracion se hizo o no
	 * @param m
	 * @param c
	 * @return
	 */
	public boolean ver(Multimedia m, Cliente c) {
		int indiceCliente = this.suscripciones.indexOf(c);
		int indiceMultimedia = this.catalogo.indexOf(m);
		Cliente miCliente = null;
		Multimedia miMultimedia = null;
		
		if (indiceCliente != -1) {
			miCliente = this.suscripciones.get(indiceCliente);
		} else {
			return false;
		}
		
		if (indiceMultimedia != -1) {
			miMultimedia = this.catalogo.get(indiceMultimedia);
		} else {
			return false;
		}
		
		if( miMultimedia.isPlus() == false || (miMultimedia.plus == true && miCliente.esPro() == false )) {
			this.ganancias += miMultimedia.getPrecio();
		}
		
		return true;
	}
	
	public ArrayList<Cliente> getSuscripciones() {
		return this.suscripciones;
	}
	
	public ArrayList<Multimedia> getMultimedia() {
		return this.catalogo;
	}
	
	public double getGanancias() {
		for(Cliente c : suscripciones) {
			ganancias += c.getPrecioMensual() * 12;
		}
		
		return ganancias;
	}
}
