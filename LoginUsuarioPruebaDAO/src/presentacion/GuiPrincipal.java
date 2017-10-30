package presentacion;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame{
	
	public int heightMyScreen, widthMyScreen;
	private PanelPrincipal principal;
	public JButton boton1, boton2, boton3;

	public VentanaPrincipal() {
		setLayout(null);
		
		principal = new PanelPrincipal();
		
		// Especificaciones de la ventana

		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();
		heightMyScreen = screenSize.height;
		widthMyScreen = screenSize.width;
		setBounds(400, 200, widthMyScreen / 4, heightMyScreen / 3);
		setTitle("Cajero - Programación 1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Elementos
		principal.setBounds(0, 20, widthMyScreen / 4, heightMyScreen/3);
		GuiCajero login = new GuiCajero();
		this.principal.add(login);
		this.add(principal);
		
		setVisible(true);
	}

	class PanelPrincipal extends JPanel {

		public PanelPrincipal() {

		}

	}

}
