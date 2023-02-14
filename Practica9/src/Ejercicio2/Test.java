package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		CuentaAhorro ca1 = new CuentaAhorro("1234", 1000, false, false, 0.1, 0.2);
		CuentaCorriente cc1 = new CuentaCorriente("2345", 200, 0.1, new TarjetaCredito("", "24/2/2024"), new TarjetaDebito("", "1/1/1998"));
		CuentaJoven cj = new CuentaJoven("9876", 150, false, false, 0.2);
		
		Banco banco = new Banco();
		
		banco.addCuenta(cj);
		banco.addCuenta(cj);
		banco.addCuenta(cc1);
		banco.addCuenta(ca1);
		
		System.out.println(banco.toString());
		System.out.println(banco.getCuenta(ca1).getSaldo());
		banco.getCuenta(ca1).ingresar(1000000);
		System.out.println(banco.getCuenta(ca1).getSaldo());

	}

}
