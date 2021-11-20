package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCombo marco1=new MarcoCombo();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		
		setTitle("Prueba ComboBox");
		setBounds(480,200,400,300);
		
		LaminaCombo lamina1=new LaminaCombo();
		add(lamina1);
		
	}
}

class LaminaCombo extends JPanel{
	
	JLabel texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
	JComboBox miCombo=new JComboBox();
	JPanel central=new JPanel();
	JPanel norte=new JPanel();
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		
		texto.setFont(new Font("Arial",Font.PLAIN,18));
		add(texto,BorderLayout.CENTER);
		
		miCombo.addItem("Verdana");
		miCombo.addItem("Century");
		miCombo.addItem("Dubai");
		miCombo.addItem("Ebrima");
		
		miCombo.setEditable(true);
		
		norte.add(miCombo);
		add(norte,BorderLayout.NORTH);
		
		miCombo.addActionListener(new seleccion());
	}
	
	private class seleccion implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,18));
			
		}
	}
}
