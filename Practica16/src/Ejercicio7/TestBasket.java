package Ejercicio7;

import Ejercicio7.JugadorBasket.Posicion;

public class TestBasket {

	public static void main(String[] args) {
		EquipoBasket eq = new EquipoBasket();
		EquipoBasket eq2 = new EquipoBasket();
		EquipoBasket eq3 = new EquipoBasket();
		
		Liga liga = new Liga();
		
		//jugadores equipo 1
		eq.addJugador(1, new JugadorBasket("Estela", Posicion.BASE));
		eq.addJugador(2, new JugadorBasket("monica", Posicion.ALERO));
		eq.addJugador(2, new JugadorBasket("Kiana", Posicion.ESCOLTA));//comprobacion de repetidos sustituyen el anterior
		eq.addJugador(3, new JugadorBasket("Mei", Posicion.PIVOT));
		
		//jugadores equipo 2
		eq2.addJugador(1, new JugadorBasket("Yoto", Posicion.BASE));
		eq2.addJugador(2, new JugadorBasket("Kurumi", Posicion.ALERO));
		
		//jugadores equipo3
		eq3.addJugador(1, new JugadorBasket("Rita", Posicion.BASE));
		eq3.addJugador(2, new JugadorBasket("Durandal", Posicion.ALERO));
		
		
		System.out.println(eq.mostrarEquipo());
		System.out.println(eq.buscarJugador(1));
		System.out.println(eq.buscarJugador(new JugadorBasket("Kiana", null)));
		System.out.println("-------------------------");
		System.out.println("");
		//test liga
		liga.addEquipo("SuperStars", eq);
		liga.addEquipo("Naraka", eq2);
		liga.addEquipo("Honkai", eq3);
		
		System.out.println(liga.mostrarEquipo());
		
		System.out.println("");
		
		System.out.println(liga.buscarEquipo("Naraka").mostrarEquipo());
	}

}
