package graficos;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.*;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoRaton marco1=new marcoRaton();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}

}

class marcoRaton extends JFrame{
	
	public marcoRaton() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension pantalla=mipantalla.getScreenSize();
		int alto=pantalla.height;
		int ancho=pantalla.width;
		setBounds(ancho/4,alto/4,ancho/2,alto/2);
		
		eventosDeRaton eventoRaton=new eventosDeRaton();
		addMouseMotionListener(eventoRaton);
		
		
	}
}


/*
class eventosDeRaton extends MouseAdapter{
	
		
	public void mouseClicked(MouseEvent e) {

		System.out.println("Coordenada x: "+e.getX()+" Coordenada y: "+e.getY());
		System.out.println(e.getClickCount());
		
	}
	
	public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("Se ha pulsado el boton izquierdo");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Se ha pulsado la rueda del raton");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Se ha pulsado el boton derecho");
			
		}
	}
	
	
	
	
	
}
*/

class eventosDeRaton implements MouseMotionListener{

	
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estas arrastrando");
		
	}

	
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Estas moviendo el raton");
	}	
}
