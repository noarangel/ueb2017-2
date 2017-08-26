package entity;

public class IntegerToBinary {

	static final int BASE = 2;

	public String integerToBinary(int eNumero) {
		String cadena = "";
		String inversa = "";

		int dividendo = eNumero;

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

}
