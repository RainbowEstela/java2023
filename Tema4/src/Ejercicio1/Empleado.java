/**
 * 
 */
package Ejercicio1;

/**
 * @author Estela
 *
 */
public class Empleado {
	
	/**
	 * Características
	 */
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	private double salarioMensualBruto;
	private double irpf;
	private double seguridadSocial;
	private String departamento;

	
	/**
	 * Constructores
	 */
	
	public Empleado() {
		super();
		this.nombre = "nombre";
		this.apellidos = "apellido";
		this.edad = 18;
		this.email = "email";
		this.salarioMensualBruto = 1000;
		this.irpf = 10;
		this.seguridadSocial = 10;
		this.departamento = "";
	}


	public Empleado(String nombre, String apellidos, int edad, String email, double salarioMensualBruto, double irpf,
			double seguridadSocial, String departamento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.salarioMensualBruto = salarioMensualBruto;
		this.irpf = irpf;
		this.seguridadSocial = seguridadSocial;
		this.departamento = departamento;
	}


	/**
	 * getters y setters
	 * @return
	 */
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalarioMensualBruto() {
		return salarioMensualBruto;
	}


	public void setSalarioMensualBruto(double salarioMensualBruto) {
		this.salarioMensualBruto = salarioMensualBruto;
	}


	public double getIrpf() {
		return irpf;
	}


	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}


	public double getSeguridadSocial() {
		return seguridadSocial;
	}


	public void setSeguridadSocial(double seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	/**
	 * devuelve el salario neto
	 * @return
	 */
	public double mostrarSalarioActual() {
		double salarioActual = 0;
		
		salarioActual = this.salarioMensualBruto - ( (this.salarioMensualBruto * (this.irpf / 100) ) + ( this.salarioMensualBruto * (this.seguridadSocial / 100) ) );
		
		return salarioActual;
	}
	
}
