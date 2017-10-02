package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EjemploBoton extends JFrame {

	private JButton botonTexto;
	private JButton botonIcono;
	
	public EjemploBoton (){
		
		super("Ejemplo Boton Texto y Boton Icono");
		setLayout(new FlowLayout());
		
		botonTexto = new JButton("Boton con texto");
		add(botonTexto);
		
		Icon duke = new ImageIcon(getClass().getResource("duke2.gif"));
		Icon duke1 = new ImageIcon(getClass().getResource("duke3.jpg"));
		botonIcono = new JButton("Boton con Icono", duke);
		botonIcono.setRolloverIcon(duke1);
		add(botonIcono);
		
		ManejadorBoton mBoton = new ManejadorBoton();
		botonTexto.addActionListener(mBoton);
		botonIcono.addActionListener(mBoton);
	}
	
	private class 	ManejadorBoton implements ActionListener{
		
		public void actionPerformed (ActionEvent evento){
			
			JOptionPane.showMessageDialog(EjemploBoton.this,String.format("Usted Oprimio : %s",evento.getActionCommand()));
		}
		
	}
	
}
