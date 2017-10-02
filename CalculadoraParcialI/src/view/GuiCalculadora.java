package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GuiCalculadora extends JFrame {

	LienzoPrincipal principal;

	public GuiCalculadora() {

		setLayout(null);
		principal = new LienzoPrincipal();
		// Especificaciones de la ventana

		Toolkit screenU = Toolkit.getDefaultToolkit();
		Dimension screenSize = screenU.getScreenSize();

		int heightMyScreen = screenSize.height;
		int widthMyScreen = screenSize.width;

		setBounds(400, 200, widthMyScreen / 4, heightMyScreen / 2);
		setTitle("Mi Calculadora - programación 1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setBounds(0, 0, widthMyScreen / 4, heightMyScreen / 2);
		this.add(principal);
		setVisible(true);
	}

	class LienzoPrincipal extends JPanel {

		LienzoNorte operaciones;
		LienzoRadioB opcionB;
		LienzoGridB botonesNL;
		LienzoButtonS botonesB;

		public LienzoPrincipal() {

			this.setLayout(null);
			operaciones = new LienzoNorte();
			opcionB = new LienzoRadioB();
			botonesNL = new LienzoGridB();
			botonesB = new LienzoButtonS();
			operaciones.setBounds(20, 15, 300, 60);
			opcionB.setBounds(15, 70, 300, 50);
			botonesNL.setBounds(30, 110, 280, 180);
			botonesB.setBounds(30, 300, 280, 30);
			this.add(operaciones);
			this.add(opcionB);
			this.add(botonesNL);
			this.add(botonesB);

		}
	}

	class LienzoNorte extends JPanel {

		JTextField pantalla;

		public LienzoNorte() {
			this.setLayout(null);
			pantalla = new JTextField();
			pantalla.setHorizontalAlignment(pantalla.CENTER);
			pantalla.setSize(300, 60);
			add(pantalla);

		}

	}

	class LienzoRadioB extends JPanel {

		JPanel allButtons;
		JRadioButton dec;
		JLabel etiquetaDec;
		JRadioButton bin;
		JLabel etiquetaBin;
		JRadioButton oct;
		JLabel etiquetaOct;
		JRadioButton hex;
		JLabel etiquetaHex;

		public LienzoRadioB() {

			// this.setLayout(null);
			allButtons = new JPanel();
			dec = new JRadioButton();
			etiquetaDec = new JLabel("DEC");
			bin = new JRadioButton();
			etiquetaBin = new JLabel("BIN");
			oct = new JRadioButton();
			etiquetaOct = new JLabel("OCT");
			hex = new JRadioButton();
			etiquetaHex = new JLabel("HEX");
			allButtons.add(dec);
			allButtons.add(etiquetaDec);
			allButtons.add(bin);
			allButtons.add(etiquetaBin);
			allButtons.add(oct);
			allButtons.add(etiquetaOct);
			allButtons.add(hex);
			allButtons.add(etiquetaHex);
			add(allButtons);
		}

	}

	class LienzoGridB extends JPanel {

		JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10, boton11, boton12,
				boton13, boton14, boton15, boton16, boton17, boton18, boton19, boton20;

		public LienzoGridB() {

			this.setLayout(new GridLayout(5, 4, 10, 10));
			boton1 = new JButton("A");
			boton2 = new JButton("B");
			boton3 = new JButton("C");
			boton4 = new JButton("D");
			boton5 = new JButton("E");
			boton6 = new JButton("F");
			boton7 = new JButton("1");
			boton8 = new JButton("2");
			boton9 = new JButton("3");
			boton10 = new JButton("4");
			boton11 = new JButton("5");
			boton12 = new JButton("6");
			boton13 = new JButton("7");
			boton14 = new JButton("8");
			boton15 = new JButton("9");
			boton16 = new JButton("/");
			boton17 = new JButton("*");
			boton18 = new JButton("-");
			boton19 = new JButton("+");
			boton20 = new JButton("+/-");

			add(boton4);
			add(boton5);
			add(boton6);
			add(boton16);
			add(boton1);
			add(boton2);
			add(boton3);
			add(boton17);
			add(boton13);
			add(boton14);
			add(boton15);
			add(boton18);
			add(boton10);
			add(boton11);
			add(boton12);
			add(boton19);
			add(boton7);
			add(boton8);
			add(boton9);
			add(boton20);

		}

	}
	
	class LienzoButtonS extends JPanel{
		
		JButton boton21, boton22;
		
		public LienzoButtonS (){
			this.setLayout(null);
			boton21 = new JButton("0");
			boton22 = new JButton("=");
			boton21.setBounds(0, 0, 208, 30);
			boton22.setBounds(217, 0, 62, 30);
			add(boton21);
			add(boton22);
			
		}
		
	}

}
