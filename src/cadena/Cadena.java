package cadena;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}

	public int vocales(String cadena) {
		int counter = 0;
		for (char c : cadena.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				counter++;
			}
		}
		return counter;
	}

	public String invertir(String cadena) {
		StringBuilder sb = new StringBuilder(cadena);
		sb.reverse();
		return sb.toString();
	}

	public int contarLetra(String cadena, char caracter) {
		int counter = 0;
		for (char c : cadena.toCharArray()) {
			if (c == caracter) {
				counter++;
			}
		}
		return counter;
	}

	
	
}
