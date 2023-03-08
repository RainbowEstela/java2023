package Ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		System.out.println(FechaUtils.diaCumple(LocalDateTime.of(2023, Month.DECEMBER, 9, 19, 30, 20),2026) );
		System.out.println(Duration.between(LocalTime.of(12, 12, 12), LocalTime.of(0, 0, 1)));
		FechaUtils.cuentaAtras(LocalDateTime.of(2023, Month.DECEMBER, 9, 19, 30, 20), "felicidad");

	}

}
