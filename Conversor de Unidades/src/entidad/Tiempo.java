package entidad;

public class Tiempo {

	// Atributos
	/** Cada valor de las unidades es el equivalente a una (1) hora */
	private static double HORA = 1;
	private static double MINUTO = 60;
	private static double SEGUNDO = 3600;

	// Constructor
	public Tiempo() {
	}

	// Getter´s
	public static double getHORA() {
		return HORA;
	}

	public static double getMINUTO() {
		return MINUTO;
	}

	public static double getSEGUNDO() {
		return SEGUNDO;
	}

	// Metodos

	/** Convertir de hora a minuto */
	public double cHoraAMinuto(double valorA) {
		return (valorA * this.MINUTO) / this.HORA;
	}

	/** Convertir de minuto a hora */
	public double cMinutoAHora(double valorA) {
		return (valorA * this.HORA) / this.MINUTO;
	}

	/** Convertir de hora a segundo */
	public double cHoraASegundo(double valorA) {
		return (valorA * this.SEGUNDO) / this.HORA;
	}

	/** Convertir de segundo a hora */  
	public double cSegundoAHora(double valorA) {
		return (valorA * this.HORA) / this.SEGUNDO;
	}

	/** Convertir de segundo a minuto */
	public double cSegundoAMinuto(double valorA) {
		return this.cHoraAMinuto(this.cSegundoAHora(valorA));
	}
	
	/**Convertir de minuto a segundo*/
	public double cMinutoASegundo(double valorA){
		return this.cHoraASegundo(this.cMinutoAHora(valorA));
	}
}
