package entity;

public class BinaryToInteger {
	
	static final int BASE = 2;
	
	// Conversión de binario a base decimal
	public int binaryToInteger(String eNumero) {

		int entero = 0;
		int length = eNumero.length();

		for (int i = 0; i < length; i++) {
			entero += (int) (Character.getNumericValue(eNumero.charAt(i)) * Math.pow(BASE, length - i - 1));
		}
		
		System.out.println(entero);
		
		return entero;

	}

}
