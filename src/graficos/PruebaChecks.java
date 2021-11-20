package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaChecks {

	public static void main(String[] args) {
		
		MarcoCheck marco1=new MarcoCheck();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setTitle("CheckBox");
		setBounds(480,250,400,200);
		
		LaminaCheck lamina1=new LaminaCheck();
		
		add(lamina1);		
		
	}
}

class LaminaCheck extends JPanel{
	
	JLabel texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
	JCheckBox negritas=new JCheckBox("Negritas");
	JCheckBox cursivas=new JCheckBox("Cursivas");
	JPanel lamina2=new JPanel();
	JPanel lamina3=new JPanel();
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		
		Font fuente1=new Font("Serift",Font.PLAIN,16);
		
		texto.setFont(fuente1);
		lamina2.add(texto);
		
		add(lamina2,BorderLayout.CENTER);
		
		negritas.addActionListener(new OyenteChecks());
		cursivas.addActionListener(new OyenteChecks());
		
		lamina3.add(negritas);
		lamina3.add(cursivas);
		
		add(lamina3,BorderLayout.SOUTH);
		
	}
	
	private class OyenteChecks implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int tipo=0;
			
			if(negritas.isSelected()) tipo+=Font.BOLD;
			if(cursivas.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serift",tipo,16));
			
		}
	}
}


