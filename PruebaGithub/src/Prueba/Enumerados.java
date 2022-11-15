package Prueba;

public class Enumerados {

	enum NombreMes {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO,JULIO, AGOSTO,SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
	enum Genero{ HOMBRE, MUJER, OTRO}
	
	
	public static void main(String[] args) {

		NombreMes mes = NombreMes.ENERO;
		Genero sx = Genero.MUJER;
		
		System.out.println(mes);
		System.out.println(sx);
		
	}

}
