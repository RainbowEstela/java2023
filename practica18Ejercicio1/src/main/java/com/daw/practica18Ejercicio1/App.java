package com.daw.practica18Ejercicio1;

import clases.Gamer;
import clases.Nivel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Gamer j = new Gamer("", "", "", Nivel.BUENO);
        System.out.println( j.getNivel() );
    }
}
