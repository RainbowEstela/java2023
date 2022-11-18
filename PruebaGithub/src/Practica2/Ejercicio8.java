package Practica2;

public class Ejercicio8 {
	static int n1=50;
	public static void main(String[] args) {
		int n2=30, suma=0, n3 = 1; //hay que inicializar con un valor n3 si no le damos un valor y lo usamos tal cual el programa no sabe que valor tiene n3.
		suma=n1+n2;
		System.out.println("LA SUMA ES: " + suma);
		suma=suma+n3;
		System.out.println(suma);

	}

}
