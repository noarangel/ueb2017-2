package entidad;

public class Longitud {

	// Atributos
	/** Cada valor de las unidades es el equivalente de un (1) metro */
	private static double METRO = 1;
	private static double DECAMETRO = 0.1;
	private static double DECIMETRO = 10;

	// Constructor
	public Longitud() {

	}

	// Getter´s
	/** No se coloca Setter´s porque no van a variar los valores */
	public static double getMETRO() {
		return METRO;
	}

	public static double getDECAMETRO() {
		return DECAMETRO;
	}

	public static double getDECIMETRO() {
		return DECIMETRO;
	}

	// Metodos
	/** Convertir metros a Decametros */
	public double cMetroADecaM(double valorA) {
		return (valorA * this.DECAMETRO) / this.METRO;
	}

	/** Convertir Decametros a Metros */
	public double cDecaMAMetro(double valorA) {
		return (valorA * this.METRO) / this.DECAMETRO;
	}

	/** Convertir Metros a decimetro */
	public double cMetroAdeciM(double valorA) {
		return (valorA * this.DECIMETRO) / this.METRO;
	}

	/** Convertir decimetros a Metros */
	public double cdeciMAMetro(double valorA) {
		return (valorA * this.METRO) / this.DECIMETRO;
	}

	/** Convertir Decametros a decimetros */
	public double cDecaMAdeciM(double valorA) {
		return this.cMetroAdeciM(this.cDecaMAMetro(valorA));
	}

	/** Convertir decimetro a Decametro */
	public double cdeciMADecaM(double valorA) {
		return this.cMetroADecaM(this.cdeciMAMetro(valorA));
	}

}
