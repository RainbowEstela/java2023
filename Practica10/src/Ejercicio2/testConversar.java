package Ejercicio2;

import java.time.LocalDate;

public class testConversar {

	public static void main(String[] args) {
		
		ConservarFecha cf = new ConservarFecha();
		String americano = cf.normalToAmericano("1998-06-22");
		/*
		String normal = cf.americanoToNormal(1998,6,22);
		
		LocalDate fecha = LocalDate.parse("1998-06-22");
		System.out.println(fecha.getYear());
		*/
		
		
		
		System.out.println("fecha en formato americano: " + americano);
		/*
		System.out.println("fecha en formato normal: " + normal);
		*/
	}

}
