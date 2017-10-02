package ejemplos2;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;

public class EjemploGridLayout extends JFrame implements ActionListener {

	private JButton botones [];
	private String nombres [] = {"uno","dos","tres", "cuatro", "cinco", "seis", "siete", "ocho"};
	private boolean alternar= true;
	private Container contenedor;
	private GridLayout cuadricula1;
	private GridLayout cuadricula2;
	
	public EjemploGridLayout (){
		
		super("EjemploGridLayout");
		cuadricula1 = new GridLayout(2,4,5,5);
		cuadricula2 = new GridLayout(4,2,5,5);
		contenedor = getContentPane();
		setLayout(cuadricula1);
		botones = new JButton [nombres.length];
		for(int cuenta=0; cuenta <nombres.length; cuenta++){
			botones [cuenta] = new JButton(nombres [cuenta] );
			add(botones [cuenta] );
			botones [cuenta].addActionListener(this);
		}
		
	}
	
	public void actionPerformed (ActionEvent evento){
		
		if(alternar)
			contenedor.setLayout(cuadricula2);
		else
			contenedor.setLayout(cuadricula1);
		
		alternar= !alternar;
		contenedor.validate();
	}
}
