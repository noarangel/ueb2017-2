package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EjemploJComboBox extends JFrame {

	private JComboBox imagenesJComboBox;
	private JLabel etiqueta;
	private String nombres[] = {"tux_1.jpg","tux_2.png","tux_3.jpg","tux_4.jpeg"};
	
	private Icon iconos [] = { new ImageIcon( getClass().getResource(nombres[0])),
							   new ImageIcon(getClass().getResource(nombres[1])),
							   new ImageIcon(getClass().getResource(nombres[2])),
							   new ImageIcon(getClass().getResource(nombres[3]))};
	
	public EjemploJComboBox(){
		
		super("Ejemplo de JComboBox");
		setLayout(new FlowLayout());
		
		imagenesJComboBox = new JComboBox(nombres);
		imagenesJComboBox.setMaximumRowCount(3);
		
		ManejadorJComboBox mJComboBox = new ManejadorJComboBox();
		imagenesJComboBox.addItemListener(mJComboBox);
	
		add(imagenesJComboBox);
		etiqueta = new JLabel(iconos[0]);
		add(etiqueta);
	}
	
	private class ManejadorJComboBox implements ItemListener {
		
		public void itemStateChanged (ItemEvent evento){
			
			if (evento.getStateChange()== ItemEvent.SELECTED){
				etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
			}
						
		}
	}
	
	
	
	
}
