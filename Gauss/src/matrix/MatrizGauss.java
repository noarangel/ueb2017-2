package matrix;

import java.util.List;

/*
 * Esta clase se encarga de las operaciones directas sobre la matriz.
 * Al igual que generar los strings de impresión por partalla de la matriz
 */
public class MatrizGauss {

	
	int DIM;				// dimension del sistema N x N+1
	Double[][] matriz;		// Puntero a la matriz requiere Double para tamaño dinámico

	/*
	 * Constructor: requiere el tamaño N para la dimensión de la matriz
	 */
	public MatrizGauss(int dim) {
		this.DIM = dim;
		this.matriz = new Double[this.DIM][this.DIM + 1];

		for (int iFila = 0; iFila < this.DIM; iFila++) {
			for (int iColumna = 0; iColumna <= this.DIM; iColumna++) {
				this.matriz[iFila][iColumna] = new Double(0);
			}
		}
	}

	/*
	 * Función de retorno de la dimensión
	 */
	public int getDim() {
		return this.DIM;
	}

	/*
	 * Esta función llena la matriz una fila a la vez
	 */
	public void setFila(int posicion, Double[] fila) {
		for (int iColumna = 0; iColumna <= this.DIM; iColumna++) {
			this.matriz[posicion][iColumna] = fila[iColumna];
		}
	}

	/*
	 * Detectamos el primer valor no cero de la columna y retornamos su número de fila
	 * Si todos son cero, retornamos -1
	 */
	public int getFilaPivote(int iColumna) {
		Double ZERO = new Double(0);
		for (int iFila = iColumna; iFila < this.DIM; iFila++) {
			if (!this.matriz[iColumna][iFila].equals(ZERO)) {
				return iFila;
			}
		}
		return -1;
	}

	/*
	 * Intercambiamos dos filas de la matriz, pensado para columnas con cero en el pivote
	 */
	public void swapFilas(int iFila, int pivote) {
		Double[] tmp = new Double[this.DIM + 1];

		for (int iColumna = 0; iColumna <= this.DIM; iColumna++) {
			tmp[iColumna] = matriz[iFila][iColumna];
			matriz[iFila][iColumna] = matriz[pivote][iColumna];
			matriz[pivote][iColumna] = tmp[iColumna];
		}
	}

	/*
	 * Hallamos el inverso del pivote y simplificamos la fila
	 */
	public double simplificarFila(int index) {
		double inverso = 1 / this.matriz[index][index].doubleValue();
		for (int iColumna = index; iColumna <= this.DIM; iColumna++) {
			this.matriz[index][iColumna] = new Double(this.matriz[index][iColumna].doubleValue() * inverso);
		}
		return inverso;
	}

	/*
	 * Multiplicamos una fila con lo necesario para anular las columnas del pivote y se lo sumamos
	 */
	public double reduce(int index, int iFila) {
		double pivote = -1 * this.matriz[iFila][index].doubleValue() / this.matriz[index][index].doubleValue();

		if (pivote == 0) {
			return 0;
		}
		for (int iColumna = index; iColumna <= this.DIM; iColumna++) {
			if (iFila != index) {
				this.matriz[iFila][iColumna] = new Double(this.matriz[iFila][iColumna].doubleValue()
						+ this.matriz[index][iColumna].doubleValue() * pivote);
			}
		}
		return pivote;
	};

	/*
	 * Auxiliar para generar cada string de filas de la matriz
	 */
	public String printFila(int iFila) {
		String cadena = " [ ";

		for (int iColumna = 0; iColumna <= this.DIM; iColumna++) {
			cadena += this.matriz[iFila][iColumna];

			if (iColumna != this.DIM) {
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

		for (int iFila = 0; iFila < this.DIM; iFila++) {
			cadena += this.printFila(iFila);
		}

		return cadena += "]\n\n";
	}

}
