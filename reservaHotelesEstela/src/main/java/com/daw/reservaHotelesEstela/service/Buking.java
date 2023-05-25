/**
 * 
 */
package com.daw.reservaHotelesEstela.service;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.daw.reservaHotelesEstela.modelos.Hotel;
import com.daw.reservaHotelesEstela.modelos.HotelPlaya;
import com.daw.reservaHotelesEstela.modelos.HotelRural;
import com.daw.reservaHotelesEstela.modelos.Reserva;

/**
 * @author usuario1daw
 *
 */
public class Buking {

	private List<Hotel> hoteles;
	private Set<Reserva> reservas;
	
	/**
	 * Constructor
	 */
	public Buking() {
		super();
		this.hoteles = new ArrayList<>();
		this.reservas = new HashSet<>();
	}
	
	
	
	
	/**
	 * @return the hoteles
	 */
	public List<Hotel> getHoteles() {
		return hoteles;
	}




	/**
	 * @return the reservas
	 */
	public Set<Reserva> getReservas() {
		return reservas;
	}




	//añadir y borrar hoteles
	/**
	 * añade un hotel a la lista de hoteles si no esta repetido
	 * @param h
	 */
	public void addHotel(Hotel h) {
		boolean estaHotel = this.hoteles.stream()
								.anyMatch(ho -> ho.getNombre().equals(h.getNombre()));
		//System.out.println(estaHotel);
		if (estaHotel == false) {
			//System.out.println("añado");
			this.hoteles.add(h);
		}
	}
	
	/**
	 * elimina un hotel si esta en la lista
	 * @param id
	 */
	public void deleteHotel(int id) {
		Hotel hotel = findHotelByid(id);
		
		if (hotel != null) {
			this.hoteles.remove(hotel);
		}
	}
	
	//añadir y borrar reservas
	/**
	 * crea y añade una nueva reserva con los datos pasados
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param cantidadHabitaciones
	 * @param numPersonasPorHabitacion
	 * @param dni
	 * @param nacionalidad
	 * @param hotel
	 */
	public void addreserva(LocalDate fechaEntrada, LocalDate fechaSalida, int cantidadHabitaciones, int numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
		this.reservas.add(new Reserva(fechaEntrada, fechaSalida, cantidadHabitaciones, numPersonasPorHabitacion, dni, nacionalidad, hotel));
	}
	
	/**
	 * borra una reserva de la lista si existe
	 * @param id
	 */
	public void deleteReserva(int id) {
		Reserva re = findReservaById(id);
		
		if(re != null) {
			this.reservas.remove(re);
		}
	}
	
	//streams de hotel
	/**
	 * devuelve el hotel de misma id, o null si no existe esa id
	 * @param id
	 * @return
	 */
	public Hotel findHotelByid(int id) {
		return this.hoteles.stream()
					.filter( ho -> ho.getId() == id)
					.findFirst()
					.orElse(null);
	}
	
	
	
	/**
	 * devuelve una lista con los hoteles de una provincia como parametro
	 * @param provincia
	 * @return
	 */
	public List<Hotel> findHotelByProvincia(String provincia) {
		return this.hoteles.stream()
					.filter(ho -> ho.getProvincia().equals(provincia))
					.collect(Collectors.toList());
	}
	
	/**
	 * devuelve una lista de los hoteles con menos de 20 habitaciones ordenados por el precio de mayor a menor
	 * @return
	 */
	public List<Hotel> getHotelesPequenios() {
		return this.hoteles.stream()
					.filter( ho -> ho.getNumHabitaciones() < 20)
					.sorted( (ho1,ho2) -> (int) (ho2.getPrecioNoche() - ho1.getPrecioNoche()))
					.collect(Collectors.toList());
	}
	
	/**
	 * devuelve una lista con los hoteles con precio mas alto
	 * @return
	 */
	public List<Hotel> getHotelesCaros() {
		return this.hoteles.stream()
						.sorted((ho1,ho2) -> (int) (ho2.getPrecioNoche() - ho1.getPrecioNoche()))
						.limit(2)
						.collect(Collectors.toList());
	}
	
