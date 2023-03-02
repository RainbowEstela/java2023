/**
 * 
 */
package Ejercicio2;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author user
 *
 */
public class ConservarFecha {
	
	
	public String normalToAmericano(String st) {
		DateTimeFormatter formatoNormal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(st,formatoNormal);
		
		DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return fecha.format(formatoAmericano);
	}
	
	
	public String americanoToNormal(String st) {
		DateTimeFormatter formatoAmericano = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate fecha = LocalDate.parse(st,formatoAmericano);
		
		DateTimeFormatter formatoNormal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fecha.format(formatoNormal);
	}
	
}
