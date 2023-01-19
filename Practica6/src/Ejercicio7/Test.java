package Ejercicio7;

public class Test {

	public static void main(String[] args) {
		SteamJuego warframe = new SteamJuego("Warframe", "multijugador online the ninjas espaciales", "http://n9e5v4d8.ssl.hwcdn.net/images/longlanding/warframe-metacard.png", 38070.5, 3668, 0, 120);
		SteamJuego dst = new SteamJuego("Don't starve together", "supervivencia, cooperativo, sandbox, estilo artistico único", "https://img.4gamers.com.tw/ckfinder-th/image2/auto/2021-10/dont-starve-together-211019-161827.jpg?versionId=Jbil3SP_ARdrfrvIfd3YmNfwKJjnQCLp", 23306, 2585, 14.99, 1384);
		SteamJuego ff14 = new SteamJuego("Final fantasy XIV", "mmorpg basado en el universo de final fantasy", "https://uvejuegos.com/img/caratulas/65684/endwalker.jpg", 23682.5, 4745, 11, 395);
		
		warframe.jugadoresDia(4154);
		dst.jugadoresDia(1987);
		ff14.jugadoresDia(4798);
		
		System.out.println("La media de jugadores de hoy de " + warframe.getNombre() + " es " + warframe.getMediaJugadoresDiarios());
		System.out.println("La media de jugadores de hoy de " + dst.getNombre() + " es " + dst.getMediaJugadoresDiarios());
		System.out.println("La media de jugadores de hoy de " + ff14.getNombre() + " es " + ff14.getMediaJugadoresDiarios());
	}

}
