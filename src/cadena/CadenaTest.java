package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	Cadena c = new Cadena();
	String v = "Verga";
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLongitud() {
		int expected = 5;
		int actual = c.longitud(v);
		assertEquals(expected, actual, "Error");
	}

	@Test
	void testVocales() {
		int expected = 2;
		int actual = c.vocales(v);
		assertEquals(expected, actual, "Error");
	}

	@Test
	void testInvertir() {
		String expected = "agreV";
		String actual = c.invertir(v);
		assertEquals(expected, actual, "Error");
	}

	@Test
	void testContarLetra() {
		int expected = 1;
		int actual = c.contarLetra(v, 'g');
		assertEquals(expected, actual, "Error");
	}

}
