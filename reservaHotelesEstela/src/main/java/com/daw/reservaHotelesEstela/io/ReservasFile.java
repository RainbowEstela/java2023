/**
 * 
 */
package com.daw.reservaHotelesEstela.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.daw.reservaHotelesEstela.modelos.HotelPlaya;
import com.daw.reservaHotelesEstela.modelos.HotelRural;
import com.daw.reservaHotelesEstela.service.Buking;

/**
 * @author usuario1daw
 *
 */
public class ReservasFile {

	public static Buking cargarCSV() {
		Path pHoteles = Paths.get("./src/hoteles.csv");
		Path pReservas = Paths.get("./src/reservas.csv");
		
		Buking bu = new Buking();
		
		//insertamos los hoteles del documento
		try {
			//System.out.println("entro a crear hoteles");
			Files.readAllLines(pHoteles).stream()
						.filter( ln -> ln.length() > 0)
						//.peek(System.out::println)
						.forEach( ln -> {
							String[] parametros = ln.split(",");
							
							int playaORural = Integer.parseInt(parametros[7].trim());
							
							//System.out.println(parametros[7]);
							
							switch (playaORural) {
								case 1: {
									boolean calefaccion = false;
									
									if (parametros[8].trim().equals("1")) {
										calefaccion = true;
									}
									
									//String nombre, String direccion, String localidad, String provincia, int numHabitaciones, double precioNoche, double calificacion, boolean calefaccion
									//   0                1                 2                   3                 4                  5                   6                      8           
									bu.addHotel(new HotelRural(parametros[0].trim(), parametros[1].trim(), parametros[2].trim(), parametros[3].trim(), Integer.parseInt(parametros[4].trim()), Double.parseDouble(parametros[5].trim()), Double.parseDouble(parametros[6].trim()), calefaccion));
									break;
								}
								case 0: {
									boolean aire = false;
									
									if (parametros[9].trim().equals("1")) {
										aire = true;
									}
									
									//String nombre, String direccion, String localidad, String provincia, int numHabitaciones, double precioNoche, double calificacion, boolean calefaccion
									//   0                1                 2                   3                 4                  5                   6                      8           
									bu.addHotel(new HotelPlaya(parametros[0].trim(), parametros[1].trim(), parametros[2].trim(), parametros[3].trim(), Integer.parseInt(parametros[4].trim()), Double.parseDouble(parametros[5].trim()), Double.parseDouble(parametros[6].trim()), aire));
									break;
								}
								
								
							}
							//bu.getHoteles().forEach(System.out::println);
						});
			//bu.getHoteles().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//insertar las reservas
		
		try {
			Files.readAllLines(pReservas).stream()
						.filter( ln -> ln.length() > 0)
						.forEach( ln -> {
							String[] parametros = ln.split(",");
							
							bu.addreserva(LocalDate.parse(parametros[0], DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalDate.parse(parametros[1], DateTimeFormatter.ofPattern("yyyy-MM-dd")), Integer.parseInt(parametros[2]), Integer.parseInt(parametros[3]), parametros[4], parametros[5], bu.findHotelByid(Integer.parseInt(parametros[6])));
							
						});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return bu;
	}
	
	public static void grabarCSV(Buking bu) {
		Path pHoteles = Paths.get("./src/hoteles.csv");
		Path pReservas = Paths.get("./src/reservas.csv");
		
		//crear lista para hoteles.csv
		List<String> lineashotel = bu.getHoteles().stream()
									.map( ho -> {
										StringBuilder sb = new StringBuilder();
										
										sb.append(ho.getNombre());
										sb.append(",");
										sb.append(ho.getDireccion());
										sb.append(",");
										sb.append(ho.getLocalidad());
										sb.append(",");
										sb.append(ho.getProvincia());
										sb.append(",");
										sb.append(ho.getNumHabitaciones());
										sb.append(",");
										sb.append(ho.getPrecioNoche());
										sb.append(",");
										sb.append(ho.getCalificacion());
										sb.append(",");
										
										
										
										if (ho instanceof HotelRural ) {
											
											boolean tieneCalefaccion = ((HotelRural) ho).isCalefaccion();
											sb.append("1");
											sb.append(",");
											if (tieneCalefaccion) {
												
												sb.append("1");
												sb.append(",");
												sb.append("0");
											} else {
												sb.append("0");
												sb.append(",");
												sb.append("0");
											}
										
											
										} else if (ho instanceof HotelPlaya) {
											sb.append("0");
											sb.append(",");
											boolean tieneAire = ((HotelPlaya) ho).isAireAcondicionado();
											if (tieneAire) {
												
												sb.append("0");
												sb.append(",");
												sb.append("1");
											} else {
												sb.append("0");
												sb.append(",");
												sb.append("0");
											}
											
										}
										
										
										return sb.toString();
									})
									.collect(Collectors.toList());
		
		//crear lista reservas
		List<String> lineasReserva = bu.getReservas().stream()
										.map( re -> {
											StringBuilder sb = new StringBuilder();
											
											sb.append(re.getFechaEntrada().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
											sb.append(",");
											sb.append(re.getFechaSalida().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
											sb.append(",");
											sb.append(re.getCatidadHabitaciones());
											sb.append(",");
											sb.append(re.getNumPersonasPorHabitacion());
											sb.append(",");
											sb.append(re.getDni());
											sb.append(",");
											sb.append(re.getNacionalidad());
											sb.append(",");
											sb.append(re.getHotel().getId());
											
											
											return sb.toString();
										})
										.collect(Collectors.toList());
				
		
		try {
			Files.write(pHoteles, lineashotel, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
			Files.write(pReservas, lineasReserva, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
