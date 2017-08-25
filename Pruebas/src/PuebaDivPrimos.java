import java.util.Scanner;

public class PuebaDivPrimos {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el dividendo");
		int dividendo = ingreso.nextInt();
		System.out.println("Ingrese el divisor");
		int divisor = ingreso.nextInt();
		
		if (dividendo < divisor) {
			System.out.println("El dividendo es menor que el divisor intentelo de nuevo");
		}
		
		if ((dividendo == 0) || (divisor == 0) ) {
			System.out.println("El el dividendo o el divisor es cero (0) intentelo de nuevo");
		}	

	}

}
