/**
 * 
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 * @author user
 *
 */
public class Banco {
	ArrayList<CuentaBancaria> misCuentas;

	/**
	 * @param misCuentas
	 */
	public Banco() {
		super();
		this.misCuentas = new ArrayList<>();
	}
	
	public void addCuenta(CuentaBancaria cb) {
		if (misCuentas.indexOf(cb) == -1) {
			misCuentas.add(cb);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [misCuentas=");
		for(CuentaBancaria cb : misCuentas) {
			builder.append(cb.toString() + "\n");
		}
		builder.append("]");
		return builder.toString();
	}
	
	public CuentaBancaria getCuenta(CuentaBancaria c) {
		int index = misCuentas.indexOf(c);
		if (index != -1 ) {
			
			return misCuentas.get(index);
		} else {
			System.out.println("entro");
			return null;
		}
	}
}
