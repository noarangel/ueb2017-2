package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class GuiPrincipal extends JFrame {
	
	public GuiPrincipal(){
		
		//Especificaciones de la ventana
		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();
		int heightMyScreen = screenSize.height;
		int widthMyScreen = screenSize.width;
		setBounds(400,200,widthMyScreen/2, heightMyScreen/2);
		setTitle("Pagina Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Lienzos
		JLabel text1 = new JLabel("Seleccione una opción",(int) CENTER_ALIGNMENT);
		add(text1, BorderLayout.NORTH);
		LienzoPB blan2 = new LienzoPB();
		add(blan2, BorderLayout.EAST);
		LienzoPB blan3 = new LienzoPB();
		add(blan3, BorderLayout.WEST);
		LienzoPB blan4 = new LienzoPB();
		add(blan4, BorderLayout.SOUTH);
		LienzoP opciones = new LienzoP();
		add(opciones, BorderLayout.CENTER);
		setVisible(true);
	}

}
class LienzoP extends JPanel implements ActionListener {

	public LienzoP() {
			
		setLayout(new GridLayout(7, 1));
		add(new JButton("Asignar Tarea")).setEnabled(false);
		LienzoPB blan1 = new LienzoPB();
		add(blan1);	
		JButton consultarT = new JButton("Consultar Tareas");
		consultarT.addActionListener(this);
		add(consultarT);
		LienzoPB blan2 = new LienzoPB();
		add(blan2);
		add(new JButton("Registrar Avance")).setEnabled(false);
		LienzoPB blan3 = new LienzoPB();
		add(blan3);
		add(new JButton("Generar Informe")).setEnabled(false);
		
		
	}
	public void actionPerformed(ActionEvent e){
		GuiTarea tareaC = new GuiTarea();	
	}
}

class LienzoPB extends JPanel {

	public LienzoPB() {
		setSize(1,1);
	}
}

