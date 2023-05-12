package com.daw.practica18Ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.daw.clases.DAOFinca;
import com.daw.clases.DAOLectura;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DAOFinca fincas = new DAOFinca();
    	DAOLectura lecturas = new DAOLectura();
    	DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    	LocalDate l = LocalDate.parse("2023/06/01",f);
    	
    	System.out.println(l);
    	
    	System.out.println("-------------------");
    	System.out.println("Fincas por superficie");
    	System.out.println("-------------------");
    	
    	fincas.getFincasPorSuperficie().forEach(System.out::println);
    	
    	System.out.println("-------------------");
    	System.out.println("Fincas mas grandes");
    	System.out.println("-------------------");
    	
    	fincas.getMasGrandes().forEach(System.out::println);
    	
     	System.out.println("-------------------");
    	System.out.println("Fincas por ciuedad");
    	System.out.println("-------------------");
    	
    	fincas.getFincasPorCiudad().forEach((k,v) -> {
    		System.out.println(k + ":");
    		v.forEach(System.out::println);				
    	});
    	
     	System.out.println("-------------------");
    	System.out.println("lecturas por finca");
    	System.out.println("-------------------");
    	
    	/* PREGUNTAR AL PROFESOR */
    	
     	System.out.println("-------------------");
    	System.out.println("temperatura maxima de una finca");
    	System.out.println("-------------------");
    	
    	System.out.println(lecturas.getTempMaximaFinca(9));
    	
    	System.out.println("-------------------");
    	System.out.println("temperatura minima de una finca");
    	System.out.println("-------------------");
    	
    	System.out.println(lecturas.getTempMinimaFinca(9));
    	
    	System.out.println("-------------------");
    	System.out.println("humedad por finca");
    	System.out.println("-------------------");
    	
    	lecturas.getHumedadPorFinca(9).forEach(System.out::println);
    	
    	System.out.println("-------------------");
    	System.out.println("temperatura por finca");
    	System.out.println("-------------------");
    	
    	lecturas.getTemperaturaPorFinca(9).forEach(System.out::println);
    	
    	System.out.println("-------------------");
    	System.out.println("temperatura por finca y dia");
    	System.out.println("-------------------");
    	
    	lecturas.getTempDiaPorFinca(9, LocalDate.parse("2023-05-21")).forEach(System.out::println);
    }
}
