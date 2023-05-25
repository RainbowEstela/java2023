/**
 * 
 */
package com.daw.reservaHotelesEstela.modelos;

/**
 * @author usuario1daw
 *
 */
public class HotelPlaya extends Hotel {

	private boolean aireAcondicionado;

	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param provincia
	 * @param numHabitaciones
	 * @param precioNoche
	 * @param calificacion
	 * @param aireAcondicionado
	 */
	public HotelPlaya(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
			double precioNoche, double calificacion, boolean aireAcondicionado) {
		super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
		this.aireAcondicionado = aireAcondicionado;
	}

	/**
	 * @return the aireAcondicionado
	 */
	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	/**
	 * @param aireAcondicionado the aireAcondicionado to set
	 */
	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HotelPlaya [id=");
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
		builder.append(", aireAcondicionado=");
		builder.append(aireAcondicionado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
