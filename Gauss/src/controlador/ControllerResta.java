package controlador;

import matrix.Matriz;
import vista.Prints;

public class ControllerResta {

	Prints vista;
	Matriz matrizA;
	Matriz matrizB;
	Matriz matrizC;

	int dimX;
	int dimY;

	/*
	 * Instanciamos la vista
	 */
	public ControllerResta() {
		this.vista = new Prints();
	}

	public void iniciarLasMatrices() {
		int[] dim = vista.pedirDimensiones("");
		this.dimX = dim[0];
		this.dimY = dim[1];

		this.matrizA = new Matriz(this.dimX, this.dimY); // Instanciar la matriz A
		this.matrizB = new Matriz(this.dimX, this.dimY); // Instanciar la matriz B
		this.matrizC = new Matriz(this.dimX, this.dimY); // Instanciar la matriz C
	}

	public void inicializarA() {
		vista.bienvenidaNuevaMatriz();
		
		// Imprimir la matriz inicial
		this.vista.print(this.matrizA.printMatriz()); 

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matrizA.getDimX(); iFila++) {
			this.matrizA.setFila(iFila, this.vista.pedirFila(this.matrizA.getDimY(), iFila));
		}
		this.vista.print(this.matrizA.printMatriz());
	}

	public void inicializarB() {
		vista.bienvenidaNuevaMatriz();
		
		// Imprimir la matriz inicial
		this.vista.print(this.matrizB.printMatriz()); 

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matrizB.getDimX(); iFila++) {
			this.matrizB.setFila(iFila, this.vista.pedirFila(this.matrizB.getDimY(), iFila));
		}
		this.vista.print(this.matrizB.printMatriz());
	}

	/*
	 * Controlador de multiplicacion
	 */
	public void restar() {
		this.vista.bienvenidaResta(); // Mensaje de bienvenida
		this.iniciarLasMatrices(); // iniciamos las dimensiones

		this.inicializarA();
		this.inicializarB();

		this.matrizA.restar(this.matrizB, this.matrizC);

		this.vista.respuesta();
		this.vista.print(this.matrizC.printMatriz());
	}

}
