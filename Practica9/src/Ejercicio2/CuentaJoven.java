/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class CuentaJoven extends CuentaBancaria {
	private final double modiComisiones;

	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 * @param modiComisiones
	 */
	public CuentaJoven(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisionAnual) {
		super(numeroCuenta, saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionAnual);
		this.modiComisiones = 0.25;
	}

	
	
	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 * @param modiComisiones
	 */
	public CuentaJoven(CuentaJoven c) {
		super(c.numeroCuenta, c.saldo, c.tieneTarjetaCredito, c.tieneTarjetaDebito, c.comisionAnual);
		this.modiComisiones = 0.25;
	}



	/**
	 * @return the modiComisiones
	 */
	public double getModiComisiones() {
		return modiComisiones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaJoven ");
		builder.append(super.toString());
		builder.append(", modiComisiones=");
		builder.append(modiComisiones);
		return builder.toString();
	}
	
	
	
}
