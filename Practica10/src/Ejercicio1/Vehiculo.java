package Ejercicio1;

public abstract class Vehiculo {
	private int peso;
	public final void setPeso(int p) {
		peso = p;
	}
	
	public abstract int getVelocidadActual();
	
	//¿podrá tener descendencia esta clase?
	/*
	 * sí, puede tener descendencia, lo que no se puede
	 * es hacer objetos de esta clase
	 */
	
	//¿se pueden sobreescribir todos sus métodos?
	/*
	 * no, solo se podrá sobreescribir el método abstract en este caso, ya que el otro método es final.
	 */
}
