package Prueba;

public class NotaProgramacion {

	public static void main(String[] args) {
		
		double nota1 = 5, nota2 = 5, nota3 = 5, examen = 3;
		double mediaPractica, mediaTotal;
		
		mediaPractica = (nota1 + nota2 + nota3) / 3;
		
		if ((mediaPractica >= 3) && (examen >= 3)) {
			
			mediaTotal = (mediaPractica * 0.6) + (examen * 0.4);
			if (mediaTotal >= 5) {
				
				System.out.println("aprobado");
				
			} else {
				
				System.out.println("suspenso");
				
			}
			
		} else {
			
			System.out.println("suspenso");
			
		}

	}

}
