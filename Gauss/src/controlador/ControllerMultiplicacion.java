package controlador;

import matrix.Matriz;
import vista.Prints;

public class ControllerMultiplicacion {

	Prints vista;
	Matriz matrizA;
	Matriz matrizB;
	Matriz matrizC;

	int dimX;
	int dimY;

	/*
	 * Instanciamos la vista
	 */
	public ControllerMultiplicacion() {
		this.vista = new Prints();
	}

	public boolean iniciarLasMatrices() {
		int[] dim = vista.pedirDimensiones("uno");
		this.dimX = dim[0];
		this.dimY = dim[1];

		// Instanciar la matriz A
		this.matrizA = new Matriz(this.dimX, this.dimY);

		dim = vista.pedirDimensiones("dos");
		this.dimX = dim[0];
		this.dimY = dim[1];

		// Instanciar la matriz B
		this.matrizB = new Matriz(this.dimX, this.dimY);

		if (this.matrizA.getDimY() != this.matrizB.getDimX()) {
			this.vista.print("Estas matrices no se pueden multiplicar\n\n");
			return false;
		}

		// Instanciar la matriz C
		this.matrizC = new Matriz(this.matrizA.getDimX(), this.matrizB.getDimY());
		return true;
	}

	public void inicializarA() {
		vista.bienvenidaNuevaMatriz();
		this.vista.print(this.matrizA.printMatriz()); // Imprimir la matriz inicial

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matrizA.getDimX(); iFila++) {
			this.matrizA.setFila(iFila, this.vista.pedirFila(this.matrizA.getDimY(), iFila));
		}
		this.vista.print(this.matrizA.printMatriz());
	}

	public void inicializarB() {
		vista.bienvenidaNuevaMatriz();
		this.vista.print(this.matrizB.printMatriz()); // Imprimir la matriz inicial

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matrizB.getDimX(); iFila++) {
			this.matrizB.setFila(iFila, this.vista.pedirFila(this.matrizB.getDimY(), iFila));
		}
		this.vista.print(this.matrizB.printMatriz());
	}

	/*
	 * Controlador de multiplicacion
	 */
	public void multiplicar() {
		this.vista.bienvenidaMultiplicacion(); // Mensaje de bienvenida

		if (this.iniciarLasMatrices() != true) { // iniciamos las dimensiones
			return;
		}

		this.inicializarA();
		this.inicializarB();

		this.matrizA.multiplicar(this.matrizB, this.matrizC);

		this.vista.respuesta();
		this.vista.print(this.matrizC.printMatriz());
	}

}
