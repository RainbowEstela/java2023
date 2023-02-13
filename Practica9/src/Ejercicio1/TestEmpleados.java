package Ejercicio1;

import java.util.ArrayList;

public class TestEmpleados {

	public static void main(String[] args) {
		ArrayList<Empleado> misEmpleados = new ArrayList<>();
		misEmpleados.add(new Repartidor("Paco", 24, 300, true, "zona 3"));
		misEmpleados.add(new MozoAlmacen("Juan", 31, 500, false, 2));
		misEmpleados.add(new Comercial("Maria", 40, 600, 300));
		
		for (Empleado i : misEmpleados) {
			System.out.println(i.toString());
		}

	}

}
