/**
 * 
 */
package Ejercicio3;

/**
 * @author usuario1daw
 *
 */
public class Pajaro {
 /*
  * compila porque el orden de definicion de metodos y atributos no importa dentro de la clase
  */
	public void setedad(int e) { edad=e; }
	public void printedad() { System.out.println(edad); }
	public void setcolor(char c) { color=c; }
	private int edad;
	private char color;
	
}
