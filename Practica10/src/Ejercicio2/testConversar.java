package Ejercicio2;

import java.time.LocalDate;

public class testConversar {

	public static void main(String[] args) {
		
		ConservarFecha cf = new ConservarFecha();
		String americano = cf.normalToAmericano("22/06/1998");
		String normal = cf.americanoToNormal("08/12/1997");
		
		
		
		System.out.println("fecha en formato americano: " + americano);
		System.out.println("fecha en formato normal: " + normal);
		
	}

}
