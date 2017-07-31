package vista;

import java.util.EmptyStackException;
import java.util.Scanner;
import controlador.DarthVader;

public class VistaTiempo {
	
	DarthVader sith2 = new DarthVader();
	Scanner opcion = new Scanner(System.in);
	
	/**Menu Longitud*/
	public String opcionesTiem () {
		String opcionesT = "";
		opcionesT += "1 - Hora \t";
		opcionesT += "2 - Minuto \t";
		opcionesT += "3 - Segundo \t";	
		return opcionesT;
	}
	
	public void MenuT (){
		//variables
		boolean bu = false;
		double valor = 0;
		int accionL = 0;
		int accionAL = 0;
		
		//Menu de longitud
		do{
			System.out.println("Unidades de Tiempo \n");
			System.out.println("Por favor ingrese el numero a convertir");
			try {
				valor = Double.valueOf(opcion.nextLine());
			} catch (Exception e) {
				System.out.println("Opción inválida inténtelo de nuevo \n");
				bu = true;
				continue;
			}
			System.out.println("Ingrese el número de la unidad en la que se encuentra el valor: ");
			System.out.println(this.opcionesTiem());
			try {
				String comprobacion = opcion.nextLine();
				if (comprobacion.length() != 1){
					throw new EmptyStackException();
				}
				accionL = Integer.valueOf(comprobacion);					
				
			}catch(Exception e){
				System.out.println("Opción inválida inténtelo de nuevo \n");
				bu = true;	
				continue;
			}
			System.out.println("Ingrese el número de la unidad a la que quiere convertir el valor: ");
			System.out.println(this.opcionesTiem());
			try {
				String comprobacion = opcion.nextLine();
				if (comprobacion.length() != 1){
					throw new EmptyStackException();
				}
				accionAL = Integer.valueOf(comprobacion);
			} catch (Exception e) {
				System.out.println("Opción inválida inténtelo de nuevo \n");
				bu = true;
				continue;
			}	
			bu = false;
		}while(bu == true);
		
		System.out.println("Resultado: " + sith2.ConvertirT(accionL, valor, accionAL));
	}

}
