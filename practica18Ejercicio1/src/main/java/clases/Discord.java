/**
 * 
 */
package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author user
 *
 */
public class Discord {
	private List<Gamer> jugadores;

	/**
	 * Construcor 
	 */
	public Discord() {
		super();
		this.jugadores = new ArrayList<>();
		this.loadGamers();
		Collections.sort(jugadores);
	}
	
	/**
	 * @return the jugadores
	 */
	public List<Gamer> getJugadores() {
		return jugadores;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Discord [jugadores=");
		builder.append(jugadores);
		builder.append("]");
		return builder.toString();
	}

	//METODOS PROPIOS
	
	/**
	 * lee el fichero gamers.txt y carga los jugadores a la lista de jugadores de discord
	 */
	private void loadGamers() {
		Path f1 = Paths.get("./src/resources/gamers.txt");
		
		try {
			 jugadores = Files.readAllLines(f1).stream()
				.map( linea -> {
					String[] datos = linea.split(";");
					
					Nivel n = null;
					
					switch (datos[3]) {
						case "DIOS": {
							n = Nivel.DIOS;
							break;
						}
						case "MAQUINA": {
							n = Nivel.MAQUINA;
							break;
						}
						case "BUENO": {
							n = Nivel.BUENO;
							break;
						}
						case "NORMAL": {
							n = Nivel.NORMAL;
							break;
						}
						case "REGULAR": {
							n = Nivel.REGULAR;
							break;
						}
						case "MALILLO": {
							n = Nivel.MALILLO;
							break;
						}
						case "PAQUETE": {
							n = Nivel.PAQUETE;
							break;
						}
						default:
							n = Nivel.NORMAL;
					}
					
					return new Gamer(datos[0], datos[1], datos[2], n);
				})
				.collect(Collectors.toList());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveGamers() {
		Path archivoGuardar = Paths.get("./src/resources/gamers.txt");
		
		List<String> listaGamers = this.jugadores.stream()
										.map( gamer -> {
											StringBuilder sb = new StringBuilder();
											
											sb.append(gamer.getNick());
											sb.append(";");
											sb.append(gamer.getEmail());
											sb.append(";");
											sb.append(gamer.getJuego());
											sb.append(";");
											sb.append(gamer.getNivel());
											
											return sb.toString();
										})
										.collect(Collectors.toList());
		
		try {
			Files.write(archivoGuardar, listaGamers, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * añade un jugador a la lista de discord si no existe
	 * @param j
	 */
	public void addGamer(Gamer j) {
		int index = Collections.binarySearch(jugadores, j);
		
		if(index < 0) {
			jugadores.add(j);
			Collections.sort(jugadores);
		}
		
	}
	
	/**
	 * borra un jugador si existe de la lista de discord
	 * @param j
	 */
	public void removeGamer(Gamer j) {
		int index = Collections.binarySearch(jugadores, j);
		
		if(index >= 0) {
			jugadores.remove(index);
		}
	}
	
	/**
	 * @param nick
	 * @return devuelve el jugador que tenga el nick pasado
	 */
	public Gamer findGamer(String nick) {
		int index = Collections.binarySearch(jugadores, new Gamer(nick, "", "", null));
		if (index >= 0) {
			return jugadores.get(index);
		}
		
		return null;
	}
	
	/**
	 * muestra por pantalla la lista de jugadores que estan en discord
	 */
	public void listGamers() {
		jugadores.stream()
			.forEach(j -> System.out.println( j.getNick() + ", " + j.getEmail() + ", " + j.getJuego() + ", " + j.getNivel()));
	}
}

