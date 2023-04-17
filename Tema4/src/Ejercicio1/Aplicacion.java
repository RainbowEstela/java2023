package Ejercicio1;

public class Aplicacion {

	public static void main(String[] args) {
		Empleado per1 = new Empleado();
		Empleado per2 = new Empleado("Ramón", "Fernandez", 47, "ejemplo@gmail.com", 2500, 19, 5, "Marketing");
		
		System.out.println(per1.getNombre() + " " + per1.getApellidos() + " cobra " + per1.mostrarSalarioActual() + " euros");
		System.out.println(per2.getNombre() + " " + per2.getApellidos() + " cobra " + per2.mostrarSalarioActual() + " euros");
		
		int u = (int) 'í';
		System.out.println(u);
	}

}
