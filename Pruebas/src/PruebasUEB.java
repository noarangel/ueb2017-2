import java.io.FileReader;

public class PruebasUEB {

	public static void main(String[] args)throws Exception {
		
		FileReader fr = new FileReader("pruebas.dat");
		int c = fr.read();
		String palabra = "";
		
		while(c != -1) {
			palabra = palabra + (char) c;
			c = fr.read();			
		}
		
		String[] pruebaP = palabra.split("\n");
		for(int i = 0; i< pruebaP.length; i++) {
			//pruebaP[i] = pruebaP[i].trim();
			if(pruebaP[i].toString().length() == 6) {
				System.out.println(pruebaP[i].toString());
			}
		}
		
		fr.close();
	}

}
