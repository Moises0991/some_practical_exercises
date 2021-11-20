package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoConColor marco1=new marcoConColor();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoConColor extends JFrame{
	
	public marcoConColor() {
		
		setTitle("Marco con color");
		setSize(450,350);
		
		laminaConColor lamina1=new laminaConColor();
		lamina1.setBackground(Color.GREEN);
		add(lamina1);
			
	}
}

class laminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo1=new Rectangle2D.Double(100,80,250,150);
		g2.setPaint(Color.BLACK);
		g2.draw(rectangulo1);
		
		g2.setPaint(Color.RED);
		g2.fill(rectangulo1);
		
		
		Ellipse2D elipse1=new Ellipse2D.Double();
		elipse1.setFrame(rectangulo1);
		
		//Color miColor=new Color(0,0,228);
		
		g2.setColor(new Color(0,0,228).brighter());
		g2.fill(elipse1);
	}
}
