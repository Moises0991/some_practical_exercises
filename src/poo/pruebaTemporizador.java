package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class pruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dame_hora oyente=new dame_hora();
		
		Timer mi_temporizador=new Timer(5000,oyente);
		
		mi_temporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa para detener");
		
		System.exit(0);
		
	}

}

class dame_hora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora= new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos: "+ ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
}
