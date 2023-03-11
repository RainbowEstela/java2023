/**
 * 
 */
package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author usuario1daw
 *
 */
public class Wordle {
	private ArrayList<String> diccionario;
	private static char[] alfabeto = {'a','b','c','d','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	private String palabraAcertar;
	private String palabraActual;
	private ArrayList<String> letrasNoEstan;
	
	/**
	 */
	public Wordle() {
		super();
		this.diccionario = new ArrayList<>();
		diccionario.add("acoja");
		diccionario.add("ardan");
		diccionario.add("bodas");
		diccionario.add("baños");
		diccionario.add("artes");
		diccionario.add("arpas");
		diccionario.add("cabra");
		diccionario.add("colmo");
		diccionario.add("cesta");
		diccionario.add("cazos");
		diccionario.add("corre");
		diccionario.add("chile");
		diccionario.add("cruje");
		diccionario.add("divas");
		diccionario.add("gales");
		diccionario.add("hacen");
		diccionario.add("hayan");
		diccionario.add("hecho");
		diccionario.add("kenia");
		diccionario.add("lados");
		diccionario.add("libro");
		diccionario.add("misma");
		diccionario.add("paris");
		diccionario.add("epico");
		diccionario.add("ranas");
		diccionario.add("santa");
		diccionario.add("soñar");
		diccionario.add("titan");
		diccionario.add("verde");
		diccionario.add("volar");
		diccionario.add("votar");
		
		this.palabraAcertar = diccionario.get( LocalDate.now().getDayOfMonth() -1);
		this.palabraActual = "*****";
		this.letrasNoEstan = new ArrayList<>();
	}

	/**
	 */
	public Wordle(String palabra) {
		super();
		if ( palabra.length() != 5) {
			throw new ArrayIndexOutOfBoundsException("ERROR: la palabra no es de 5 caracteres");
		}
		
		this.diccionario = new ArrayList<>();
		this.palabraAcertar = palabra;
		this.palabraActual = "*****";
		this.letrasNoEstan = new ArrayList<>();
	}
	
	public boolean comprobar(String intento) {
		intento = intento.toLowerCase();
		
		if ( intento.length() != 5) {
			throw new ArrayIndexOutOfBoundsException("ERROR: la palabra no es de 5 caracteres");
		}
		
		boolean esta = false;
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < this.palabraAcertar.length(); i++) {
			
			if (this.palabraAcertar.charAt(i) == intento.charAt(i)) {
				sb.append(intento.toUpperCase().charAt(i));
				esta = true;
				
			} else {
				for (int j = 0; j < this.palabraAcertar.length(); j++) {
					
					if (this.palabraAcertar.charAt(j) == intento.charAt(i)) {
						sb.append(intento.charAt(i));
						esta = true;
						break;
					}
				}
			}
			
			if (esta == false ) {
				sb.append('*');
				this.addNoEstan(intento.charAt(i));
				
			} else {
				esta = false;
			}
			
		}
		
		this.palabraActual = sb.toString();
		System.out.println(this.toString());
		System.out.println(letrasNoEstan);
		
		return palabraActual.equals(this.palabraAcertar.toUpperCase());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(palabraActual);
		return builder.toString();
	}
	
	/**
	 * añade una letra que no está en la palabra a acertar
	 * @param letra
	 */
	private void addNoEstan(char letra) {
		StringBuffer sb = new StringBuffer().append(letra);
		
		if (this.letrasNoEstan.indexOf(sb.toString()) == -1) {
			this.letrasNoEstan.add(sb.toString());
		}
	}

	/**
	 * @return the palabraAcertar
	 */
	public String getPalabraAcertar() {
		return palabraAcertar;
	}

	/**
	 * @param palabraAcertar the palabraAcertar to set
	 */
	public void setPalabraAcertar(String palabraAcertar) {
		this.palabraAcertar = palabraAcertar;
	}

	/**
	 * @return the palabraActual
	 */
	public String getPalabraActual() {
		return palabraActual;
	}

	/**
	 * @param palabraActual the palabraActual to set
	 */
	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}

	/**
	 * @return the diccionario
	 */
	public ArrayList<String> getDiccionario() {
		return diccionario;
	}

	/**
	 * @return the alfabeto
	 */
	public static char[] getAlfabeto() {
		return alfabeto;
	}

	/**
	 * @return the letrasNoEstan
	 */
	public ArrayList<String> getLetrasNoEstan() {
		return letrasNoEstan;
	}
	
	
}
