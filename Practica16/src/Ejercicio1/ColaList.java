/**
 * 
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 * @author usuario1daw
 *
 */
public class ColaList<E> {
	private ArrayList<E> cola;

	/**
	 * Constructor de la clase
	 */
	public ColaList() {
		super();
		cola = new ArrayList<>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ColaList [cola=");
		builder.append(cola);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * Metodo que añade el objeto a al final de la cola y devuelve true si es añadido
	 * No acepta duplicados
	 * @param e
	 * @return
	 */
	public boolean meter(E e) {
		 if (!cola.contains(e)) {
			 cola.add(e);
			 return true;
		 } else {
			 return false;
		 }
	}
	
	/**
	 * Metodo que devuelve el objeto primero en la cola y lo borra de la cola
	 * @return
	 */
	public E poll() {
		if (cola.size() != 0) {
			E e = cola.get(0);
			cola.remove(0);
			return e;
		} else {
			return null;
		}
	}
	
	/**
	 * Metodo que devuelve el primer objeto de la cola pero no lo borra de la cola
	 * @return
	 */
	public E peek() {
		if (cola.size() != 0) {
			E e = cola.get(0);
			return e;
		} else {
			return null;
		}
	}
}
