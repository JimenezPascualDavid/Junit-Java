package org.jimenezDavid.tema9.refactorizacion;

public class Prueba {
	public static void main(String[] args) {
		new Prueba().f();
	}

	private void f() {

		tema();

		dobleEspacio();

		refactorizacion();

	}

	public void tema() {
		encabezadoSuperior();
		System.out.println("TEMA 1. CONTROL de VERSIONES");

		encabezadoInferior();

		System.out.println("1. Conceptos generales");

		separador();

		System.out.println("2. Repositorio centralizado. SVN");
		separador();

		System.out.println("3. Repositorio distribuido. GIT");

		raya();

	}

	public void refactorizacion() {

		encabezadoSuperior();

		System.out.println("REFACTORIZACIÓN");

		encabezadoInferior();

		System.out.println("1. Bad smells");

		separador();

		System.out.println("2. Refactorizaciones habituales");
		separador();

		System.out.println("3. Refactorizando con Eclipse");

		rayados();
	}

	public void encabezadoSuperior() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

	public void encabezadoInferior() {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

	public void separador() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void raya() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

	public void rayados() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

	public void dobleEspacio() {

		System.out.println();
		System.out.println();

	}
}
