/**
 * 
 */
package Ejercicio2;

/**
 * @author user
 *
 */
public class CuentaCorriente extends CuentaBancaria {
	private final double modiComision;
	private TarjetaCredito tarCredito;
	private TarjetaDebito tarDebito;

	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 * @param modiComision
	 */
	public CuentaCorriente(String numeroCuenta, double saldo,
			double comisionAnual, TarjetaCredito tc, TarjetaDebito td) {
		super(numeroCuenta, saldo, true, true, comisionAnual);
		this.modiComision = 0.4;
		this.tarCredito = new TarjetaCredito(numeroCuenta, tc.getFechaCaducidad());
		this.tarDebito = new TarjetaDebito(numeroCuenta, td.getFechaAlta());
	}

	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 * @param modiComision
	 */
	public CuentaCorriente(CuentaCorriente c) {
		super(c.numeroCuenta, c.saldo, true, true, c.comisionAnual);
		this.modiComision = 0.4;
		this.tarCredito = new TarjetaCredito(numeroCuenta, c.tarCredito.getFechaCaducidad());
		this.tarDebito = new TarjetaDebito(numeroCuenta, c.tarDebito.getFechaAlta());
	}

	/**
	 * @return the modiComision
	 */
	public double getModiComision() {
		return modiComision;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente ");
		builder.append(super.toString());
		builder.append(", modiComision=");
		builder.append(modiComision);
		return builder.toString();
	}
	
	
	
	
}
