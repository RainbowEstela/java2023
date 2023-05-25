/**
 * 
 */
package com.daw.reservaHotelesEstela.modelos;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author usuario1daw
 *
 */
public class Reserva implements Comparable<Reserva> {

	private static int autoIncremental = 1;

	private int id;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private int catidadHabitaciones;
	private int numPersonasPorHabitacion;
	private String dni;
	private String nacionalidad;
	private Hotel hotel;
	/**
	 * Constructor
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param catidadHabitaciones
	 * @param numPersonasPorHabitacion
	 * @param dni
	 * @param nacionalidad
	 * @param hotel
	 */
	public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, int catidadHabitaciones, int numPersonasPorHabitacion,
			String dni, String nacionalidad, Hotel hotel) {
		super();
		this.id = autoIncremental;
		autoIncremental++;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.catidadHabitaciones = catidadHabitaciones;
		this.numPersonasPorHabitacion = numPersonasPorHabitacion;
		this.dni = dni;
		this.nacionalidad = nacionalidad;
		this.hotel = hotel;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fechaEntrada
	 */
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	/**
	 * @return the fechaSalida
	 */
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	/**
	 * @return the catidadHabitaciones
	 */
	public int getCatidadHabitaciones() {
		return catidadHabitaciones;
	}
	/**
	 * @param catidadHabitaciones the catidadHabitaciones to set
	 */
	public void setCatidadHabitaciones(int catidadHabitaciones) {
		this.catidadHabitaciones = catidadHabitaciones;
	}
	/**
	 * @return the numPersonasPorHabitacion
	 */
	public int getNumPersonasPorHabitacion() {
		return numPersonasPorHabitacion;
	}
	/**
	 * @param numPersonasPorHabitacion the numPersonasPorHabitacion to set
	 */
	public void setNumPersonasPorHabitacion(int numPersonasPorHabitacion) {
		this.numPersonasPorHabitacion = numPersonasPorHabitacion;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}
	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [id=");
		builder.append(id);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", fechaSalida=");
		builder.append(fechaSalida);
		builder.append(", catidadHabitaciones=");
		builder.append(catidadHabitaciones);
		builder.append(", numPersonasPorHabitacion=");
		builder.append(numPersonasPorHabitacion);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", nacionalidad=");
		builder.append(nacionalidad);
		builder.append(", hotel=");
		builder.append(hotel);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return id == other.id;
	}
	
	@Override
	public int compareTo(Reserva o) {
		return this.getFechaEntrada().compareTo(o.getFechaEntrada());
	}
	
	
	
}
