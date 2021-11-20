package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoFoco marco1=new marcoFoco();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class marcoFoco extends JFrame{
	
	public marcoFoco() {
		
		setBounds(480,250,400,250);
		setTitle("Marco 1");
		setVisible(true);
		add(new laminaFoco());
	}
}

class laminaFoco extends JPanel{	
	
	JTextField cuadro1,cuadro2;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		cuadro1.setBounds(100, 50, 200, 20);
		cuadro2.setBounds(100, 80, 200, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		focos foco=new focos();
		
		cuadro1.addFocusListener(foco);
		
	}
	
	private class focos implements FocusListener{

		
		public void focusGained(FocusEvent e) {
			
			
			
		}

		public void focusLost(FocusEvent e) {
			
			String email=cuadro1.getText();
			
			boolean comprobacion=false;
			
			for(int i=0;i<=email.length()-1;i++) {
				
				if(email.charAt(i)=='@') {
					
					comprobacion=true;
					
				}
			}
			
			if(comprobacion) {
				
				System.out.println("Es correcto");
				
			}else {
				
				System.out.println("Es incorrecto no contiene @");
				
			}
			
		}	
	}
}


