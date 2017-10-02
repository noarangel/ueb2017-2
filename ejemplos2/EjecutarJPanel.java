package ejemplos2;

import javax.swing.JFrame;

public class EjecutarJPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjemploJPanel ejemplo = new EjemploJPanel();
		ejemplo.setLocation(100, 50);
        ejemplo.setResizable(false);
        ejemplo.setVisible(true);
        ejemplo.setSize(800, 600);
        ejemplo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
