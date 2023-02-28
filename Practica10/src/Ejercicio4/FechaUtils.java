/**
 * 
 */
package Ejercicio4;

import java.time.LocalDateTime;

/**
 * @author user
 *
 */
public class FechaUtils {
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime restante = fechaHasta.minus(LocalDateTime.now());
	}
}
