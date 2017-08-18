package ejemplos;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EjemploLabelFrame extends JFrame{

	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	
	public EjemploLabelFrame (){
		super("Ejemplo JLabel");
		setLayout(new FlowLayout());
		
		etiqueta1 = new JLabel("Etiqueta solo texto");
		etiqueta1.setToolTipText("Esta es etiqueta uno");
		add(etiqueta1);
		
		Icon duke = new ImageIcon(getClass().getResource("duke.jpeg"));
		etiqueta2 = new JLabel("Etiqueta con texto e icono",duke,SwingConstants.LEFT );
		etiqueta2.setToolTipText("Esta es etiqueta dos");
		add(etiqueta2);
		
		etiqueta3 = new JLabel();
		etiqueta3.setText("Etiqueta con texto en la parte inferior del icono");
		etiqueta3.setIcon(duke);
		etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
		etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
		etiqueta3.setToolTipText("esta es etiqueta3");
		add(etiqueta3);
	}
}
