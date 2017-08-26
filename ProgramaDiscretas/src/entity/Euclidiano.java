package entity;

public class Euclidiano {

	public String mcd (int eDividendo, int eDivisor) {
		
		String respuesta = "";

		if (eDividendo > eDivisor) {
			int cociente = (eDividendo / eDivisor);
			int residuo = (eDividendo % eDivisor);

			do {
				if (residuo != 0) {

					eDividendo = eDivisor;
					eDivisor = residuo;

					cociente = (eDividendo / eDivisor);
					residuo = (eDividendo % eDivisor);

				}
			} while (residuo != 0);
			
				respuesta = "El MCD es " + eDivisor;

		}
		
		return respuesta;
	}
}
