package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;



public class EjemploCampoTexto extends JFrame {

	private JTextField campoTexto1;
	private JTextField campoTexto2;
	private JTextField campoTexto3;
	private JPasswordField campoContraseña;
	private ControlCampoTexto cCampoTexto;
	
	
	public EjemploCampoTexto(){
		
		super("Ejemplo de JTextField y JPasswordField");
		setLayout(new FlowLayout());
		
		campoTexto1 = new JTextField(20);
		add(campoTexto1);
		
		campoTexto2 = new JTextField("Escriba el texto aqui");
		add(campoTexto2);
		
		campoTexto3 = new JTextField("Campo de texto no editable", 25);
		campoTexto3.setEditable(false);
		add(campoTexto3);
		
		campoContraseña = new JPasswordField("Texto Oculto");
		add(campoContraseña);
		
		
		cCampoTexto = new ControlCampoTexto();
		campoTexto1.addActionListener(cCampoTexto);
		campoTexto2.addActionListener(cCampoTexto);
		campoTexto3.addActionListener(cCampoTexto);
		campoContraseña.addActionListener(cCampoTexto);
		
	}
	
	private class ControlCampoTexto implements ActionListener{

		public void actionPerformed(ActionEvent evento){
		
			String cadena="";
			
			if(evento.getSource()==campoTexto1){
				cadena= String.format("campoTexto1: %s",evento.getActionCommand());			
			}
			
			if(evento.getSource()==campoTexto2){
				cadena= String.format("campoTexto2: %s",evento.getActionCommand());			
			}
			
			if(evento.getSource()==campoTexto3){
				cadena= String.format("campoTexto3: %s",evento.getActionCommand());			
			}
			
			if(evento.getSource()==campoContraseña){

				cadena= String.format("campoContraseña: %s", new String(campoContraseña.getPassword()));			
			}
			
			JOptionPane.showMessageDialog(null,cadena);
			
			
		}	
	
	}
	
}
