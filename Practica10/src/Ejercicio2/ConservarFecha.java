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
		LocalDate fecha = LocalDate.parse(st);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM dd yyyy");
		String americano = fecha.format(formato);
		return americano;
	}
	
	/*
	public String americanoToNormal(int year, int mes, int dia) {
		
	}
	*/
}
