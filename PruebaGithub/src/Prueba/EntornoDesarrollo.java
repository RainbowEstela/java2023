package Prueba;

public class EntornoDesarrollo {
	
	public static void main(String[] args) {
		int x = 0, y = 0;
		int[][] tablaCirculo = { {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0} };

		//crear tabla
		for (x = 0; x < 6; x++) {
			
			for (y = 0; y < 6; y++) {
				
				if ((x + y == 5) || (x == y)){
					
					tablaCirculo[x][y] = 1;
					
				} else {
					
					tablaCirculo[x][y] = 0;		
				}
			}
		}
			
		
		//pintar tabla
		for (x = 0; x < 6; x++) {
					
			for (y = 0; y < 6; y++) {
						
				System.out.print(tablaCirculo[x][y]);
				
				}
			System.out.println("");
		}
		
	}
}


