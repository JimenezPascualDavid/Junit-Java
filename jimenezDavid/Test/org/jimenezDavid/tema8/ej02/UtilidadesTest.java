package org.jimenezDavid.tema8.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.jimenezDavid.tema8.ej02.FechaException;
import org.jimenezDavid.tema8.ej02.Utilidades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UtilidadesTest {
	
	private Utilidades test;
	 
	@BeforeEach
	public void setUp() {
		test = new Utilidades();
	}
	@Test
	public void esFechaAnterior() throws FechaException {
		assertThrows(FechaException.class, ()->this.test.esFinDeSemana(2,8,1888));

	}
	
	@Test
	public void esFechaPosterior() throws FechaException {		
		assertThrows(FechaException.class, ()->this.test.esFinDeSemana(12,6,3010));
	}

	
	@Test
	public void esFinDeSemanaSabado() throws FechaException {		
		assertTrue(this.test.esFinDeSemana(13,6,2020));

	}
	
	@Test
	public void esFinDeSemanaDomingo() throws FechaException {		
		assertTrue(this.test.esFinDeSemana(28,6,2020));

	}
	
	@Test
	public void noesFinDeSemana() throws FechaException {
		assertFalse(this.test.esFinDeSemana(26,5,2020));

	}
	
	@Test
	public void esFechaLimite() throws FechaException {
		assertFalse(this.test.esFinDeSemana(1,1,1900));

	}
	
	@Test
	public void esFechaLimite1() throws FechaException {
		assertFalse(this.test.esFinDeSemana(1,1,3000));

	}
	

}



