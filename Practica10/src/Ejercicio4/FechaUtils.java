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
	
	public static String diaCumple(LocalDateTime fechaCumple, int year) {
		return fechaCumple.withYear(year).getDayOfWeek().toString();
	}
	
	
}
