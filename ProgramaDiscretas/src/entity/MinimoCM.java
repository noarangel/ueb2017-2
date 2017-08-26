package entity;

public class MinimoCM {
	
	public String obtenerMCM (int numero1, int numero2, int numero3) {
		
		String respuesta = "";
        int n1 = numero1;
        int n2 = numero2;
        int n3 = numero3;
        int maximo;
        int i;
 
        maximo = n1;
        if ( n2 > maximo )
            maximo = n2;
        if ( n3 > maximo )
            maximo = n3;
 
       
        i = maximo;
        
        while ((i % n1 != 0) || (i % n2 != 0) || (i % n3 != 0))
            i++;
        
        respuesta = "El mcm es: " + i;
        return respuesta;
  
    }
}

	
	
	
	
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
//
//}
