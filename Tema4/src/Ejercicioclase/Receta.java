/**
 * 
 */
package Ejercicioclase;

import java.util.ArrayList;

/**
 * @author usuario1daw
 *
 */
public class Receta {
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	
	/**
	 * @param nombre
	 * @param ingredientes
	 */
	public Receta(String nombre) {
		super();
		this.nombre = nombre;
		this.ingredientes = new ArrayList<>();
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
	 * retorna un string con la receta
	 * @return
	 */
	public String printarReceta() {
		int contador = 1;
		var sb = new StringBuffer();
		
		sb.append(this.nombre);
		sb.append("\n");
		
		for (Ingrediente i : this.ingredientes) {
			sb.append(contador + ". ");
			sb.append(i.toString());
			sb.append("\n");
			contador++;
		}
		
		return sb.toString();
	}
	
	public void addIngrediente(Ingrediente ing) {
		this.ingredientes.add(ing);
	}
	
	public void quitarIngrediente(Ingrediente ing) {
		int posicion = this.ingredientes.indexOf(ing);
		
		if (posicion >= 0) {
			this.ingredientes.remove(posicion);
		}
	}
	
}
