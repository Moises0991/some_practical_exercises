package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto marco1=new MarcoTexto();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setTitle("Marco Texto");
		
		setBounds(480,250,490,340);
		
		PanelTexto panel1=new PanelTexto();
		
		add(panel1);
		
		setVisible(true);
	}
}

class PanelTexto extends JPanel{
	
	private JTextField campo1=new JTextField(20);
	private JButton boton=new JButton("Comprobar");
	private JLabel correo=new JLabel("Correo: ");
	private JLabel resultado=new JLabel("",JLabel.CENTER);
	private JPanel panel2=new JPanel();
	
	PanelTexto(){
		
		setLayout(new BorderLayout());
		
		panel2.setLayout(new FlowLayout());
		
		panel2.add(correo);
		panel2.add(campo1);
		panel2.add(boton);
		
		add(resultado,BorderLayout.CENTER);
		add(panel2,BorderLayout.NORTH);
		
		DameTexto texto=new DameTexto();
		boton.addActionListener(texto);
		
		
	}
	
	private class DameTexto implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			int correcto=0;
			String email=campo1.getText().trim();
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {
					
					correcto++;
				}
			}
			
			if(correcto==1) {
				
				resultado.setText("Correcto");
				
			}else {
				
				resultado.setText("Incorrecto");
			}
		}
	}
}
