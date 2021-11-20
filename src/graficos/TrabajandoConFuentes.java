package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoConFuentes marco1=new marcoConFuentes();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class marcoConFuentes extends JFrame{
	
	public marcoConFuentes() {
		
		setTitle("Marco con fuentes");
		setSize(450,300);
		
		laminaConFuentes lamina1=new laminaConFuentes();
		add(lamina1);
		
		lamina1.setForeground(Color.BLUE);
		
		
	}
}

class laminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font fuente=new Font("Lemon",Font.BOLD,26);
		
		g2.setFont(fuente);
		//g2.setColor(Color.RED);
		g2.drawString("Moisés Soler", 100, 100);
		
		g2.setFont(new Font("Verdana",Font.ITALIC,20));
		//g2.setColor(Color.BLUE);
		g2.drawString("Cuso de programacion", 90, 120);
		
		
		
	}
}
