/**
 * 
 */
package PracticaSetArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

import PracticaSetArrayList.Arma.Tipo;

/**
 * @author usuario1daw
 *
 */
public class PersonajeAL {
	private String nombre;
	private int salud;
	private int mana;
	private ArrayList<TipoArmadura> componentesArmadura;
	private Arma armaDere;
	private Arma armaIzq;
	
	/**
	 * @param nombre
	 * @param salud
	 * @param mana
	 */
	public PersonajeAL(String nombre, int salud, int mana) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.componentesArmadura = new ArrayList<>();
		this.armaDere =  new Arma("Espada corta rota", Tipo.ESPADA, false, 5, 0);
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
	public ArrayList<TipoArmadura> getComponentesArmadura() {
		return componentesArmadura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonajeAL [nombre=");
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
		return Objects.hash(mana);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonajeAL other = (PersonajeAL) obj;
		return mana == other.mana;
	}
	
	/* METODOS PROPIOS */
	
	public void addArmadura(TipoArmadura armadura) {
		int indice = componentesArmadura.indexOf(armadura);
		
		if (indice != -1) {
			componentesArmadura.remove(armadura);
		}
		
		componentesArmadura.add(armadura);
	}
	
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
	 * metodo que lista la armadura tal cual está
	 */
	public void listarCreacion() {
		listarArmadura(componentesArmadura);
	}
	
	/**
	 * metodo que lista la armadura por daño fisico
	 */
	public void listarFisico() {
		Collections.sort(componentesArmadura, new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				Integer d1 = o1.getDefensaFisica();
				Integer d2 = o2.getDefensaFisica();
				
				return d1.compareTo(d2);
			}
		});
		
		listarArmadura(componentesArmadura);
	}
	
	/**
	 * método que lista la armadura por daño magico
	 */
	public void listarMagico() {
		Collections.sort(componentesArmadura, new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				Integer d1 = o1.getDefensaMagica();
				Integer d2 = o2.getDefensaMagica();
				
				return d1.compareTo(d2);
			}
		});
		
		listarArmadura(componentesArmadura);
	}
	
	/**
	 * lista la armadura por la zona que cubre
	 */
	public void listarZona() {
		Collections.sort(componentesArmadura, new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {
				Integer posicion1 = o1.getMiZona().ordinal();
				Integer posicion2 = o2.getMiZona().ordinal();
				
				return posicion1.compareTo(posicion2);
			}
		});
		
		listarArmadura(componentesArmadura);
	}
	
	public void listarNombre() {
		Collections.sort(componentesArmadura, new Comparator<TipoArmadura>() {

			@Override
			public int compare(TipoArmadura o1, TipoArmadura o2) {

				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		
		listarArmadura(componentesArmadura);
	}
}
