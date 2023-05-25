package com.daw.reservaHotelesEstela.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.daw.reservaHotelesEstela.io.ReservasFile;
import com.daw.reservaHotelesEstela.modelos.Hotel;
import com.daw.reservaHotelesEstela.service.Buking;

public class AppBucking {

	
	public static void mostrarMenu() {
		System.out.println("1. listar todos los hoteles");
		System.out.println("2. listar todas las reservas");
		System.out.println("3. mostrar reservas por pais");
		System.out.println("4. mostrar reservas activas");
		System.out.println("5. mostrar importe reservas finalizadas este año");
		System.out.println("6. insertar reserva");
		System.out.println("7 eliminar reserva(por id)");
		System.out.println("8. salir y guardar");
	}
	
	public static void mostrarImporte (Buking bu, int subOpc) {
		System.out.println(
		bu.getReservas().stream()
		.filter(re -> re.getHotel().getId() == subOpc)
		.filter(re -> re.getFechaSalida().isBefore(LocalDate.now()))
		.filter(re -> re.getFechaSalida().getYear() == LocalDate.now().getYear())
		.map(re -> re.getHotel().getPrecioNoche() * re.getCatidadHabitaciones() * re.getFechaEntrada().until(re.getFechaSalida()).getDays())
		.reduce( (n1,n2) -> n1 + n2)
		.orElse(0.0)
		);
		
	}
	
	public static void main(String[] args) {
		Buking bu = ReservasFile.cargarCSV();
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		Integer subOpc = 0;
		
		while (opc != 8) {
			mostrarMenu();
			try {
				opc = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				opc = 0;
			}
			
			switch (opc) {
				case 1: {
					bu.getHoteles().forEach(System.out::println);
					break;
				}
				case 2: {
					bu.getReservas().stream()
						.sorted((re1,re2) -> re1.getFechaEntrada().compareTo(re2.getFechaEntrada()))
						.forEach( re -> System.out.println( "id: " + re.getId() + ", dni: "+ re.getDni() + ", entrada: " + re.getFechaEntrada() + ", salida:" + re.getFechaSalida() + ", importe" + bu.getImporteReserva(re.getId()) ));
					break;
				}
				case 3: {
					bu.getReservaPais().forEach((k,v) -> System.out.println(k + ": " + v));
					break;
				}
				case 4: {
					System.out.println("INTRODUZCA ID DEL HOTEL");
					try {
						subOpc = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						subOpc = 0;
					}
					
					bu.getReservasActivas(subOpc).stream()
						.sorted((re1,re2) -> re1.getFechaSalida().compareTo(re2.getFechaSalida()))
						.forEach(System.out::println);
					break;
				}
				case 5: {
					System.out.println("INTRODUZCA ID DEL HOTEL");
						
					try {
						subOpc = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						subOpc = 0;
					}
					
					mostrarImporte(bu, subOpc);
					
					break;
				}
				case 6: {
					//LocalDate fechaEntrada, LocalDate fechaSalida, int catidadHabitaciones, int numPersonasPorHabitacion,
					//String dni, String nacionalidad, Hotel hotel
					LocalDate fe = null;
					LocalDate fs = null;
					int numHa = 0;
					int numPer = 0;
					String dni = "";
					String nacionalidad = "";
					int idHotel = 0;
 					
					try {
						System.out.println("fecha entrada formato (yyyy-mm-dd)");
						fe = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
						
						System.out.println("fecha salida formato (yyyy-mm-dd)");
						fs = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
						
						System.out.println("cantidad habitaciones");
						numHa = Integer.parseInt(sc.nextLine());
						
						System.out.println("personas por habitacion");
						numPer = Integer.parseInt(sc.nextLine());
						
						System.out.println("dni");
						dni = sc.nextLine();
						
						System.out.println("nacionalidad");
						nacionalidad = sc.nextLine();
						
						System.out.println("id del hotel");
						idHotel = Integer.parseInt(sc.nextLine());
						
						bu.addreserva(fe, fs, numHa, numPer, dni, nacionalidad, bu.findHotelByid(idHotel));
						
					} catch (Exception e) {
						System.out.println("ERROR PARAMETRO INCORRECTO");
					}
					
					break;
				}
				case 7: {
					System.out.println("id de reserva a borrar");
					try {
						subOpc = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						subOpc = 0;
					}
					
					bu.deleteReserva(subOpc);
					break;
				}
				case 8: {
					ReservasFile.grabarCSV(bu);
					System.out.println("GRACIAS POR USAR BUKING");
					break;
				}
				default:
					System.out.println("**ERROR: OPCION NO VALIDA**");
			}
			
			
		}

	}

}
