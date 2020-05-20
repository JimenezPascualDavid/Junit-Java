package org.jimenezDavid.tema8.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.jimenezDavid.tema8.ej02.FechaException;
import org.jimenezDavid.tema8.ej02.Utilidades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UtilidadesTest {
	
	private Utilidades utils;
	
	@BeforeEach
	public void setUp() {
		this.utils = new Utilidades();
	}
	
	@Test
	public void esFinDeSemana1() throws FechaException {		
		assertTrue(this.utils.esFinDeSemana(13,6,2020));

	}
	
	@Test
	public void esFinDeSemana2() throws FechaException {		
		assertTrue(this.utils.esFinDeSemana(28,6,2020));

	}
	
	@Test
	public void esFinDeSemana3() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(26,5,2020));

	}
	
	@Test
	public void esFinDeSemana4() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(1,1,1900));

	}
	
	@Test
	public void esFinDeSemana5() throws FechaException {
		assertFalse(this.utils.esFinDeSemana(1,1,3000));

	}
	
	@Test
	public void esFinDeSemana6() throws FechaException {
		assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(2,8,1888));

	}
	
	@Test
	public void esFinDeSemana7() throws FechaException {		
		assertThrows(FechaException.class, ()->this.utils.esFinDeSemana(12,6,3010));
	}

}



