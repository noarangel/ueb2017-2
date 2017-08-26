package matrix;

public class Matriz {

	int dimX; // numero de columnas
	int dimY; // numero de filas

	Double[][] matriz; // Puntero a la matriz requiere Double para tamaño dinámico

	/*
	 * Constructor: requiere los tamanños de la matriz
	 */
	public Matriz(int dimX, int dimY) {
		this.dimX = dimX;
		this.dimY = dimY;
		this.matriz = new Double[this.dimX][this.dimY];

		for (int iFila = 0; iFila < this.dimY; iFila++) {
			for (int iColumna = 0; iColumna < this.dimX; iColumna++) {
				this.matriz[iFila][iColumna] = new Double(0);
			}
		}
	}

	/*
	 * Función de retorno de la dimensión X
	 */
	public int getDimX() {
		return this.dimX;
	}

	/*
	 * Función de retorno de la dimensión Y
	 */
	public int getDimY() {
		return this.dimY;
	}
	
	public double getValue(int x, int y) {
		return this.matriz[x][y].doubleValue();
	}
	
	/*
	 * Función de retorno de la dimensión Y
	 */
	public void setValue(int x,int y, double value) {
		this.matriz[x][y] = new Double(value);
	}

	/*
	 * Esta función llena la matriz una fila a la vez
	 */
	public void setFila(int posicion, Double[] fila) {
		for (int iColumna = 0; iColumna <= this.dimY; iColumna++) {
			this.matriz[posicion][iColumna] = fila[iColumna];
		}
	}

	public void sumar(Matriz otra, Matriz respuesta) {
		for (int iFila = 0; iFila < this.dimY; iFila++) {
			for (int iColumna = 0; iColumna < this.dimX; iColumna++) {
				respuesta.setValue(iFila, iColumna, this.getValue(iFila,iColumna) +
						otra.getValue(iFila,iColumna));
			}
		}
	}

	/*
	 * Auxiliar para generar cada string de filas de la matriz
	 */
	public String printFila(int iFila) {
		String cadena = " [ ";

		for (int iColumna = 0; iColumna < this.dimX; iColumna++) {
			cadena += this.matriz[iFila][iColumna];

			if (iColumna != this.dimX) {
				cadena += ", ";
			}

		}

		return cadena += " ]\n";
	}

	/*
	 * Genera el string necesario para imprimir la matriz
	 */
	public String printMatriz() {
		String cadena = "\n[\n";

		for (int iFila = 0; iFila < this.dimY; iFila++) {
			cadena += this.printFila(iFila);
		}

		return cadena += "]\n\n";
	}

}
