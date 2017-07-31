package vista;

import controlador.DarthVader;
import java.util.Scanner;

public class VistaConsola {
	
	DarthVader sith1 = new DarthVader();
	VistaLongitud menuL = new VistaLongitud ();
	VistaTiempo menuT = new VistaTiempo();
	VistaMasa menuM = new VistaMasa();
	Scanner opcion = new Scanner(System.in);
	String bienvenida = "Bienvenido a su conversor de unidades";
	
	// Metodo
	
	/**Menu*/
	public void menu() {
		int accion = 0;
		System.out.println(bienvenida);

		do {
			System.out.println("Por favor ingrese el número de la opción a realizar: ");
			System.out.println("1 - Conversiones para unidades de Longitud");
			System.out.println("2 - Conversiones para unidades de Tiempo");
			System.out.println("3 - Conversiones para unidades de Masa");
			System.out.println("4 - Salir");

			try {
				accion = Integer.valueOf(opcion.nextLine());
			} catch (Exception e) {
				System.out.println("Opción inválida intentelo de nuevo \n");
				continue;
			}
			switch (accion) {
				case 1:
					menuL.MenuL();					
					break;	
				case 2:
					menuT.MenuT();
					break;
				case 3:
					menuM.MenuM();
					break;
				case 4: 
					System.out.println("¡Gracias!");
					System.exit(0);
					break;
				default:
					System.out.println("Opción inválida inténtelo de nuevo \n");
					continue;
			}
		} while (true);
	}

}
