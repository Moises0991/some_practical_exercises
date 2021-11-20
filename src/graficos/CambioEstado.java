package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoEstado marco1=new marcoEstado();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class marcoEstado extends JFrame{
	
	public marcoEstado() {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension pantalla=miPantalla.getScreenSize();
		
		int alto=pantalla.height;
		int ancho=pantalla.width;
		
		setBounds(ancho/4,alto/4,ancho/2,alto/2);		
		setTitle("Cambio Estado");
		setVisible(true);
		
		cambioDeEstado estado=new cambioDeEstado();
		addWindowStateListener(estado);
		
		
	}
}

class cambioDeEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado");

		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana se ha maximizado");
			
		}else if(e.getNewState()==Frame.NORMAL) {
			
			System.out.println("La ventana esta en estado normal");
			
		}else if(e.getNewState()==Frame.ICONIFIED) {
			
			System.out.println("La ventana esta minimizada");
		}
		
	}
}