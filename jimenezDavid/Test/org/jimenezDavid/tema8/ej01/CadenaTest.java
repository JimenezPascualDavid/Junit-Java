package org.jimenezDavid.tema8.ej01;
	import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jimenezDavid.tema8.ej01.Cadena;
import org.junit.Test;

	public class CadenaTest {
  
		@Test
		public void cDelante() {
		
			Cadena primeraCadena = new Cadena("porta");

			primeraCadena.cDelante("monedas");

			assertEquals("portamonedas", primeraCadena.getCadena(), "porta+monedas=portamonedas");
		}

		@Test
		public void cDetras() {
		
			Cadena SegundaCadena = new Cadena("monedas");

			SegundaCadena.cDetras("porta");

			assertEquals("monedasporta", SegundaCadena.getCadena(), "monedas+porta=monedasporta");
		}

		@Test
		public void quitarChar() {
		
			Cadena terceraCadena = new Cadena("-c-");

			terceraCadena.quitar('c');

			assertEquals("--", terceraCadena.getCadena());
		}

		@Test
		public void quitarCharInt() {
		
			Cadena cuartaCadena = new Cadena("-1c-2c-3c-");

			cuartaCadena.quitar('c',1);

			assertEquals("-1-2c-3c-", cuartaCadena.getCadena());
		}

	}
