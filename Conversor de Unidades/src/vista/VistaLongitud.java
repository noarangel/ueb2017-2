package vista;

import java.util.EmptyStackException;
import java.util.Scanner;
import controlador.DarthVader;

public class VistaLongitud {
	DarthVader sith1 = new DarthVader();
	Scanner opcion = new Scanner(System.in);
	
	/**Menu Longitud*/
	public String opcionesLong() {
		String opcionesL = "";
		opcionesL += "1 - Metro \t";
		opcionesL += "2 - Decametro \t";
		opcionesL += "3 - decimetro \t";	
		return opcionesL;
	}
	
	public void MenuL (){
		//variables
		boolean bu = false;
		double valor = 0;
		int accionL = 0;
		int accionAL = 0;
		
		//Menu de longitud
		do{
			System.out.println("Unidades de Longitud \n");
			System.out.println("Por favor ingrese el numero a convertir");
			try {
				valor = Double.valueOf(opcion.nextLine());
			} catch (Exception e) {
				System.out.println("Opci�n inv�lida int�ntelo de nuevo \n");
				bu = true;
				continue;
			}
			System.out.println("Ingrese el n�mero de la unidad en la que se encuentra el valor: ");
			System.out.println(this.opcionesLong());
			try {
				String comprobacion = opcion.nextLine();
				if (comprobacion.length() != 1){
					throw new EmptyStackException();
				}
				accionL = Integer.valueOf(comprobacion);
				
			}catch(Exception e){
				System.out.println("Opci�n inv�lida int�ntelo de nuevo \n");
				bu = true;	
				continue;
			}
			System.out.println("Ingrese el n�mero de la unidad a la que quiere convertir el valor: ");
			System.out.println(this.opcionesLong());
			try {
				String comprobacion = opcion.nextLine();
				if (comprobacion.length() != 1){
					throw new EmptyStackException();
				}
				accionAL = Integer.valueOf(comprobacion);
			} catch (Exception e) {
				System.out.println("Opci�n inv�lida int�ntelo de nuevo \n");
				bu = true;
				continue;
			}
			bu = false;
		}while(bu == true);
		System.out.println("Resultado: " + sith1.ConvertirL(accionL, valor, accionAL));
	}

}
