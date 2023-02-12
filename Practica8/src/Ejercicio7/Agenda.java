/**
 * 
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Agenda {
	ArrayList<Contacto> misContactos;

	/**
	 * @param misContactos
	 */
	public Agenda() {
		super();
		this.misContactos = new ArrayList<>();
	}
	
	private boolean existeContacto(Contacto c) {
		if (this.misContactos.indexOf(c) != -1) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * devuelve si se ha podido añadir un contacto y lo añade a la lista
	 * @param c
	 * @return
	 */
	public boolean addContacto(Contacto c) {
		if (existeContacto(c) == false) {
			this.misContactos.add(c);
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
		for(Contacto i : this.misContactos) {
			sb.append(i.toString() + "\n");
		}
		return sb.toString();
	}
	
	/**
	 * devuelve el numero de un contacto si existe y un mensje de error si no existe
	 * @param unNombre
	 * @return
	 */
	public String BuscarContacto(String unNombre) {
		if (existeContacto(new Contacto(unNombre, "")) == true) {
			return this.misContactos.get(this.misContactos.indexOf(new Contacto(unNombre, ""))).getTelefono();
		} else {
			return "Error: el contacto no existe";
		}
	}
	
	/**
	 * elimina un contacto si existe y devuelve si lo ha borrado o no
	 */
	public boolean eliminar(Contacto c) {
		if (existeContacto(c) == true) {
			this.misContactos.remove(c);
			return true;
		} else {
			return false;
		}
	}
	
}
