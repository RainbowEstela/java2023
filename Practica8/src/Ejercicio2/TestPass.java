package Ejercicio2;

public class TestPass {

	public static void main(String[] args) {
		var pass = new Password();
		var pass2 = new Password(15);
		System.out.println("Primera contraseña: " + pass.getPassword() + " es contraseña fuerte: " + pass.esFuerte());
		System.out.println("Segunda contraseña: " + pass2.getPassword() + " es contraseña fuerte: " + pass2.esFuerte());

	}

}
