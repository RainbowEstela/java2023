/**
 * 
 */
package Ejercicio4;

import java.time.LocalDateTime;
import java.util.Locale;

/**
 * @author user
 *
 */
public class FechaUtils {
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime fechaAhora = LocalDateTime.now();
		
		
	}
	
	public static String diaCumple(LocalDateTime fechaCumple, int year) {
		return fechaCumple.withYear(year).getDayOfWeek().toString();
	}
	
	
}
