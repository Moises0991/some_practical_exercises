package graficos;

import java.awt.Frame;

import javax.swing.*;

public class Creando_marcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1= new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300);
		//setLocation(450,200);
		
		setBounds(450,200,500,300);
		
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Este es el titulo");
		
	}
}
