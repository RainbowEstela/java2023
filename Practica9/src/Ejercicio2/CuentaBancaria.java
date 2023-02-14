/**
 * 
 */
package Ejercicio2;

import java.util.Objects;

/**
 * @author user
 *
 */
public class CuentaBancaria {
	protected String numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisionAnual;
	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 */
	public CuentaBancaria(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisionAnual) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.tieneTarjetaCredito = tieneTarjetaCredito;
		this.tieneTarjetaDebito = tieneTarjetaDebito;
		this.comisionAnual = comisionAnual;
	}
	
	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionAnual
	 */
	public CuentaBancaria(CuentaBancaria cb) {
		super();
		this.numeroCuenta = cb.numeroCuenta;
		this.saldo = cb.saldo;
		this.tieneTarjetaCredito = cb.tieneTarjetaCredito;
		this.tieneTarjetaDebito = cb.tieneTarjetaDebito;
		this.comisionAnual = cb.comisionAnual;
	}
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @return the tieneTarjetaCredito
	 */
	public boolean isTieneTarjetaCredito() {
		return tieneTarjetaCredito;
	}
	/**
	 * @return the tieneTarjetaDebito
	 */
	public boolean isTieneTarjetaDebito() {
		return tieneTarjetaDebito;
	}
	/**
	 * @return the comisionAnual
	 */
	public double getComisionAnual() {
		return comisionAnual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisionAnual=");
		builder.append(comisionAnual);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(numeroCuenta, other.numeroCuenta);
	}
	
	public void ingresar(int cant) {
		this.saldo += cant;
	}
	
	public boolean retirar(int cant) {
		if ( cant < this.saldo) {
			this.saldo -= cant;
			return true;
		} else {
			return false;
		}
	}
	
}
