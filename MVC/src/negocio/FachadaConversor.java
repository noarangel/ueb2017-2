package negocio;

public class FachadaConversor {

	private Cantidad cantidadIni;
	private Cantidad cantidadFinal;
	private Conversor conversor;

	public FachadaConversor(Cantidad canIni) {

		this.cantidadIni = canIni;
		conversor = new Conversor(cantidadIni);
	}

	public Cantidad Convertir() {

		if (cantidadIni.getUnidad() == 1) {
			cantidadFinal = conversor.convertirKmaM();

		} else {
			cantidadFinal = conversor.convertirMaKm();

		}
		return cantidadFinal;
	}

}
