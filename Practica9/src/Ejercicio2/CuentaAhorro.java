/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class CuentaAhorro extends CuentaBancaria {
	private double tipoIntereses;
	private final double modiComisiones;
	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 * @param tipoIntereses
	 * @param modiComisiones
	 */
	public CuentaAhorro(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisionAnual, double tipoIntereses) {
		super(numeroCuenta, saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionAnual);
		this.tipoIntereses = tipoIntereses;
		this.modiComisiones = 0.5;
	}
	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 * @param tipoIntereses
	 * @param modiComisiones
	 */
	public CuentaAhorro(CuentaAhorro c) {
		super(c.numeroCuenta, c.saldo, c.tieneTarjetaCredito, c.tieneTarjetaDebito, c.comisionAnual);
		this.tipoIntereses = c.tipoIntereses;
		this.modiComisiones = 0.5;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaAhorro");
		builder.append(super.toString());
		builder.append(", tipoIntereses=");
		builder.append(tipoIntereses);
		builder.append(", modiComisiones=");
		builder.append(modiComisiones);
		return builder.toString();
	}
	/**
	 * @return the tipoIntereses
	 */
	public double getTipoIntereses() {
		return tipoIntereses;
	}
	/**
	 * @return the modiComisiones
	 */
	public double getModiComisiones() {
		return modiComisiones;
	}
	
	
	
	
	
}
