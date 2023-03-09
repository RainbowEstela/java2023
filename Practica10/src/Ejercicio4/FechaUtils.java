/**
 * 
 */
package Ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Locale;

/**
 * @author user
 *
 */
public class FechaUtils {
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime fechaAhora = LocalDateTime.now();
		Duration horasHasta = Duration.between(LocalTime.of(fechaAhora.getHour(), fechaAhora.getMinute(), fechaAhora.getSecond()), LocalTime.of(fechaHasta.getHour(), fechaHasta.getMinute(), fechaHasta.getSecond()));
		Period diasHasta = Period.between(LocalDate.of(fechaAhora.getDayOfYear(), fechaAhora.getMonthValue(), fechaAhora.getDayOfMonth()), LocalDate.of(fechaHasta.getDayOfYear(), fechaHasta.getMonthValue(), fechaHasta.getDayOfMonth()));
		System.out.println(" quedan " + diasHasta.getYears() + " años, " + diasHasta.getMonths() + " meses, " + diasHasta.getDays() + " dias, " + horasHasta.toHoursPart() + " horas, "+ horasHasta.toMinutesPart() + " minutos," + horasHasta.toSecondsPart() + " hasta " + titulo);
		
	}
	
	public static String diaCumple(LocalDate fechaCumple, int year) {
		return fechaCumple.withYear(year).getDayOfWeek().toString();
	}
	
	public static int numYears(LocalDate fechaCumple) {
		return Period.between(fechaCumple, LocalDate.now()).getYears();
	}
	
	public static String zodiaco(LocalDate fecha) {
			
		// Aries
		if (( fecha.getDayOfMonth() >= 21 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 3) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 19 && fecha.getMonthValue() == 4)) {
			return "Aries";
		}
		
		//Tauro
		if (( fecha.getDayOfMonth() >= 20 && fecha.getDayOfMonth() <= 30 && fecha.getMonthValue() == 4) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 20 && fecha.getMonthValue() == 5)) {
			return "Tauro";
		}
		
		//geminis
		if (( fecha.getDayOfMonth() >= 21 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 5) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 20 && fecha.getMonthValue() == 6)) {
			return "Geminis";
		}
		
		//cancer
		if (( fecha.getDayOfMonth() >= 21 && fecha.getDayOfMonth() <= 30 && fecha.getMonthValue() == 6) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 22 && fecha.getMonthValue() == 7)) {
			return "Cancer";
		}
		
		//leo
		if (( fecha.getDayOfMonth() >= 23 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 7) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 22 && fecha.getMonthValue() == 8)) {
			return "Leo";
		}
		
		//virgo
		if (( fecha.getDayOfMonth() >= 23 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 8) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 22 && fecha.getMonthValue() == 9)) {
			return "Virgo";
		}
		
		//libra
		if (( fecha.getDayOfMonth() >= 23 && fecha.getDayOfMonth() <= 30 && fecha.getMonthValue() == 9) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 22 && fecha.getMonthValue() == 10)) {
			return "Libra";
		}
		
		//escorpio
		if (( fecha.getDayOfMonth() >= 23 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 10) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 21 && fecha.getMonthValue() == 11)) {
			return "Escorpio";
		}
		
		//Sagitario
		if (( fecha.getDayOfMonth() >= 22 && fecha.getDayOfMonth() <= 30 && fecha.getMonthValue() == 11) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 21 && fecha.getMonthValue() == 12)) {
			return "Sagitario";
		}
		
		//Capricornio
		if (( fecha.getDayOfMonth() >= 22 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 12) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 19 && fecha.getMonthValue() == 1)) {
			return "Capricornio";
		}
		
		//acuario
		if (( fecha.getDayOfMonth() >= 20 && fecha.getDayOfMonth() <= 31 && fecha.getMonthValue() == 1) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 18 && fecha.getMonthValue() == 2)) {
			return "Acuario";
		}
		
		//piscis
		if (( fecha.getDayOfMonth() >= 19 && fecha.getDayOfMonth() <= 29 && fecha.getMonthValue() == 2) || ( fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <= 20 && fecha.getMonthValue() == 3)) {
			return "Piscis";
		}
		
		return "";
	}
}
