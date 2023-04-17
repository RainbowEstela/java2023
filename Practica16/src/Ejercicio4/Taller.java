/**
 * 
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

import Ejercicio4.Vehiculo.Estado;

/**
 * @author user
 *
 */
public class Taller {
	private ArrayList<Vehiculo> vehiculos;

	/**
	 * Constructor
	 */
	public Taller() {
		super();
		this.vehiculos = new ArrayList<>();
	}

	/**
	 * @return the vehiculos
	 */
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Vehiculo v : vehiculos) {
			builder.append(v.toString() + "\n");
		}
		return builder.toString();
	}
	
	//Metodos propios
	
	/**
	 * añade un vehiculo si su matricula no esta y devuelve true, si la matricula esta no lo añade y retorna false
	 * @param v
	 * @return
	 */
	public boolean ingresarCoche(Vehiculo v) {
		int indice = Collections.binarySearch(vehiculos, v);
		
		if(indice < 0) {
			vehiculos.add(v);
			Collections.sort(vehiculos);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * simula la accion de reparar un vehiculo cambiando su estado a reparado
	 * @param v
	 */
	public Vehiculo vehiculoReparado(Vehiculo v) {
		int index = Collections.binarySearch(vehiculos, v);
		
		
		
		
		if (index >= 0) {
			Vehiculo reparado = vehiculos.get(index);
			reparado.setEstado(Estado.REPARADO);
			return reparado;
		} else {
			return null;
		}
		
	}
	
	/**
	 * elimina un vehiculo de la lista y devuelve true si lo ha conseguido eliminar
	 * @param v
	 * @return
	 */
	public boolean eliminarVehiculo(Vehiculo v) {
		int indice = Collections.binarySearch(vehiculos, v);
		
		if (indice >= 0) {
			vehiculos.remove(indice);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * busca un vehiculo por matricula y lo devuelve si lo encuentra
	 * @param matricula
	 * @return
	 */
	public Vehiculo buscarVehiculo(String matricula) {
		int index = Collections.binarySearch(vehiculos, new Vehiculo(matricula, "", "", "", 0, 0));
		if (index >= 0) {
			return vehiculos.get(index);
		} else {
			return null;
		}
	}
}
