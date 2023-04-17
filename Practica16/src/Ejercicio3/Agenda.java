/**
 * 
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author user
 *
 */
public class Agenda {
	TreeMap<String,String> misContactos;

	/**
	 * @param misContactos
	 */
	public Agenda() {
		super();
		this.misContactos = new TreeMap<>();
	}
	
	/**
	 * devulvete true si el contacto existe y false si no existe
	 * @param nombreCompleto
	 * @return
	 */
	private boolean existeContacto(String nombreCompleto) {
		return misContactos.containsKey(nombreCompleto);
	}
	
	/**
	 * añade un contacto y su numero a la agenda en caso de no añadirlo retorna false
	 * @param contacto
	 * @param telefono
	 * @return
	 */
	public boolean addContacto(String contacto, String telefono) {
		String exito = misContactos.put(contacto, telefono);
		
		if (exito != "null") {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * devulve un string con todos los contactos
	 * @return
	 */
	public String listarContactos() {
		StringBuilder sb = new StringBuilder();
		sb.append("contactos:\n");
		
		Set<String> contacto = this.misContactos.keySet();
		for(String i : contacto) {
			sb.append(i + ": ");
			sb.append(this.misContactos.get(i) + "\n");
		}
		return sb.toString();
	}
	
	/**
	 * devuelve el numero de un contacto si existe y un mensje de error si no existe
	 * @param unNombre
	 * @return
	 */
	public String BuscarContacto(String unNombre) {
		
		Set<String> contactos = this.misContactos.keySet();
		ArrayList<String> coincidencias = new ArrayList<>();
		
		for(String st : contactos) {
			if(st.contains(unNombre)) {
				coincidencias.add(st);
			}
		}
		
		if (coincidencias.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (String st : coincidencias) {
				sb.append(st + ": ");
				sb.append(this.misContactos.get(st) + "\n");
			}
			
			return sb.toString();
		} else {
			return "Error: el contacto no existe";
		}
	}
	
	/**
	 * elimina un contacto si existe y devuelve si lo ha borrado o no
	 */
	public boolean eliminar(String nombreCompleto) {
		if (this.misContactos.containsKey(nombreCompleto)) {
			this.misContactos.remove(nombreCompleto);
			return true;
		} else {
			return false;
		}
	}
	
}
