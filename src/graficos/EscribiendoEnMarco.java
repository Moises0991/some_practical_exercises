package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frameConTexto marco1=new frameConTexto();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class frameConTexto extends JFrame{
	
	public frameConTexto(){
		
		setVisible(true);
		setSize(500,300);
		setLocation(500,200);
		setTitle("Primer Texto");
		
		Lamina lamina1=new Lamina();
		add(lamina1);
		
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Este es un ejemplo de texto", 150, 120);
		
		
	}
	
}
