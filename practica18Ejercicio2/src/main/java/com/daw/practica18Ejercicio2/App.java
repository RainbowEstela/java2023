package com.daw.practica18Ejercicio2;

import com.daw.clases.FileUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(FileUtils.calcularRecursivamente("C:\\Users\\user\\Desktop\\backup dst"));
    	
    	FileUtils.buscarCoincidencias(".txt", "C:\\Users\\user\\Desktop\\prueba");
    	//FileUtils.eliminarCoincidencias(".txt", "C:\\Users\\user\\Desktop\\prueba"); //usar con precaucion
        FileUtils.ficherosRuta("C:\\Users\\user\\Desktop\\cosas mias\\ropita shein").forEach(System.out::println);;
    }
}
