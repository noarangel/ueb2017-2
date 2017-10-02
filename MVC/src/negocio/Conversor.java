package negocio;


public class Conversor {

	private Cantidad cantidadInicial;
	private Cantidad cantidadFinal;

	public Conversor() {
	}

	public Conversor(Cantidad canIni) {

		this.cantidadInicial = canIni;
		cantidadFinal = new Cantidad();
	}

	public Cantidad convertirKmaM() {

		Double valor = 0.0;
		Double resultado = 0.0;
		valor = cantidadInicial.getValor();
		resultado = valor * 1000.0;
		cantidadFinal.setValor(resultado);
		cantidadFinal.setUnidad(0);
		return cantidadFinal;
	}

	public Cantidad convertirMaKm() {

		Double valor = 0.0;
		Double resultado = 0.0;
		valor = cantidadInicial.getValor();
		resultado = valor / 1000.0;
		cantidadFinal.setValor(resultado);
		cantidadFinal.setUnidad(1);
		return cantidadFinal;
	}

}
