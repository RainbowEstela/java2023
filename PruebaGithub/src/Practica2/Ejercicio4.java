package Practica2;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		boolean condicion;
		
		//a
		condicion = (3 <= 7) && (7 <= 7); //verdadero, 3 es menor que 7 y 7 es igual que 7
		
		//b
		condicion = !((-8 > 1) && (3 <= 4)); //verdadero, ya que -8 no es mayor que 1 y como se niega el resultado es verdadero
		
		//c
		condicion = "Hola" == "Hola "; //falso, ya que la segunda cadena tiene un espacio
		
		//d
		condicion = ((2 <= 5) && (3 >= 6)) || (2 > -1); //verdadero ya que 2 es mayor que -1 y el resto nos da igual porque estan en un o
		
		//e
		condicion = ((2 <= 5) || (3 >= 6)) && (2 > -1); //verdadero ya que 2 es menor que 5 y como esta en un o esa parte es verdadera la otra parte del y tambien es verdadera por tanto verdadero
		
	}

}
