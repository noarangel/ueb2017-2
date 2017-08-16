package main;

import controlador.Controller;

public class Main {

	/*
	 * Clase principal, instancia el controlador y lo ejecuta
	 */
	public static void main(String[] args) {
		Controller ctl = new Controller();
		ctl.simplificacionGauss();
	}

}
