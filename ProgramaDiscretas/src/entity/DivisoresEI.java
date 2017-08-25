package entity;

public class DivisoresEI {
	
	//metodo
	public String rDivisores (int eDividendo, int eDivisor) {
		int residuo = eDividendo % eDivisor;
		int cociente = eDividendo / eDivisor;
		String respuesta = "";
		String sCociente = "";
		String sResiduo = "";
		
		if (residuo == 0) {
			sCociente = "El cociente es: " + cociente + "\n";
			sResiduo = "El residuo es: " + residuo;
			respuesta = "La división es exacta.\n" + sCociente + sResiduo;
			
		}else 
			sCociente = "El cociente es: " + cociente + "\n";
			sResiduo = "El residuo es: " + residuo;
			respuesta = "La división es inexacta. \n" + sCociente + sResiduo;
			
			
		return respuesta;
	}

}