	/**
	 * Devuelve un mapa cuya clave es la localidad y su valor una lista de hoteles
	 * @return
	 */
	public Map<String, List<Hotel>> getHotelesLocalidad() {
		return this.hoteles.stream()
					.collect(Collectors.groupingBy(Hotel::getLocalidad));
	}
	
	/**
	 * devuelve un set de hoteles playa
	 * @return
	 */
	public Set<Hotel> getHotelesPlaya() {
		return this.hoteles.stream()
						.filter( ho -> ho instanceof HotelPlaya)
						.collect(Collectors.toSet());
	}
	
	/**
	 * devuelve un set de hoteles rurales
	 * @return
	 */
	public Set<Hotel> getHotelesRurales() {
		return this.hoteles.stream()
				.filter( ho -> ho instanceof HotelRural)
				.collect(Collectors.toSet());
	}
	
	//streams de reserva
		/**
		 * devuelve una reserva por id o null si no esta esa id
		 * @param id
		 * @return
		 */
		public Reserva findReservaById(int id) {
			return this.reservas.stream()
					.filter( re -> re.getId() == id)
					.findFirst()
					.orElse(null);
		}
		
		/**
		 * devuelve la lista de reserva por dni
		 * @param dni
		 * @return
		 */
		public List<Reserva> findReservaByDni(String dni) {
			return this.reservas.stream()
							.filter(re -> re.getDni().equals(dni))
							.collect(Collectors.toList());
		}
		
		/**
		 * devuelve un mapa con la cantidad de reservas por pais
		 * @return
		 */
		public Map<String, Long> getReservaPais() {
			return this.reservas.stream()
						.collect(Collectors.groupingBy(Reserva::getNacionalidad,Collectors.counting()));
		}
		
		/**
		 * devuelve las reservas con mas de dos habitaciones
		 * @return
		 */
		public List<Reserva> getReservasGrandes() {
			return this.reservas.stream()
							.filter( re -> re.getCatidadHabitaciones() > 2)
							.collect(Collectors.toList());
		}
		
		/**
		 * devuelve las reservas por fecha de entrada (es la ordenacion natural de la clase reserva)
		 * @return
		 */
		public List<Reserva> getReservasOrdenadas() {
			return this.reservas.stream()
					.sorted()
					.collect(Collectors.toList());
		}
		
		/**
		 * devuelve el importe de una reserva o 0 si la id no esta en la lista
		 * @param idReserva
		 * @return
		 */
		public double getImporteReserva(int idReserva) {
			return this.reservas.stream()
						.filter(re -> re.getId() == idReserva)
						.map(re -> re.getHotel().getPrecioNoche() * re.getCatidadHabitaciones() * re.getFechaEntrada().until(re.getFechaSalida()).getDays())
						.findFirst()
						.orElse(0.0);
		}
		
		/**
		 * devuelve una lista de reservas activas
		 * @param idHotel
		 * @return
		 */
		public List<Reserva> getReservasActivas(int idHotel) {
			return this.reservas.stream()
						.filter(re -> re.getHotel().getId() == idHotel)
						.filter(re -> re.getFechaEntrada().isBefore(LocalDate.now()) || re.getFechaEntrada().equals(LocalDate.now()))
						.filter(re -> re.getFechaSalida().isAfter(LocalDate.now()) || re.getFechaSalida().equals(LocalDate.now()))
						.collect(Collectors.toList());
		}
		
		/**
		 * devuelve el importe total de un hotel de sus reservas finalizadas
		 * @param idHotel
		 * @return
		 */
		public Double getImporteReservasFinalizadas(int idHotel) {
			return this.reservas.stream()
						.filter(re -> re.getHotel().getId() == idHotel)
						.filter(re -> re.getFechaSalida().isBefore(LocalDate.now()))
						.map(re -> re.getHotel().getPrecioNoche() * re.getCatidadHabitaciones() * re.getFechaEntrada().until(re.getFechaSalida()).getDays())
						.reduce( (n1,n2) -> n1 + n2)
						.orElse(0.0);
		}
	
}
