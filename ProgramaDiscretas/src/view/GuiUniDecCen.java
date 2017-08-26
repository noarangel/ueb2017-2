package view;

import controller.DarthVader;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiUniDecCen extends JPanel {
	
	private DarthVader sith1;
	private JPanel norte, centro, sur; 
	private JTextField numeroV;
	private JTextField resultado;
	private Capturar guardar;

	public GuiUniDecCen(){
		
		
		this.setLayout(new BorderLayout());
		
		//Instancias
		sith1 = new DarthVader();
		guardar = new Capturar();
		norte = new JPanel();
		centro = new JPanel();
		sur = new JPanel();
		numeroV = new JTextField(5);
		resultado = new JTextField(20);
		
		//bloque
		JLabel etiquetaUni = new JLabel("Ingrese un número de tres (3) digitos");
		etiquetaUni.setHorizontalAlignment(getWidth());
		JButton enviar = new JButton("Enviar");
		numeroV.setHorizontalAlignment(numeroV.CENTER);
		
		resultado.setHorizontalAlignment(resultado.CENTER);
		resultado.setEditable(false);
		centro.setLayout(new BorderLayout());
		
		
		//add's
		norte.add(etiquetaUni);
		centro.add(numeroV, BorderLayout.NORTH);
		centro.add(resultado, BorderLayout.CENTER);
		sur.add(enviar);
		add(norte, BorderLayout.NORTH);
		add(centro, BorderLayout.CENTER);
		add(sur, BorderLayout.SOUTH);
		
		//Acciones
		enviar.addActionListener(guardar);
		
	}
	
	private class Capturar implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String ingreso = "";

			try {
				ingreso = numeroV.getText();
				ingreso = ingreso.trim();
				if ((ingreso.length()>3) || (ingreso.length()<1)){
					 throw new EmptyStackException();
				}else {
					int i = Integer.parseInt(ingreso);
					if (i < 100) {
						throw new EmptyStackException();
					}
				}
				
				resultado.setText(sith1.enviarDatosUDC(ingreso));
				numeroV.setText(null);

				
			}catch (Exception w) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto, por favor, intentelo de nuevo");
				numeroV.setText(null);
				resultado.setText(null);
			}

			
			//System.out.println(ingreso);
			
			
		}
		
	}
}

