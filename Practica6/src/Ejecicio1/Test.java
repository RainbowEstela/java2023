package Ejecicio1;

public class Test {

	public static void main(String[] args) {
		Temperatura temp = new Temperatura();
		double celcius = 36;
		double farenheit = 125;
		
		System.out.println(celcius + "�C equivale a " + temp.celciusToFarenheit(celcius) + "�F");
		System.out.println(farenheit + "�F equivale a " + temp.farenheitToCelcius(farenheit) + "�C");
		

	}

}
