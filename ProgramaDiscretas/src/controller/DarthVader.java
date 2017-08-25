package controller;

import entity.*;

public class DarthVader {
	
	//Instancias
	private UnidadesDC udc;
	private DivisoresEI divisores;
	
	//constructor
	public DarthVader() {
		udc = new UnidadesDC();
	}
	
	//Metodos
	
	public String enviarDatosUDC (String numeroC) {
		String respuesta = udc.verificaUDC(numeroC);
		return respuesta;
	}
	
	public String enviarDatosDivisor (int cDividendo, int cDivisor){
		String respuesta = divisores.rDivisores(cDividendo, cDivisor) ;
		return respuesta;	
	}

}
