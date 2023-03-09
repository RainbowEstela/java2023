package Ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		System.out.println(FechaUtils.diaCumple(LocalDate.of(2023, Month.DECEMBER, 9),2026) );
		
		FechaUtils.cuentaAtras(LocalDateTime.of(2023, Month.DECEMBER, 9, 19, 30, 20), "felicidad");
		
		System.out.println(FechaUtils.numYears(LocalDate.of(1998, 6, 22)));
		
		System.out.println(FechaUtils.zodiaco(LocalDate.of(1998, 8, 12)));
	}

}
