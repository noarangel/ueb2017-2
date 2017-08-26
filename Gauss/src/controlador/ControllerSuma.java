package controlador;

import matrix.Matriz;
import vista.Prints;

public class ControllerSuma {

	Prints vista;
	Matriz matrizA;
	Matriz matrizB;
	Matriz matrizC;

	int dimX;
	int dimY;

	/*
	 * Instanciamos la vista
	 */
	public ControllerSuma() {
		this.vista = new Prints();
	}
	
	public void iniciarLasMatrices(){
		int[] dim = vista.pedirDimensiones();
		this.dimX = dim[0];
		this.dimY = dim[1];
		
		this.matrizA = new Matriz(this.dimX,this.dimY); 	// Instanciar la matriz A
		this.matrizB = new Matriz(this.dimX,this.dimY); 	// Instanciar la matriz B
		this.matrizC = new Matriz(this.dimX,this.dimY); 	// Instanciar la matriz C
	}
	
	public void inicializarA() {
		vista.bienvenidaNuevaMatriz();
		this.vista.print(this.matrizA.printMatriz());				// Imprimir la matriz inicial

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matrizA.getDimX(); iFila++) {
			this.matrizA.setFila(iFila, this.vista.pedirFila(this.matrizA.getDimX(), iFila));
		}
		this.vista.print(this.matrizB.printMatriz());
	}
	
	
	public void inicializarB() {
		vista.bienvenidaNuevaMatriz();
		this.vista.print(this.matrizB.printMatriz());				// Imprimir la matriz inicial

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matrizB.getDimX(); iFila++) {
			this.matrizB.setFila(iFila, this.vista.pedirFila(this.matrizB.getDimX(), iFila));
		}
		this.vista.print(this.matrizB.printMatriz());
	}
	
	/*
	 * Función de suma
	 */
	public void sumarMatrices() {
		this.vista.bienvenidaSuma(); 			// Mensaje de bienvenida
		this.iniciarLasMatrices();				// iniciamos las dimensiones
		
		this.inicializarA();
		this.inicializarB();
		
		this.matrizA.sumar(this.matrizB, this.matrizC);
		
		
	}
	
	
}
