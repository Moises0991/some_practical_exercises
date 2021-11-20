package poo;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj=new Reloj();
		
		miReloj.enMarcha(2000,true);
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		
		System.exit(0);
			
	}

}

class Reloj{
	
	
	public void enMarcha(int intervalo,final boolean sonido) {
		
		class dame_hora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				Date ahora=new Date();
				
				System.out.println("La hora es: "+ahora);
				
				if(sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		
		ActionListener oyente=new dame_hora2();
		
		Timer mi_temporizador=new Timer(intervalo,oyente);
		
		mi_temporizador.start();
	}	
}
