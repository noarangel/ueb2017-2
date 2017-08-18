package entity;

public class UnidadesDC {
	
	//Metodo
	public String verificaUDC (String numeroE) {
		
		String resultado = "";
		String numero;
		resultado = "El Número tiene: \n";
		resultado += numero= numeroE.charAt(0) + " centenas\n";
		resultado += numero = numeroE.charAt(1) + " decenas\n";
		resultado += numero = numeroE.charAt(2) +" unidades.";
		
		return resultado;
	}

}
