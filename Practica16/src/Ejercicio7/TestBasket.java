package Ejercicio7;

import Ejercicio7.JugadorBasket.Posicion;

public class TestBasket {

	public static void main(String[] args) {
		EquipoBasket eq = new EquipoBasket();
		
		eq.addJugador(1, new JugadorBasket("Estela", Posicion.BASE));
		eq.addJugador(2, new JugadorBasket("monica", Posicion.ALERO));
		eq.addJugador(2, new JugadorBasket("Kiana", Posicion.ESCOLTA));//comprobacion de repetidos
		eq.addJugador(3, new JugadorBasket("Mei", Posicion.PIVOT));
		
		System.out.println(eq.mostrarEquipo());
		System.out.println(eq.buscarJugador(1));
		System.out.println(eq.buscarJugador(new JugadorBasket("Kiana", Posicion.ALAPIVOT)));
		

	}

}
