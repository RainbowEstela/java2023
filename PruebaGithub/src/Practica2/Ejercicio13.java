package Practica2;

public class Ejercicio13 {

	public static void main(String[] args) {
		int t = 4567;
		int horas, minutos, segundos;
		
		//calcular las horas
		horas = (int) Math.floor( t / 3600);
		minutos = (int) Math.floor( (t % 3600) / 60);
		segundos = (int) Math.floor((t % 3600) % 60);
		
		
		//pintar
		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
