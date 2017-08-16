package vista;

import java.util.Scanner;

/*
 * Esta clase nos servira de ayuda para pedir datos e imprimir por pantalla los pasos
 */
public class Prints {
	Scanner get;						// Scanner para pedir los datos al usuario

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
	public void bienvenida() {
		this.print("+-------------------------------------------------------+\n");
		this.print("|                  ELIMINACIÓN DE GAUSS                 |\n");
		this.print("+-------------------------------------------------------+\n");
	}

	/*
	 * Pedimos la cantidad de variables al usuario.
	 * No avanzamos hasta tenerla
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
	 * Pedimos los datos separados por coma para cada fila.
	 * No avanzamos hasta tenerlos
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
