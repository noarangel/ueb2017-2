package ejemplos;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class EjemploJRadioButton extends JFrame {

	private JTextField campoTexto;
	private Font tipoLetraSimple;
	private Font tipoLetraNegrita;
	private Font tipoLetraCursiva;
	private Font tipoLetraNegritaCursiva;
	private JRadioButton simpleJRadioButton;
	private JRadioButton negritaJRadioButton;
	private JRadioButton cursivaJRadioButton;
	private JRadioButton negritaCursivaJRadioButton;
	private ButtonGroup grupoOpciones;
	
	
	public  EjemploJRadioButton(){
		
		super("Ejemplo jRadioButton");
		setLayout(new FlowLayout());
		
		campoTexto= new JTextField("Observa el cambio tipo de letra", 30);
		add(campoTexto);
		
		simpleJRadioButton = new JRadioButton("Simple", true);
		negritaJRadioButton = new JRadioButton ("Negrita", false); 
		cursivaJRadioButton = new JRadioButton ("Cursiva", false);
		negritaCursivaJRadioButton = new JRadioButton ("Negrita/Cursiva",false);
		add(simpleJRadioButton);
		add(negritaJRadioButton);
		add(cursivaJRadioButton);
		add(negritaCursivaJRadioButton);
		
		grupoOpciones = new ButtonGroup();
		grupoOpciones.add(simpleJRadioButton);
		grupoOpciones.add(negritaJRadioButton);
		grupoOpciones.add(cursivaJRadioButton);
		grupoOpciones.add(negritaCursivaJRadioButton);

		tipoLetraSimple = new  Font("Serif", Font.PLAIN, 10);
		tipoLetraNegrita = new Font("Serif", Font.BOLD, 10);
		tipoLetraCursiva =  new Font ("Serif", Font.ITALIC, 10);
		tipoLetraNegritaCursiva = new Font ("Serif", Font.BOLD+Font.ITALIC, 10);

		simpleJRadioButton.addItemListener(new ManejadorBotonOption (tipoLetraSimple));
		negritaJRadioButton.addItemListener(new ManejadorBotonOption (tipoLetraNegrita));
		cursivaJRadioButton.addItemListener(new ManejadorBotonOption (tipoLetraCursiva));
		negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOption (tipoLetraNegritaCursiva));
	}
	
	private class ManejadorBotonOption implements ItemListener{
		
		private Font tipoLetra;
		
		public ManejadorBotonOption(Font f){
			
			tipoLetra=f;
		}
		
		public void itemStateChanged(ItemEvent evento){
			
			campoTexto.setFont(tipoLetra);
			
		}
		
	}

}
