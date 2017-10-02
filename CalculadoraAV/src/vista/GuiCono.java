package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiCono extends JPanel {

	public PanelBotonesI iBotones;
	public PanelCentro cElementos;

	public GuiCono() {
		this.setLayout(new BorderLayout());
		// Instancias
		iBotones = new PanelBotonesI();
		cElementos = new PanelCentro();

		// Add's
		this.add(cElementos, BorderLayout.CENTER);
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
	
	public class PanelCentro extends JPanel {

		public JLabel etiqueta1, etiqueta2;
		public JTextField campo1, campo2;

		public PanelCentro() {
			this.setLayout(new GridLayout(5, 1));
			// Intancias
			etiqueta1 = new JLabel("Ingrese el radio del cono");
			etiqueta2 = new JLabel("Ingrese la altura del cono");
			campo1 = new JTextField(10);
			campo2 = new JTextField(10);

			// Add's
			this.add(etiqueta1);
			this.add(campo1);
			this.add(etiqueta2);
			this.add(campo2);
		}

	}

}


