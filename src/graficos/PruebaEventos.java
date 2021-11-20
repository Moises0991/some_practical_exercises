package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoBotones marco1=new marcoBotones();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoBotones extends JFrame{
	
	marcoBotones(){
		
		setTitle("Botones y eventos");
		setBounds(500,200,350,250);	
		
		laminaBotones lamina1= new laminaBotones();
		add(lamina1);
	}
}

class laminaBotones extends JPanel {
	
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonVerde=new JButton("Verde");
	
	public laminaBotones() {
		
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		
		colorFondo Azul=new colorFondo(Color.BLUE);
		colorFondo Rojo=new colorFondo(Color.RED);
		colorFondo Verde=new colorFondo(Color.GREEN);
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonVerde.addActionListener(Verde);
	}	
	
	private class colorFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		public colorFondo(Color c) {
			
			colorDeFondo=c;
		}

		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
	}
	
}

