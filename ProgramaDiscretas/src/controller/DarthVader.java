package controller;

import entity.*;

public class DarthVader {

	static final int BASE = 2;

	// Instancias
	private UnidadesDC udc;

	// constructor
	public DarthVader() {
		udc = new UnidadesDC();
	}

	// Metodos
	public String enviarDatosUDC(String numeroC) {
		String respuesta = udc.verificaUDC(numeroC);
		return respuesta;
	}

	// Conversión de base decimal a binario
	public String integerToBinary(int input) {
		String cadena = "";
		String inversa = "";

		int dividendo = input;

		if (dividendo == 1) {
			return "1";
		}

		if (dividendo == 0) {
			return "0";
		}

		int residuo = 0;
		while (dividendo >= 1) {
			residuo = dividendo % BASE;
			dividendo = (int) (dividendo / BASE);
			cadena += String.valueOf(residuo);
		}

		int length = cadena.length();

		for (int i = length - 1; i >= 0; i--) {
			inversa += cadena.charAt(i);
		}

		return inversa;
	}

	// Conversión de binario a base decimal
	public int binaryToInteger(String input) {

		int entero = 0;
		int length = input.length();

		for (int i = 0; i < length; i++) {
			entero += (int) (Character.getNumericValue(input.charAt(i)) * Math.pow(BASE, length - i - 1));
		}

		return entero;

	}

	public int getDivisor(int numero) {
		if (numero % 2 == 0) {
			return 2;
		}

		double raiz = Math.sqrt(numero);
		for (int i = 3; i < raiz; i += 2) {
			if (numero % i == 0) {
				return i;
			}
		}

		return 1;
	}

	public boolean areAllOne(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] != 1) {
				return false;
			}
		}

		return true;
	}

	public int minimoComunMultiplo(int[] numeros) {

		int divisor;
		int MCM = 1;

		while (areAllOne(numeros) == false) {

			for (int i = 0; i < numeros.length; i++) {
				divisor = getDivisor(numeros[i]);

				if (divisor != 1) {

					for (int k = 0; k < numeros.length; k++) {
						numeros[k] = (numeros[k] % divisor == 0) ? (int) (numeros[k] / divisor) : numeros[k];
					}

					MCM *= divisor;
				}

				else if (divisor == 1) {
					divisor = numeros[i];

					for (int k = 0; k < numeros.length; k++) {
						numeros[k] = (numeros[k] % divisor == 0) ? (int) (numeros[k] / divisor) : numeros[k];
					}

					MCM *= divisor;
				}

			}

		}

		return MCM;
	}
}
