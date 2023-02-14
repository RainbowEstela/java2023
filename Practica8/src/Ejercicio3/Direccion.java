package Ejercicio3;

import java.util.Objects;

public class Direccion {
	private String calle;
	private int numero;
	private String poblacion;
	private String provincia;
	private String cp;
	private String pais;
	private double latitud;
	private double longitud;
	/**
	 * @param calle
	 * @param numero
	 * @param poblacion
	 * @param provincia
	 * @param cp
	 * @param pais
	 * @param latitud
	 * @param longitud
	 */
	public Direccion() {
		super();
		this.calle = "";
		this.numero = 0;
		this.poblacion = "";
		this.provincia = "";
		this.cp = "";
		this.pais = "";
		this.latitud = 0;
		this.longitud = 0;
	}

	/**
	 * @param calle
	 * @param numero
	 * @param poblacion
	 * @param provincia
	 * @param cp
	 * @param pais
	 * @param latitud
	 * @param longitud
	 */
	public Direccion(String calle, int numero, String poblacion, String provincia, String cp, String pais,
			double latitud, double longitud) throws Exception {
		super();
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		setLatitud(latitud);
		setLongitud(longitud);
	}
	/**
	 * @param calle
	 * @param numero
	 * @param poblacion
	 * @param provincia
	 * @param cp
	 * @param pais
	 * @param latitud
	 * @param longitud
	 */
	public Direccion(Direccion d) throws Exception {
		super();
		this.calle = d.calle;
		this.numero = d.numero;
		this.poblacion = d.poblacion;
		this.provincia = d.provincia;
		this.cp = d.cp;
		this.pais = d.pais;
		setLatitud(d.latitud);
		setLongitud(d.longitud);
	}
	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}
	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}
	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}
	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) throws Exception {
		if (longitud < -90 || longitud > 90) {
			throw new Exception("Valor de longitud no válido");
		} else {
			this.latitud = latitud;
		}
		
	}
	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) throws Exception {
		if (longitud < -180 || longitud > 180) {
			throw new Exception("Valor de longitud no válido");
		} else {
			this.longitud = longitud;
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [calle=");
		builder.append(calle);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", cp=");
		builder.append(cp);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
	
	public double distanciaKm(Direccion otra) {
		
		if (this.equals(otra)) {
			return 0;
		} else {
			double radio = 6371;
			double lat1Rad = Math.toRadians(this.latitud);
			System.out.println(lat1Rad);
			double lat2Rad = Math.toRadians(otra.getLatitud());
			System.out.println(lat2Rad);
			double long1Rad = Math.toRadians(this.longitud);
			System.out.println(long1Rad);
			double long2Rad = Math.toRadians(otra.getLongitud());
			System.out.println(long2Rad);
			double latitudModulo = lat2Rad - lat1Rad;
			System.out.println(latitudModulo);
			double longitudModulo = long2Rad - long1Rad;
			System.out.println(longitudModulo);
			double a = (Math.sin(latitudModulo /2) + Math.cos(lat1Rad)) * Math.cos(lat2Rad) * Math.sin(longitudModulo/2);
			System.out.println(a);
			double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
			System.out.println(c);
			return radio * c;
		}
		
		
	}
	
}
