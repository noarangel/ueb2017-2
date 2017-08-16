package controlador;

import matrix.Matriz;
import vista.Prints;

/*
 * Clase que orquesta las demás y ejecuta la lógica de simplificación de Gauss
 */
public class Controller {

	Prints vista;
	Matriz matriz;

	/*
	 * Instanciamos la vista
	 */
	public Controller() {
		this.vista = new Prints();
	}

	/*
	 * Función de simplificación
	 */
	public void simplificacionGauss() {
		int paso = 1;										// Contador para pasos
		this.vista.bienvenida();							// Mensaje de bienvenida
		
		this.matriz = new Matriz(vista.pedirDimension()); 	// Pedir dimension del sistema e instanciar la matriz
		vista.print("\nMatriz sin datos: ");
		this.vista.print(matriz.printMatriz());				// Imprimir la matriz inicial

		// Pedir todas las filas del sistema
		for (int iFila = 0; iFila < this.matriz.getDim(); iFila++) {
			this.matriz.setFila(iFila, this.vista.pedirFila(this.matriz.getDim(), iFila));
		}
		vista.print("\nMatriz con datos: ");
		this.vista.print(this.matriz.printMatriz());		// Imprimir la matriz llena

		int filaPivote;										// Fila objetivo para anular las demás, no puede tener cero en el pivote
		double inverso, pivote;								// inverso del numero pivote, valor del pivote para las demas filas
		
		// Iteración sobre cada fila de la matriz
		for (int iFila = 0; iFila < this.matriz.getDim(); iFila++) {
			
			filaPivote = this.matriz.getFilaPivote(iFila);	// Verificamos que en (iFila,iFila) no haya cero

			// Si no pudo encontrar un valor diferente de cero para hacerlo la fila pivote 
			if (filaPivote == -1) {
				this.vista.print("PASO: "+ paso +", Este sistema no tiene una única solución\n");
				this.vista.print(this.matriz.printMatriz());
				System.exit(0);
			}

			// Si la filaPivote encontrada es distinta de la fila actual las intercambiamos
			else if (filaPivote != iFila) {
				this.matriz.swapFilas(iFila, filaPivote);
				vista.print("PASO: "+ paso +", Intercambiamos la fila " + (iFila + 1) + " por la fila " + (filaPivote + 1));
				vista.print(this.matriz.printMatriz());
				paso++;
			}

			// Invertimos el pivote para hacerlo 1
			inverso = this.matriz.simplificarFila(iFila);
			if (inverso != 1) {
				vista.print("PASO: "+ paso +", Simplificamos la fila " + (iFila + 1) + " multiplicando por " + inverso);
				vista.print(this.matriz.printMatriz());
				paso++;
			}

			// Pivoteamos las demas filas
			for (int eFila = 0; eFila < this.matriz.getDim(); eFila++) {
				if (eFila != iFila) {
					
					// el pivote es el inverso aditivo de las demás columnas, si es cero lo omitimos
					// en caso contrario le sumamos al otra fila el valor de la fila actual multiplicada por dicho inverso
					pivote = this.matriz.reduce(iFila, eFila);
					if (pivote != 0) {
						vista.print("PASO: "+ paso +", Sumamos a la fila " + (eFila + 1) + " la fila " + (iFila + 1)
								+ " multiplicanda por " + pivote);
						vista.print(this.matriz.printMatriz());
						paso++;
					}
				}
			}

		}
	}

}
