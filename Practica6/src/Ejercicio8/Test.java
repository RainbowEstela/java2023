package Ejercicio8;

public class Test {

	public static void main(String[] args) {
		Incidencia inc1 = new Incidencia(4563, "cristal del portal roto");
		Incidencia inc2 = new Incidencia(3954, "ascensor estropeado");
		Incidencia inc3 = new Incidencia(9342, "las cañerias del quito hacen ruido");
		Incidencia inc4 = new Incidencia(7343, "losas partidas en el primero");
		Incidencia inc5 = new Incidencia(8325, "telefonillo estropeado");
		
		System.out.println(inc1.toString());
		System.out.println(inc2.toString());
		System.out.println(inc3.toString());
		System.out.println(inc4.toString());
		System.out.println(inc5.toString());
		System.out.println("incidencias pendientes = " + Incidencia.getPendientes());
		
		inc1.resuelve("se puso un cristal nuevo");
		inc3.resuelve("cañeria cambiada");
		
		System.out.println(inc1.toString());
		System.out.println(inc2.toString());
		System.out.println(inc3.toString());
		System.out.println(inc4.toString());
		System.out.println(inc5.toString());
		System.out.println("incidencias pendientes = " + Incidencia.getPendientes());

	}

}
