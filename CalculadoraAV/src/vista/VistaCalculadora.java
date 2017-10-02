package vista;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VistaCalculadora extends JFrame {
	
	public int heightMyScreen, widthMyScreen;
	private PanelPrincipal principal;
	public PanelDinamico dinamico;
	public JButton boton1, boton2, boton3;
	
	public VistaCalculadora() {
		setLayout(null);
		
		principal = new PanelPrincipal();
		dinamico = new PanelDinamico();
		
		// Especificaciones de la ventana

		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();
		heightMyScreen = screenSize.height;
		widthMyScreen = screenSize.width;
		setBounds(400, 200, widthMyScreen / 4, heightMyScreen / 3);
		setTitle("Mi Calculadora - programación 1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Elementos
		principal.setBounds(-1, 5, widthMyScreen / 4, heightMyScreen / 20);
		dinamico.setBounds(2, 50, widthMyScreen / 4, heightMyScreen / 5 );
		this.add(principal);
		this.add(dinamico);
		
		setVisible(true);
	}
	
	class PanelPrincipal extends JPanel{
		
		public PanelPrincipal() {
			this.setLayout(new GridLayout(1, 3));
			
			//Instancias
			boton1 = new JButton("Cono");
			boton2 = new JButton("Cubo");
			boton3 = new JButton("Esfera");
			
			//Add's
			this.add(boton1);
			this.add(boton2);
			this.add(boton3);	
		}
		
	}
	
	public class PanelDinamico extends JPanel{
		
		public PanelDinamico(){
						
		}
	}
		
}

