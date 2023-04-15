/**
 * 
 */
package Ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author user
 *
 */
public class CentroEducativo {
	private TreeSet<Expediente> expedientes;
	private String nombreCentro;
	private String direccion;
	private String localidad;
	private String telefono;//string por si el telefono empieza por 0
	private String email;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param telefono
	 * @param email
	 */
	public CentroEducativo(String nombre, String direccion, String localidad, String telefono, String email) {
		super();
		this.nombreCentro = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.email = email;
		this.expedientes = new TreeSet<>();
	}
	
	/**
	 * añade un expediente al centro si no existe
	 * @param e
	 */
	public void addExpediente(Expediente e) {
		this.expedientes.add(e);
	}
	
	/**
	 * busca y retorna un hashset de notas curso de estudiante buscado o null si no encuentra el estudiante
	 * @param dni
	 * @return
	 */
	public HashSet<NotasCurso> buscarNotas(String dni) {
		if (this.expedientes.contains(new Expediente(new Estudiante(dni, dni, dni, null, dni, dni, dni, dni), false))) {
			ArrayList<Expediente> exp = new ArrayList<>(this.expedientes);
			
			Collections.sort(exp);
			
			int index = Collections.binarySearch(exp, new Expediente(new Estudiante(dni, dni, dni, null, dni, dni, dni, dni), false));
			
			return exp.get(index).getNotas();
		}
		
		return null;
	}
	
	
}
