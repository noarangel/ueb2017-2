package entidad;

public class Masa {

	// Atributos
	/**Cada valor de las unidades es el equivalente a un (1) gramo*/

	private static double GRAMO = 1;
	private static double MILIGRAMO = 1000;
	private static double KILOGRAMO = 0.001;

	// Constructor
	public Masa() {

	}

	// Getter´s
	/** No se coloca Setter´s porque no van a variar los valores */
	public static double getGRAMO() {
		return GRAMO;
	}

	public static double getMILIGRAMO() {
		return MILIGRAMO;
	}

	public static double getKILOGRAMO() {
		return KILOGRAMO;
	}

	// Metodos

	/** Convertir de gramo a kilogramo */
	public double cGramoAKiloG(double valorA) {
		return (valorA * this.KILOGRAMO) / this.GRAMO;
	}

	/** Convertir de kilogramo a gramo */
	public double cKiloGAGramo(double valorA) {
		return (valorA * this.GRAMO) / this.KILOGRAMO;
	}

	/** Convertir de gramo a miligramo */
	public double cGramoAmilliG(double valorA) {
		return (valorA * this.MILIGRAMO) / this.GRAMO;
	}

	/** Convertir de miligramos a gramo */
	public double cmiliGAGramo(double valorA) {
		return (valorA * this.GRAMO) / this.MILIGRAMO;
	}
	
	/**Convertir de miligramo a Kilogramo*/
	public double cmiliGAKiloG (double valorA){
		return this.cGramoAKiloG(this.cmiliGAGramo(valorA));
	}
	
	/**Convertir de kilogramo a miligramo*/
	public double cKiloGAmiliG (double valorA){
		return this.cGramoAmilliG(this.cKiloGAGramo(valorA));
	}
}
