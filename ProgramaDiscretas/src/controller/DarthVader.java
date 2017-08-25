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
}
