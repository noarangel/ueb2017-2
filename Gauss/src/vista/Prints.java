package vista;

import java.util.Scanner;

/*
 * Esta clase nos servira de ayuda para pedir datos e imprimir por pantalla los pasos
 */
public class Prints {
	Scanner get; // Scanner para pedir los datos al usuario

	/*
	 * Inicializamos el scanner
	 */
	public Prints() {
		get = new Scanner(System.in);
	}

	/*
	 * Shorcut para System.out.print
	 */
	public void print(String cadena) {
		System.out.print(cadena);
	}

	/*
	 * Imprime la bienvenida al programa
	 */
	public void bienvenidaGauss() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|                  ELIMINACIÓN DE GAUSS                 |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Imprime la bienvenida al programa
	 */
	public void bienvenidaSuma() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|                    SUMA DE MATRICES                   |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Imprime la bienvenida al programa
	 */
	public void bienvenidaResta() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|                      RESTA DE MATRICES                |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Imprime la bienvenida al programa
	 */
	public void bienvenidaMultiplicacion() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|               MULTIPLICACIÓN DE MATRICES              |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Imprime la bienvenida al programa
	 */
	public void bienvenidaNuevaMatriz() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|                  INGRESE LA NUEVA MATRIZ              |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Imprime la bienvenida al programa
	 */
	public void respuesta() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|                	 	 RESPUESTA	 	 	            |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Pedimos la cantidad de variables al usuario. No avanzamos hasta tenerla
	 */
	public int pedirDimension() {
		this.print("Ingrese el número de variables del sistema: ");
		while (true) {
			try {
				String line = get.nextLine();
				return Integer.parseInt(line);
			} catch (Exception e) {
				this.print("Ingrese el número de variables del sistema: ");
			}
		}
	}

	/*
	 * Pedimos la demiensión de la primera matriz No avanzamos hasta tenerla
	 */
	public int[] pedirDimensiones() {
		this.print("Ingrese las dimensiones de la matriz separadas por coma \n");
		this.print("Por ejemplo 2,5 \n");

		while (true) {
			try {
				String line = get.nextLine();
				String[] valores = line.split(",");

				int[] dim = new int[2];
				dim[0] = Integer.parseInt(valores[0]);
				dim[1] = Integer.parseInt(valores[1]);

				return dim;
			} catch (Exception e) {
				this.print("Ingrese el número de variables del sistema: ");
			}
		}
	}

	/*
	 * Pedimos los datos separados por coma para cada fila. No avanzamos hasta
	 * tenerlos
	 */
	public Double[] pedirFila(int dim, int counter) {
		Double[] fila = new Double[dim + 1];
		this.print("Ingrese los valores de la fila " + counter + " separados por coma: ");
		while (true) {
			try {
				String line = get.nextLine();
				String[] valores = line.split(",");

				for (int iValor = 0; iValor <= dim; iValor++) {
					fila[iValor] = new Double(Double.parseDouble(valores[iValor].trim()));
				}

				return fila;
			} catch (Exception e) {
				this.print("Ingrese los valores de la fila " + counter + " separados por coma: ");
			}
		}
	}
}
