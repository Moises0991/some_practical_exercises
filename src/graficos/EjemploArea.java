package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoArea marco=new MarcoArea();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setTitle("Areas de Texto");
		setBounds(450,200,400,300);
		
		PanelArea panel=new PanelArea();
		add(panel);
	}
}

class PanelArea extends JPanel{
	
	JTextArea campoTexto=new JTextArea(5,20);
	JScrollPane laminaBarras=new JScrollPane(campoTexto);
	JButton boton=new JButton("Copiar");
	
	public PanelArea() {
		
		campoTexto.setLineWrap(true);
		
		add(laminaBarras);
		
		boton.addActionListener(new oyente());
		
		add(boton);
		
	}
	
	private class oyente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(campoTexto.getText());
			
		}
		
		
	}
}