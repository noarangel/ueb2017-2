package ejemplos2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class EjemploJPanel extends JFrame implements ActionListener {

	private JPanel panelUno, panelDos, panelTres;
    private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;   
    
	
    public EjemploJPanel (){
    	
    	super("Ejemplo de JPanel");
    	setLayout(null); 
    	
    	configurarJpanelgridLayout();
    	configurarJpanelborderLayout();
    	configurarJpanelflowLayout();

    	panelUno.setBounds(10, 10, 200, 200);
    	panelDos.setBounds(10, 10, 200, 200);
    	panelTres.setBounds(10, 10, 200, 200);

    	add(panelUno);
    	add(panelDos);
    	add(panelTres);
    	
    	jButton4 = new JButton("Panel 1");
    	jButton5 = new JButton("Panel 2");
    	jButton6 = new JButton("Panel 3");
    	
    	jButton4.setBounds(10, 430, 90, 20);
    	jButton5.setBounds(110, 430, 90, 20);
    	jButton6.setBounds(210, 430, 90, 20);
 
    	add(jButton4);
    	add(jButton5);
    	add(jButton6);
    	
    	jButton4.addActionListener(this);
    	jButton5.addActionListener(this);
    	jButton6.addActionListener(this);
    }
    
    public void configurarJpanelgridLayout(){
    	
    	panelUno = new JPanel(new GridLayout(3, 1, 5, 7));//filas, columnas, espacio entre filas, espacio entre columnas
    	
    	jButton1 = new JButton("B1");
    	jButton2 = new JButton("B2");
    	jButton3 = new JButton("B3");
    	
    	panelUno.add(jButton1);
    	panelUno.add(jButton2);
    	panelUno.add(jButton3);
    	
    	jButton1.addActionListener(this);
    	jButton2.addActionListener(this);
    	jButton3.addActionListener(this);
  
    	panelUno.setVisible(false);
    	
    }
    
    public void configurarJpanelborderLayout(){
    	
    	panelDos = new JPanel(new BorderLayout(2, 3));//espacio entre las regiones, horizontal y vertical
 
     	jButton1 = new JButton("B1");
    	jButton2 = new JButton("B2");
    	jButton3 = new JButton("B3");
   
    	panelDos.add(jButton1, BorderLayout.NORTH);//boton al panel norte
    	panelDos.add(jButton2, BorderLayout.WEST); //boton a la region oeste
    	panelDos.add(jButton3, BorderLayout.CENTER); //boton a la region centro    
 
       	jButton1.addActionListener(this);
    	jButton2.addActionListener(this);
    	jButton3.addActionListener(this);
 
    	panelDos.setVisible(false);
    }
    
    
    public void configurarJpanelflowLayout(){
        
    	panelTres = new JPanel(new FlowLayout());
 
    	jButton1 = new JButton("B1");
    	jButton2 = new JButton("B2");
    	jButton3 = new JButton("B3");
 
       	panelTres.add(jButton1);
       	panelTres.add(jButton2);
       	panelTres.add(jButton3);
 
       	jButton1.addActionListener(this);
    	jButton2.addActionListener(this);
    	jButton3.addActionListener(this);
 
    	panelTres.setVisible(false);
    }

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
        if(e.getSource() == jButton4){
            if(panelUno.isVisible()){
            	panelUno.setVisible(false);
            }else
            	panelUno.setVisible(true);
        }else if(e.getSource() == jButton5){
            if(panelDos.isVisible()){
            	panelDos.setVisible(false);
            }else
            	panelDos.setVisible(true);
 
        }else if(e.getSource() == jButton6){
            if(panelTres.isVisible()){
            	panelTres.setVisible(false);
            }else
            	panelTres.setVisible(true);
 
        }else{
            JOptionPane.showMessageDialog(null, e.getActionCommand());
        }

		
	}

	
}

