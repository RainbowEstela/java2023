package Ejercicio2;

public class TestPass {

	public static void main(String[] args) {
		var pass = new Password();
		var pass2 = new Password(15);
		System.out.println("Primera contrase�a: " + pass.getPassword() + " es contrase�a fuerte: " + pass.esFuerte());
		System.out.println("Segunda contrase�a: " + pass2.getPassword() + " es contrase�a fuerte: " + pass2.esFuerte());

	}

}
