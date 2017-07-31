package controlador;

import entidad.*;

public class DarthVader {
	Longitud longitud = new Longitud();
	Masa masa = new Masa();
	Tiempo tiempo = new Tiempo();

	// Metodos

	/**Conversiones Longitud*/
	public double ConvertirL(int opcionV, double valorV, int opcionAV) {
		double valorC = 0;
		switch (opcionV) {
			case 1:
				switch (opcionAV) {
					case 1:
						valorC = valorV;
						break;
					case 2:
						valorC = this.longitud.cMetroADecaM(valorV);
						break;
					case 3:
						valorC = this.longitud.cMetroAdeciM(valorV);
						break;
					default:
						System.out.println("Opción inválida inténtelo de nuevo \n");
						break;
				}
				break;
			case 2:
				switch (opcionAV) {
					case 1:
						valorC = this.longitud.cDecaMAMetro(valorV);
						break;
					case 2: 
						valorC = valorV;
						break;
					case 3:
						valorC = this.longitud.cDecaMAdeciM(valorV);
						break;
					default:
						System.out.println("Opción inválida inténtelo de nuevo \n");
						break;
				}
				break;
			case 3: 
				switch (opcionAV) {
					case 1: 
						valorC = this.longitud.cdeciMAMetro(valorV);
						break;
					case 2:
						valorC = this.longitud.cdeciMADecaM(valorV);
						break;
					case 3:
						valorC = valorV;
						break;
					default:
						System.out.println("Opción inválida inténtelo de nuevo \n");
						break;
				}
				break;
			default:
				System.out.println("Opción inválida inténtelo de nuevo \n");
				break;
		}
		return valorC;
	}
	
	/**Conversiones Tiempo*/
	public double ConvertirT (int opcionV, double valorV, int opcionAV){
		double valorC = 0;
		switch (opcionV) {
			case 1:
				switch (opcionAV) {
					case 1:
						valorC = valorV;
						break;
					case 2:
						valorC = this.tiempo.cHoraAMinuto(valorV);
						break;
					case 3:
						valorC = this.tiempo.cHoraASegundo(valorV);
						break;
				}
				break;
			case 2:
				switch (opcionAV) {
					case 1:
						valorC = this.tiempo.cMinutoAHora(valorV);
						break;
					case 2: 
						valorC = valorV;
						break;
					case 3:
						valorC = this.tiempo.cMinutoASegundo(valorV);
						break;
				}
				break;
			case 3: 
				switch (opcionAV) {
					case 1: 
						valorC = this.tiempo.cSegundoAHora(valorV);
						break;
					case 2:
						valorC = this.tiempo.cSegundoAMinuto(valorV);
						break;
					case 3:
						valorC = valorV;
						break;
				}
				break;
		}
		return valorC;
	}
	
	/**Conversiones Masa*/
	public double ConvertirM (int opcionV, double valorV, int opcionAV){
		double valorC = 0;
		switch (opcionV) {
			case 1:
				switch (opcionAV) {
					case 1:
						valorC = valorV;
						break;
					case 2:
						valorC = this.masa.cGramoAmilliG(valorV);
						break;
					case 3:
						valorC = this.masa.cGramoAKiloG(valorV);
						break;
				}
				break;
			case 2:
				switch (opcionAV) {
					case 1:
						valorC = this.masa.cmiliGAGramo(valorV);
						break;
					case 2: 
						valorC = valorV;
						break;
					case 3:
						valorC = this.masa.cmiliGAKiloG(valorV);
						break;
				}
				break;
			case 3: 
				switch (opcionAV) {
					case 1: 
						valorC = this.masa.cKiloGAGramo(valorV);
						break;
					case 2:
						valorC = this.masa.cKiloGAmiliG(valorV);
						break;
					case 3:
						valorC = valorV;
						break;
				}
				break;
		}
		return valorC;
	}
	
	
}
