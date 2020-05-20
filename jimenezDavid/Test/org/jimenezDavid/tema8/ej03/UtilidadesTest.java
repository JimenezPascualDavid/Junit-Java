package org.jimenezDavid.tema8.ej03;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jimenezDavid.tema8.ej03.NumeroException;
import org.jimenezDavid.tema8.ej03.Utilidades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UtilidadesTest {

	private Utilidades utilidades;
	
	@BeforeEach
	public void setUp() {
		this.utilidades = new Utilidades();
	}

	@Test
	public void esPrimo1() throws NumeroException {
		assertThrows(NumeroException.class, ()-> this.utilidades.esPrimo(-123), "numero: -123 muestra NumeroException");
	}

	@Test
	public void esPrimo2() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(0), "numero: 0 no es primo");
	}

	@Test
	public void esPrimo3() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(1), "numero: 1  no es primo");
	}

	@Test
	public void esPrimo4() throws NumeroException {
		assertTrue(this.utilidades.esPrimo(999983), "numero: 999983 es primo");
	}

	@Test
	public void esPrimo5() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(5487), "numero: 5487  es primo");
	}
	
	@Test
	public void esPrimo7() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(977), "numero: 977  es primo");
	}
	@Test
	public void esPrimo08() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(999999), "numero: 999999 no  es primo");
	}
	@Test
	public void esPrimo9() throws NumeroException {
		assertFalse(this.utilidades.esPrimo(1000000), "numero: 1000000 no es primo");
	}
	@Test
	public void esPrimo10() throws NumeroException {
		assertThrows(NumeroException.class, ()-> this.utilidades.esPrimo(1003211), "numero: 1003211 muestra NumeroException");
	}
	
}
