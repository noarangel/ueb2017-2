package main;

import controlador.ControllerGauss;

public class Main {

	/*
	 * Clase principal, instancia el controlador y lo ejecuta
	 */
	public static void main(String[] args) {
		ControllerGauss ctl = new ControllerGauss();
		ctl.simplificacionGauss();
	}

}
