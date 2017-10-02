package ejemplos2;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;


public class EjemploFlowLayout extends JFrame {

	
	private JButton botonIzquierda;
	private JButton botonCentro;
	private JButton botonDerecha;
	private FlowLayout esquema;
	private Container contenedor;
	
	public EjemploFlowLayout(){
		
		super("Demostración de FlowLayout");
		esquema = new FlowLayout();
		setLayout(esquema);
		contenedor = getContentPane();
		
		botonIzquierda = new JButton("Izquierda");
		botonCentro = new JButton("Centro");
		botonDerecha = new JButton("Derecha");
		
		add(botonIzquierda);
		add(botonCentro);
		add(botonDerecha);
		
		ManejadorEventos mEventos = new ManejadorEventos();
		
		botonIzquierda.addActionListener(mEventos);
		botonCentro.addActionListener(mEventos);
		botonDerecha.addActionListener(mEventos);		
	}
	
	private class ManejadorEventos implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			
			if(e.getSource()==botonIzquierda){
				
				esquema.setAlignment(FlowLayout.LEFT);
				esquema.layoutContainer(contenedor);
				
			}else{		
					if(e.getSource()==botonCentro){
						esquema.setAlignment(FlowLayout.CENTER);
						esquema.layoutContainer(contenedor);
				
					}else{
			
						if(e.getSource()==botonDerecha){
				
							esquema.setAlignment(FlowLayout.RIGHT);
							esquema.layoutContainer(contenedor);
				
						}
					}		
			}
		}
	}
}
