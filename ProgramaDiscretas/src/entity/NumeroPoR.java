package entity;

public class NumeroPoR {
	
	public int getDivisor(int eNumero) {
		
		String divisores = "";
		String cNumero ="";
		
		if (eNumero % 2 == 0) {			
			return 2;
		}

		double raiz = Math.sqrt(eNumero);
		for (int i = 3; i < raiz; i += 2) {
			if (eNumero % i == 0) {
				cNumero += Integer.toString(i);
				int numerito = Integer.parseInt(cNumero);
				return numerito;
			}
		}
		
		return 1;
		
	}
	
	public String divisores (int ecNumero) {
		
		int numero = this.getDivisor(ecNumero);
		String cCadenaN = Integer.toString(numero);
		String numeroF = "";
		String respuesta = "";	
		
		if (numero == 1) {
			
			respuesta = "El número es primo: " + numero + ", " + ecNumero;
			return respuesta;
			
		} else {
			for (int i = 0; i < cCadenaN.length(); i ++) {
				char letra = cCadenaN.charAt(i);
				numeroF = " " + letra + ", ";	
		}
		}
		
		respuesta = "Los divisores son: " + numeroF;
		return respuesta;
		
	}


}
