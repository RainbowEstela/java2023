/**
 * 
 */
package Ejercicio1;

import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class Persona {
	
	enum Genero {H,M,O};
	
	//miembros
	private String nombre;
	private String dni;
	private Genero genero;
	private double peso;
	private double altura;
	private int edad;
	
	//constructor por defecto
	/**
	 * @param nombre
	 * @param dni
	 * @param genero
	 * @param peso
	 * @param altura
	 */
	public Persona() {
		super();
		this.nombre = "";
		this.dni = "";
		this.genero = Genero.H;
		this.peso = 0;
		this.altura = 0;
		this.edad = 0;
 	}

	//constructor sin peso ni altura
	/**
	 * @param nombre
	 * @param dni
	 * @param genero
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, String dni, Genero genero, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.genero = genero;
		this.peso = 0;
		this.altura = 0;
		this.edad = edad;
	}

	//constructor con todo
	/**
	 * @param nombre
	 * @param dni
	 * @param genero
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, String dni, Genero genero, double peso, double altura, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	//constructor copia
	/**
	 * @param nombre
	 * @param dni
	 * @param genero
	 * @param peso
	 * @param altura
	 */
	public Persona(Persona per) {
		super();
		this.nombre = per.nombre;
		this.dni = per.dni;
		this.genero = per.genero;
		this.peso = per.peso;
		this.altura = per.altura;
		this.edad = per.edad;
	}

	//metodo to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", edad=");
		builder.append(edad);
		builder.append("]");
		return builder.toString();
	}

	//nombre get set
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

	//dni get set
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	//genero get set
	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	//peso get set
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	//altura get set
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	//hash
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	/**
	 * metodo que retorna 1 si el imc es menor de 20
	 * retorna 0 si esta entre 20 y 25
	 * retorna -1 si es superior a 25
	 * @return
	 */
	public int calcularIMC() {
		double imc = this.peso/(this.altura * this.altura);
		
		if (imc < 20) { //debajo del peso ideal
			return 1;
		} else if ( (imc >= 20) || (imc <= 25)) { //peso ideal
			return 0;
		} else {//sobrepeso
			return -1;
		}
		
	}
	
	/**
	 * metodo que devuelve si la persona es mayor de edad
	 * @return
	 */
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
