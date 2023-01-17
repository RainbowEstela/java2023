/**
 * 
 */
package Ejecicio1;

/**
 * @author Estela
 *
 */
public class Temperatura {

	/**
	 * metodo que pasa una temperatura en celcius a farenheit
	 * @param celcius
	 * @return
	 */
	public static double celciusToFarenheit(double celcius) {
		
		return (1.8 * celcius) + 32; 
	}
	
	/**
	 * metodo que pasa una temperatura de farenheit a celcius
	 * @param farenheit
	 * @return
	 */
	public static double farenheitToCelcius(double farenheit) {
		
		return (farenheit - 32) / 18;
	}
}
