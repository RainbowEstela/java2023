package Ejercicio3;

public class TestPuntuaciones {

	public static void main(String[] args) {
		Stim st = new Stim();
		
		Juego j1 = new Juego("pineapple on pizza", "pc");
		Juego j2 = new Juego("Terraria", "pc");
		Juego j3 = new Juego("Minecraft java edition", "Xbox");
		Juego j4 = new Juego("Don't starve together", "pc");
		Juego j5 = new Juego("Warframe", "play4");
		Juego j6 = new Juego("Team fortress 2", "stim");
		Juego j7 = new Juego("Counter Strike", "stim");
		Juego j8 = new Juego("Dungeon defenders 2", "pc");
		Juego j9 = new Juego("Stardew valley", "muchas");
		Juego j10 = new Juego("Oxigen not included", "pc");
		
		Usuario u1 = new Usuario("Estela", "uno@gmail.com", "RainbowEstela");
		u1.addPuntuacion(j1.getId(), true, 10000);
		u1.addPuntuacion(j2.getId(), false, 500);
		u1.addPuntuacion(j4.getId(), true, 9999);
		u1.addPuntuacion(j8.getId(), false, 200);
		u1.addPuntuacion(j9.getId(), true, 750);
		
		Usuario u2 = new Usuario("Monica", "dos@gmail.com", "Klonoe");
		u2.addPuntuacion(j3.getId(), false, 450);
		u2.addPuntuacion(j10.getId(), true, 3500);
		u2.addPuntuacion(j7.getId(), false, 500);
		u2.addPuntuacion(j9.getId(), true, 6000);
		u2.addPuntuacion(j6.getId(), false, 400);
		
		Usuario u3 = new Usuario("Kiana", "tres@gmail.com", "SuperLGamer");
		u3.addPuntuacion(j5.getId(), true, 1000000);
		u3.addPuntuacion(j1.getId(), true, 999999);
		u3.addPuntuacion(j7.getId(), true, 70000);
		u3.addPuntuacion(j6.getId(), true, 8925215);
		u3.addPuntuacion(j10.getId(), true, 9999999);
		
		Usuario u4 = new Usuario("Elysia", "cuatro@gmail.com", "Elimei");
		u4.addPuntuacion(j9.getId(), false, 10);
		u4.addPuntuacion(j7.getId(), false, 5);
		u4.addPuntuacion(j1.getId(), false, 6);
		u4.addPuntuacion(j5.getId(), false, 20);
		u4.addPuntuacion(j4.getId(), false, 30);
		
		Usuario u5 = new Usuario("Helix", "cinco@gmail.com", "Vill-v");
		u5.addPuntuacion(j3.getId(), true, 70000000);
		u5.addPuntuacion(j6.getId(), true, 900000);
		u5.addPuntuacion(j7.getId(), true, 6000000);
		u5.addPuntuacion(j1.getId(), true, 989898989);
		u5.addPuntuacion(j5.getId(), true, 987654321);		
		
		Usuario u6 = new Usuario("Mobius", "seis@gmail.com", "Ouroboros");
		u6.addPuntuacion(j1.getId(), false, 60);
		u6.addPuntuacion(j2.getId(), false, 60);
		u6.addPuntuacion(j3.getId(), false, 60);
		u6.addPuntuacion(j4.getId(), false, 60);
		u6.addPuntuacion(j5.getId(), false, 60);
		
		Usuario u7 = new Usuario("Felis", "siete@gmail.com", "Pardo");
		u7.addPuntuacion(j1.getId(), false, 123);
		u7.addPuntuacion(j2.getId(), false, 321);
		u7.addPuntuacion(j3.getId(), false, 213);
		u7.addPuntuacion(j4.getId(), false, 312);
		u7.addPuntuacion(j5.getId(), false, 321);
		
		Usuario u8 = new Usuario("Yae", "ocho@gmail.com", "PinkFox");
		u8.addPuntuacion(j6.getId(), true, 12345);
		u8.addPuntuacion(j7.getId(), true, 789123);
		u8.addPuntuacion(j8.getId(), true, 654987211);
		u8.addPuntuacion(j9.getId(), true, 89126743);
		u8.addPuntuacion(j10.getId(), true, 7834141);
		
		Usuario u9 = new Usuario("Kallen", "nueve@gmail.com", "FoxLover");
		u9.addPuntuacion(j6.getId(), true, 56321);
		u9.addPuntuacion(j7.getId(), true, 78916462);
		u9.addPuntuacion(j8.getId(), true, 65843211);
		u9.addPuntuacion(j9.getId(), true, 890003);
		u9.addPuntuacion(j10.getId(), true, 7777741);
		
		Usuario u10 = new Usuario("Mei", "diez@gmail.com", "ThunderStorm");
		u10.addPuntuacion(j6.getId(), false, 1);
		u10.addPuntuacion(j7.getId(), false, 1);
		u10.addPuntuacion(j8.getId(), false, 1);
		u10.addPuntuacion(j9.getId(), false, 1);
		u10.addPuntuacion(j10.getId(), false, 1);
		
		st.addJuego(j1);
		st.addJuego(j2);
		st.addJuego(j3);
		st.addJuego(j4);
		st.addJuego(j5);
		st.addJuego(j6);
		st.addJuego(j7);
		st.addJuego(j8);
		st.addJuego(j9);
		st.addJuego(j10);
		
		st.addJugador(u1);
		st.addJugador(u2);
		st.addJugador(u3);
		st.addJugador(u4);
		st.addJugador(u5);
		st.addJugador(u6);
		st.addJugador(u7);
		st.addJugador(u8);
		st.addJugador(u9);
		st.addJugador(u10);
		
		//st.pintarJugador();
		//st.pintarJuegos();
		
		System.out.println(st.obtenerPuntuaciones(1));
		System.out.println("");
		// id juego, id usuario
		st.buscarPuntuacion(8, 1);
		System.out.println("");
		
		st.pintarRankingJuegos();
		
		
	}

}
