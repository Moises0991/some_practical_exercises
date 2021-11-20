package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplesOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPrincipal marco1=new MarcoPrincipal();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal() {
		
		setTitle("Multiples Oyentes");
		setBounds(450,200,500,300);
		
		PanelPrincipal panel1=new PanelPrincipal();
		add(panel1);
		
	}
}

class PanelPrincipal extends JPanel{
	
	JButton boton_nuevo=new JButton("Nuevo");
	JButton boton_cerrar=new JButton("Cerrar todo");
	
	public PanelPrincipal() {
		
		add(boton_nuevo);
		add(boton_cerrar);
		
		NuevoOyente oyente=new NuevoOyente();
		boton_nuevo.addActionListener(oyente);
				
	}
	
	private class NuevoOyente implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			MarcoEmergente nuevoMarco=new MarcoEmergente(boton_cerrar);
			nuevoMarco.setVisible(true);
		}		
	}
}

class MarcoEmergente extends JFrame {
	
	private static int contador=0;
	
	public MarcoEmergente(JButton botonPrincipal) {
		
		contador++;
		setTitle("Ventana "+contador);
		setBounds(40*contador,40*contador,250,180);
		
		CerrarTodo oyenteCerrar=new CerrarTodo();
		
		botonPrincipal.addActionListener(oyenteCerrar);
	}
	
	private class CerrarTodo implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
		}
	}
	
}
