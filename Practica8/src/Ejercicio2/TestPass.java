package Ejercicio2;

public class TestPass {

	public static void main(String[] args) {
		var pass = new Password();
		var pass2 = new Password(15);
		System.out.println("Primera contraseņa: " + pass.getPassword() + " es contraseņa fuerte: " + pass.esFuerte());
		System.out.println("Segunda contraseņa: " + pass2.getPassword() + " es contraseņa fuerte: " + pass2.esFuerte());

	}

}
