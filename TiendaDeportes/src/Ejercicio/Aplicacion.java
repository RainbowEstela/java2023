package Ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
	
	public static void pintarInventario(Tienda t) {
		for(Producto p : t.inventario) {
			System.out.println(p.toString());
		}
	}
	
	public static void buscarProducto(String texto, Tienda t) {
		ArrayList<Producto> resultado = t.buscarProducto(texto);
		for(Producto producto : resultado) {
			System.out.println(producto.toString());
		}
	}
	
	public static void hacerCompra(Tienda t) {
		Compra c = new Compra(LocalDate.now());
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int codigo = 0;
		int cantidad = 0;
		int numeroDeOrden = 1;
		boolean repetido = false;
		while (opc != 1) {
			
				System.out.println("escriba el codigo del producto que desea comprar");
				codigo = Integer.parseInt(sc.nextLine());
				System.out.println("digame la cantidad que desea comprar");
				cantidad = Integer.parseInt(sc.nextLine());
				
				for(LineaCompra l : c.getLista()) {
					if (l.equals(t.buscarProducto(codigo))) {
						repetido = true;
					}
				}
				
				if (repetido == true) {
					c.addLinea(new LineaCompra(numeroDeOrden, t.buscarProducto(codigo), cantidad));
				} else {
					c.addLinea(new LineaCompra(numeroDeOrden, t.buscarProducto(codigo), cantidad));
					numeroDeOrden++;
				}
				
				repetido = false;
				System.out.println("pulse 1 para salir, otro para continuar comprando");
				opc = Integer.parseInt(sc.nextLine());
		}
		
		try {
			t.addCompra(c);
			System.out.println("transaccion hecha");
		
		} catch (Exception e) {
			System.out.println("*ERROR*: no disponemos de suficiente stock");
		}
	}
	
	
	public static void main(String[] args) {
		Tienda decatlon = new Tienda();
		Ropa r1 = new Ropa("sujetador deportivo copa B", "100% nilon", 10, 100, Talla.L, "negro", Tipo.SUJETADORDEPORTIVO);
		Ropa r2 = new Ropa("camiseta ancha deportiva", "con agujeros transpirables", 20, 3, Talla.XLL, "verde fosforito", Tipo.CAMISA);
		Ropa r3 = new Ropa("pantalon de deporte", "ajustado y estirable", 30, 50, Talla.XS, "arcoiris", Tipo.LEGGINS);
		
		Zapatillas z1 = new Zapatillas("nike XD", "maximo confort", 100, 700, Numero.N35, Categoria.RUNNING);
		Zapatillas z2 = new Zapatillas("stradivarius 432", "elegantes y resistentes", 250, 40, Numero.N44, Categoria.WALKING);
		Zapatillas z3 = new Zapatillas("bike basket", "coloridas y traspirantes", 50, 200, Numero.N49, Categoria.BALONCESTO);
		
		decatlon.addProducto(r1);
		decatlon.addProducto(r2);
		decatlon.addProducto(r3);
		decatlon.addProducto(z1);
		decatlon.addProducto(z2);
		decatlon.addProducto(z3);
		
		/*
		var c = new Compra(LocalDate.now());
		c.addLinea(new LineaCompra(1, z3, 3));
		c.addLinea(new LineaCompra(1, z2, 5));
		System.out.println(c);
		*/
		
		int opc = 0;
		Scanner sc = new Scanner(System.in);
		while(opc != 6) {
			System.out.println("1. mostrar inventario");
			System.out.println("2. buscar producto");
			System.out.println("3. mostrar compras");
			System.out.println("4. mostrar compras por mes");
			System.out.println("5. hacer compra");
			System.out.println("6. salir");
			
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1:
				pintarInventario(decatlon);
				break;
			case 2:
				System.out.println("buscar productos que contengan:");
				buscarProducto(sc.nextLine(), decatlon);
				break;
			case 3:
				decatlon.mostrarComprar();
				break;
			case 4:
				System.out.println("dime el mes para buscar 1-12");
				decatlon.mostrarComprar(Integer.parseInt(sc.nextLine()));
				break;
			case 5:
				hacerCompra(decatlon);
				break;
			case 6:
				System.out.println("Gracias por su visita");
				break;
			
			default:
				System.out.println("*ERROR: eleccion no válida*");
				break;
			}
		}
	}

}
