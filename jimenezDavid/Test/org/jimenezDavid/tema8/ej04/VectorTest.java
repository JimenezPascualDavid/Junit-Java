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
		public void ordenar() throws InputDataException{
			
			int[] array = {6,2,8,4,1,7};
			int[] colocado = {1,2,4,6,7,8};
			int[] resultado = this.vector.ordenar(array);
			
		
			assertArrayEquals(colocado, resultado, "arrays identicas");
		}
		
		@Test
		public void ordenar1() throws InputDataException{
		
			int[] array ;
			array=null;
		
			assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
		}
		
		@Test
		public void ordenar2() throws InputDataException{
			
			int[] array = {};
			
		
			assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
		}
		
		@Test
		public void ordenarTres() throws InputDataException{
		
			int[] array = new int[7421];
			for(int i=0; i<7421; i++) {
				array[i] = i;
			}

		
			assertThrows(InputDataException.class, ()->this.vector.ordenar(array));
		}
	}


