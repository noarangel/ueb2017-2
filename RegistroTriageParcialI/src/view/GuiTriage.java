package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GuiTriage extends JFrame {
	
	LienzoPrincipal principal;
	
	public GuiTriage() {
		principal = new LienzoPrincipal();
		// Especificaciones de la ventana

		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();

		int heightMyScreen = screenSize.height;
		int widthMyScreen = screenSize.width;

		setBounds(400, 200, widthMyScreen / 3, heightMyScreen / 3);
		setTitle("Registro Triage");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(principal);
		setVisible(true);
	}
	
	class LienzoPrincipal extends JPanel{
		
		LienzoFormulario formulario;
		
		public LienzoPrincipal() {
			this.setLayout(new BorderLayout());
			formulario = new LienzoFormulario();
			add(formulario, BorderLayout.CENTER);
			
		}
		
	}
	class LienzoFormulario extends JPanel{
		JLabel nombreP, nombreS, apellidoP, apellidoS, tipoD, numero, genero, edad, masculino, femenino, vacio;
		JTextField eNombreP, eNombreS, eApellidoP, eApellidoS, eNumero, eEdad;
		JComboBox eTipoD;
		JRadioButton bMasculino, bFemenino;
		JButton registrar;
		public LienzoFormulario (){
			
			this.setLayout(null);
			//Instancias
			nombreP = new JLabel("Primer Nombre :");
			nombreS = new JLabel("Segundo Nombre : ");
			apellidoP = new JLabel("Primer Apellido :");
			apellidoS = new JLabel("Segundo Apellido : ");
			tipoD = new JLabel("Tipo Documento");
			numero = new JLabel("Numero");
			genero = new JLabel("Sexo");
			edad = new JLabel("Edad");
			vacio = new JLabel("");
			masculino = new JLabel("Masculino");
			femenino = new JLabel("Femenino");
			eNombreP = new JTextField (25);
			eNombreS = new JTextField (25);
			eApellidoP = new JTextField (25);
			eApellidoS = new JTextField (25);
			eNumero = new JTextField(10);
			eEdad = new JTextField(5);
			eTipoD = new JComboBox();
			bMasculino = new JRadioButton();
			bFemenino = new JRadioButton();
			registrar = new JButton("Registrar");
			
			//ubicacion 
			nombreP.setBounds(25, 10, 200, 20);
			eNombreP.setBounds(160, 10, 280, 20);
			nombreS.setBounds(25, 30, 200, 20);
			eNombreS.setBounds(160, 30, 280, 20);
			apellidoP.setBounds(25, 50, 200, 20);
			eApellidoP.setBounds(160, 50, 280, 20);
			apellidoS.setBounds(25, 70, 200, 20);
			eApellidoS.setBounds(160, 70, 280, 20);
			tipoD.setBounds(10, 100, 200, 20);
			eTipoD.setBounds(150, 100, 55, 25);
			numero.setBounds(220, 100, 200, 20);
			eNumero.setBounds(280, 100, 150, 25);
			genero.setBounds(10, 140, 200, 20);
			bMasculino.setBounds(60, 140, 20, 20);
			masculino.setBounds(80, 140, 100, 20);
			bFemenino.setBounds(170, 140, 20, 20);
			femenino.setBounds(190, 140, 100, 20);
			edad.setBounds(320, 140, 100, 20);
			eEdad.setBounds(360, 140, 50, 25);
			registrar.setBounds(335, 195, 100, 25);
	
			
			//Add's
			add(nombreP);
			add(eNombreP);
			add(nombreS);
			add(eNombreS);
			add(apellidoP);
			add(eApellidoP);
			add(apellidoS);
			add(eApellidoS);
			add(tipoD);
			add(eTipoD);
			add(numero);
			add(eNumero);
			add(genero);
			add(bMasculino);
			add(masculino);
			add(bFemenino);
			add(femenino);
			add(edad);
			add(eEdad);
			add(registrar);
			
		}
	}

}
