package controller;

import entity.*;

public class DarthVader {

	// Instancias
	private UnidadesDC udc;
	private DivisoresEI divisores;
	private NumeroPoR por;
	private Euclidiano mcd;
	private MinimoCM mcm;
	private BinaryToInteger bti;
	private IntegerToBinary itb; 

	// constructor
	public DarthVader() {
		udc = new UnidadesDC();
		divisores = new DivisoresEI();
		por = new NumeroPoR();
		mcd = new Euclidiano();
		mcm = new MinimoCM();
		bti = new BinaryToInteger();
		itb = new IntegerToBinary();
	}

	// Metodos

	public String enviarDatosUDC(String numeroC) {

		String respuesta = udc.verificaUDC(numeroC);
		return respuesta;
	}

	public String enviarDatosDivisor(int cDividendo, int cDivisor) {
		String respuesta = divisores.rDivisores(cDividendo, cDivisor);
		return respuesta;
	}
	
	public String EnviarDatosDivisores (int cNumero) {
		String respuesta = por.divisores(cNumero);
		return respuesta;
	}
	
	public String enviarDatosEuclidiano (int cDividendo, int cDivisor) {
		String respuesta = mcd.mcd(cDividendo, cDivisor);
		return respuesta;		
	}
	
	public String enviarDatosMinimoCM (int cNumero1, int cNumero2, int cNumero3){
		String respuesta = mcm.obtenerMCM(cNumero1, cNumero2, cNumero3);
		return respuesta;
		
	}
	
	public String EnviarDatosBinToDec (String cNumero) {
		String respuesta = ""+ bti.binaryToInteger(cNumero);
		return respuesta;
	}
	
	public String enviarDatosDecToBin (int cNumero) {
		String respuesta = itb.integerToBinary(cNumero);
		return respuesta;
	}

	
//
//
//	public int getDivisor(int numero) {
//		if (numero % 2 == 0) {
//			return 2;
//		}
//
//		double raiz = Math.sqrt(numero);
//		for (int i = 3; i < raiz; i += 2) {
//			if (numero % i == 0) {
//				return i;
//			}
//		}
//
//		return 1;
//	}
//
//	public boolean areAllOne(int[] numeros) {
//		for (int i = 0; i < numeros.length; i++) {
//			if (numeros[i] != 1) {
//				return false;
//			}
//		}
//
//		return true;
//	}
//
//	public int minimoComunMultiplo(int[] numeros) {
//
//		int divisor;
//		int MCM = 1;
//
//		while (areAllOne(numeros) == false) {
//
//			for (int i = 0; i < numeros.length; i++) {
//				divisor = getDivisor(numeros[i]);
//
//				if (divisor != 1) {
//
//					for (int k = 0; k < numeros.length; k++) {
//						numeros[k] = (numeros[k] % divisor == 0) ? (int) (numeros[k] / divisor) : numeros[k];
//					}
//
//					MCM *= divisor;
//				}
//
//				else if (divisor == 1) {
//					divisor = numeros[i];
//
//					for (int k = 0; k < numeros.length; k++) {
//						numeros[k] = (numeros[k] % divisor == 0) ? (int) (numeros[k] / divisor) : numeros[k];
//					}
//
//					MCM *= divisor;
//				}
//
//			}
//
//		}
//
//		return MCM;
//	}
}
