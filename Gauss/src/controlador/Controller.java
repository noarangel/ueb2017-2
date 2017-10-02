package controlador;

import vista.Prints;

public class Controller {

	Prints vista;

	public Controller() {
		this.vista = new Prints();
	}

	public void start() {

		while (true) {
			this.vista.menu();
			int opcion = this.vista.pedirOpcion();

			switch (opcion) {
			case 1: {
				ControllerSuma ctl = new ControllerSuma();
				ctl.sumar();
				break;
			}

			case 2: {
				ControllerResta ctl = new ControllerResta();
				ctl.restar();
				break;
			}
			case 3: {
				ControllerMultiplicacion ctl = new ControllerMultiplicacion();
				ctl.multiplicar();
				break;
			}
			case 4: {
				ControllerGauss ctl = new ControllerGauss();
				ctl.simplificacionGauss();
				break;
			}
			}
		}
	}
}
