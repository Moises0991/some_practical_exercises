package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class PruebaDibujos {

	public static void main(String[] args) {
		
		marcoConDibujo marco1=new marcoConDibujo();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}

class marcoConDibujo extends JFrame{
	
	public marcoConDibujo() {
		
		setTitle("Prueba de dibujo");
		setSize(400,300);
		
		laminaConFiguras lamina1=new laminaConFiguras();
		add(lamina1);
		 		
	}
}

class laminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawRect(110, 50, 150, 150);
		//g.drawLine(110, 50, 260,200 );
		//g.drawArc(110, 50, 150, 150, 50,360);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo1=new Rectangle2D.Double(80,50,200,150);
		g2.draw(rectangulo1);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo1);
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(80,50,280,200));
		
		double centroX=rectangulo1.getCenterX();
		double centroY=rectangulo1.getCenterY();
		double radio=125;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);
		
	}
	
}