package Ejecicio1;

public class Test {

	public static void main(String[] args) {
		Temperatura temp = new Temperatura();
		double celcius = 36;
		double farenheit = 125;
		
		System.out.println(celcius + "ºC equivale a " + temp.celciusToFarenheit(celcius) + "ºF");
		System.out.println(farenheit + "ºF equivale a " + temp.farenheitToCelcius(farenheit) + "ºC");
		

	}

}
