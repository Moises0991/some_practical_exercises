package graficos;

import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoVentana marco1=new marcoVentana();
		marcoVentana marco2=new marcoVentana();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setTitle("Marco 1");
		marco1.setBounds(200,200,350,250);
		marco1.setVisible(true);
		
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco2.setTitle("Marco 2");
		marco2.setBounds(200+350,200,350,250);
		marco2.setVisible(true);

	}

}

class marcoVentana extends JFrame{
	
	public marcoVentana() {
		
		/*setTitle("Respondiendo");
		setBounds(500,200,350,250);
		setVisible(true);
		*/
		
		/*accionesVentana oyente=new accionesVentana();
		addWindowListener(oyente);}*/
		
		addWindowListener(new accionesVentana());
		
	}
	
	
}

class accionesVentana extends WindowAdapter{
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}	
}