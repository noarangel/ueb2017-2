package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiEsfera extends JPanel {

	public PanelBotonesI iBotones;
	private JLabel etiqueta1;
	public JTextField campo1;

	public GuiEsfera() {
		this.setLayout(new BorderLayout());
		// Instancias
		iBotones = new PanelBotonesI();
		etiqueta1 = new JLabel("Ingrese el radio de la esfera");
		campo1 = new JTextField(10);

		// Add's
		this.add(etiqueta1, BorderLayout.NORTH);
		this.add(campo1, BorderLayout.CENTER);
		this.add(iBotones, BorderLayout.SOUTH);
	}
	
	public class PanelBotonesI extends JPanel{
		
		public JButton boton1, boton2;
		
		public PanelBotonesI() {
			
			this.setLayout(new GridLayout(1, 2, 5, 7));
			//Instancias
			boton1 = new JButton("Volumen");
			boton2 = new JButton("Area");
			
			//Add's
			this.add(boton1);
			this.add(boton2);	
		}
	}

}


