package view;

import java.awt.*;
import javax.swing.*;

public class GuiTarea extends JFrame {
	
	public GuiTarea(){
		//Especificaciones de la ventana
		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();
		int heightMyScreen = screenSize.height;
		int widthMyScreen = screenSize.width;
		setBounds(400,200,widthMyScreen/2, heightMyScreen/2);
		setTitle("Consultar Tareas");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Lienzos
		LienzoT tarea1 = new LienzoT();
		add(tarea1);
		BotonT enviar = new BotonT();
		add(enviar, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

}
class LienzoT extends JPanel{

	public LienzoT() {
			
		setLayout(new GridLayout(7, 1));
		JLabel etiquetaP = new JLabel("Seleccione el proyecto");
		etiquetaP.setHorizontalAlignment(getWidth());
		add(etiquetaP);
		JComboBox proyectoS = new JComboBox();
		add(proyectoS);
		JLabel etiquetaR = new JLabel("Seleccione el rol");
		etiquetaR.setHorizontalAlignment(getWidth());
		add(etiquetaR);
		JComboBox rolS = new JComboBox();
		add(rolS);
		
	}
}

class BotonT extends JPanel{
	
	public BotonT(){

		 add(new JButton("Consultar Tarea"));
	}
}

class LienzoTB extends JPanel {

	public LienzoTB() {
		setSize(1,1);
	}
}
