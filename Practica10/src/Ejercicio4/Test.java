package Ejercicio4;

import java.time.LocalDateTime;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		System.out.println(FechaUtils.diaCumple(LocalDateTime.of(2023, Month.DECEMBER, 9, 19, 30, 20),2026) );

	}

}
