/**
 * 
 */
package com.daw.reservaHotelesEstela.modelos;

/**
 * @author usuario1daw
 *
 */
public class HotelRural extends Hotel {

	
	private boolean calefaccion;

	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param provincia
	 * @param numHabitaciones
	 * @param precioNoche
	 * @param calificacion
	 * @param calefaccion
	 */
	public HotelRural(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
			double precioNoche, double calificacion, boolean calefaccion) {
		super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
		this.calefaccion = calefaccion;
	}

	/**
	 * @return the calefaccion
	 */
	public boolean isCalefaccion() {
		return calefaccion;
	}

	/**
	 * @param calefaccion the calefaccion to set
	 */
	public void setCalefaccion(boolean calefaccion) {
		this.calefaccion = calefaccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HotelRural [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", numHabitaciones=");
		builder.append(numHabitaciones);
		builder.append(", precioNoche=");
		builder.append(precioNoche);
		builder.append(", calificacion=");
		builder.append(calificacion);
		builder.append(", calefaccion=");
		builder.append(calefaccion);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
}
