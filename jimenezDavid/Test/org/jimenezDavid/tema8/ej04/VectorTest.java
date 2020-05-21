package org.jimenezDavid.tema8.ej04;

import static org.junit.jupiter.api.Assertions.*;

import org.jimenezDavid.tema8.ej04.InputDataException;
import org.jimenezDavid.tema8.ej04.Vector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	public class VectorTest {

		private Vector vector;
		
		@BeforeEach
		public void setUp() {
			this.vector = new Vector();
		}
		
		@Test
		public void ordenarcero() throws InputDataException{
			
			int[] array = {6,2,8,4,1,7};
			int[] ordenado = {1,2,4,6,7,8};
			
		
			assertArrayEquals(ordenado, Vector.ordenar(array));
		}
		
		
		
		@Test
		public void ordenarUno() throws InputDataException{
		
			int[] array ;
			array=null;
		
			assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
		}
		
		@Test
		public void ordenarDos() throws InputDataException{
			
			int[] array = null;
			
		 
			assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
		}
		
		@Test
		void OrdenarTres() throws InputDataException {
			int[] resultado = new int[] {584,694,333,9092,892};
			int[] resultadoEsperado = new int[] {333,584,694,892,9092};
			assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
		}
		@Test
		void OrdenarCuatro() throws InputDataException {
			int[] resultado = new int[] {12,5,25,6};
			int[] resultadoEsperado = new int[] {5,6,12,25};
			assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
		}
		@Test
		void OrdenarCinco() throws InputDataException {
			int[] resultado = new int[] {10,1,23};
			int[] resultadoEsperado = new int[] {1,10,23};
			assertArrayEquals(resultadoEsperado, this.vector.ordenar(resultado));
		}
		@Test
		public void ordenarSeis() throws InputDataException{
		
			int[] array = new int[7421];
			for(int i=0; i<7421; i++) {
				array[i] = i;
			}

			assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
		}
	}


