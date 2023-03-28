/**
 * 
 */
package PracticaSetArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

import PracticaSetArrayList.Arma.Tipo;

/**
 * @author usuario1daw
 *
 */
public class PersonajeHS {

	private String nombre;
	private int salud;
	private int mana;
	private HashSet<TipoArmadura> componentesArmadura;
	private Arma armaDere;
	private Arma armaIzq;
	/**
	 * @param nombre
	 * @param salud
	 * @param mana
	 */
	public PersonajeHS(String nombre, int salud, int mana) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.componentesArmadura = new HashSet<>();
		this.armaDere = new Arma("Espada corta rota", Tipo.ESPADA, false, 5, 0);
		this.armaIzq = new Arma("Daga de hierro desgastada", Tipo.DAGA, false, 3, 0);
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
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	/**
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}
	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
	/**
	 * @return the armaDere
	 */
	public Arma getArmaDere() {
		return armaDere;
	}
	/**
	 * @param armaDere the armaDere to set
	 */
	public void setArmaDere(Arma armaDere) {
		this.armaDere = armaDere;
	}
	/**
	 * @return the armaIzq
	 */
	public Arma getArmaIzq() {
		return armaIzq;
	}
	/**
	 * @param armaIzq the armaIzq to set
	 */
	public void setArmaIzq(Arma armaIzq) {
		this.armaIzq = armaIzq;
	}
	/**
	 * @return the componentesArmadura
	 */
	public HashSet<TipoArmadura> getComponentesArmadura() {
		return componentesArmadura;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonajeHS [nombre=");
		builder.append(nombre);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", mana=");
		builder.append(mana);
		builder.append(", componentesArmadura=");
		builder.append(componentesArmadura);
		builder.append(", armaDere=");
		builder.append(armaDere);
		builder.append(", armaIzq=");
		builder.append(armaIzq);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonajeHS other = (PersonajeHS) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	/* METODOS PROPIOS */
	
	/**
	 * método que lista las armaduras del personaje
	 * @param armOrd
	 */
	private void listarArmadura(ArrayList<TipoArmadura> armOrd) {
		for (TipoArmadura a : armOrd) {
			System.out.println(a);
		}
	}
	
	/**
	 * método que añade o remplaza una pieza de armadura según su zona 
	 * @param armadura
	 */
	public void addArmadura(TipoArmadura armadura) {
		if (componentesArmadura.contains(armadura)) {
			componentesArmadura.remove(armadura);
		}
		
		componentesArmadura.add(armadura);
	}
	
	/**
	 * lista las armaduras según la clase usada para guardar
	 */
	public void listarArmaduraCreacion() {
		for (TipoArmadura t : componentesArmadura) {
			System.out.println(t);
		}
	}
	
	/**
	 * lista por daño fisico las piezas de armadura
	 */
	public void listarDanioFisico() {
		ArrayList<TipoArmadura> armOrd = new ArrayList<>(componentesArmadura);
		
		Collections.sort(armOrd,new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				Integer d1 = o1.getDefensaFisica();
				Integer d2 = o2.getDefensaFisica();
				
				return d1.compareTo(d2);
			}
		});
		
		listarArmadura(armOrd);
	}
	
	/**
	 * lista por daño magico las piezas de armadura
	 */
	public void listarDanioMagico() {
		ArrayList<TipoArmadura> armOrd = new ArrayList<>(componentesArmadura);
		
		Collections.sort(armOrd,new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				Integer d1 = o1.getDefensaMagica();
				Integer d2 = o2.getDefensaMagica();
				
				return d1.compareTo(d2);
			}
		});
		
		listarArmadura(armOrd);
	}
	
	/**
	 * lista según la zona de la pieza
	 */
	public void listarZona() {
		ArrayList<TipoArmadura> armOrd = new ArrayList<>(componentesArmadura);
		
		Collections.sort(armOrd, new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				
				Integer posicion1 = o1.getMiZona().ordinal();
				Integer posicion2 = o2.getMiZona().ordinal();
				
				return posicion1.compareTo(posicion2);
			}
		});
		
		listarArmadura(armOrd);
		
	}
	
	/**
	 * lista por nombre las piezas
	 */
	public void listarNombre() {
		ArrayList<TipoArmadura> armOrd = new ArrayList<>(componentesArmadura);
		
		Collections.sort(armOrd, new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		
		listarArmadura(armOrd);
	}
 	
}
