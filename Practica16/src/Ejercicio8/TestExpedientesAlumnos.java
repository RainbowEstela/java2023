package Ejercicio8;

import java.time.LocalDate;

import Ejercicio8.NotasCurso.EtapaAcademica;

public class TestExpedientesAlumnos {

	public static void main(String[] args) {

		Estudiante es1 = new Estudiante("1111", "alba", "majo", LocalDate.of(1998, 4, 12), "no sé", "vera", "email@email.es", "01234");
		Estudiante es2 = new Estudiante("2222", "tetera", "de cafe", LocalDate.of(1670, 1, 28), "alguno", "almeria", "java@java.es", "7891");
		
		NotasCurso ntas1 = new NotasCurso(EtapaAcademica.FPSUPERIOR, "DAW", 1, 2023);
		ntas1.addNota("programacion", 10.0);
		ntas1.addNota("fol", 9.0);
		
		NotasCurso ntas2 = new NotasCurso(EtapaAcademica.FPSUPERIOR, "DAW", 2, 2024);
		ntas2.addNota("Diseño", 5.5);
		ntas2.addNota("libre configuracion", 3.0);
		
		NotasCurso ntas3 = new NotasCurso(EtapaAcademica.FPSUPERIOR, "DAW", 1, 2023);
		ntas3.addNota("programacion", 7.3);
		ntas3.addNota("fol", 6.5);
		
		NotasCurso ntas4 = new NotasCurso(EtapaAcademica.FPSUPERIOR, "DAW", 2, 2024);
		ntas4.addNota("Diseño", 4.7);
		ntas4.addNota("libre configuracion", 8.5);
		
		//System.out.println(ntas1.buscarNota("programacion"));
		//System.out.println(ntas1.pintarNotas());
		//System.out.println(ntas1);
		
		
		
		Expediente exp1 = new Expediente(es1, true);
		exp1.addNotas(ntas1);
		exp1.addNotas(ntas2);
		
		System.out.println(exp1.mostrarNotas(2, EtapaAcademica.FPSUPERIOR,"DAW", 2024));
		
		
		Expediente exp2 = new Expediente(es2, true);
		exp2.addNotas(ntas3);
		exp2.addNotas(ntas4);
		
		CentroEducativo cen = new CentroEducativo("IES JAROSO", "c/ narajo", "cuevas", "1234567873", "jaroso@email.es");
		cen.addExpediente(exp1);
		cen.addExpediente(exp2);
		
		System.out.println(cen.buscarNotas("1111"));
		
	}

}
