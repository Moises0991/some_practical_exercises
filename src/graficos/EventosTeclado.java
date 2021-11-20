package graficos;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoConTeclas marco1=new marcoConTeclas();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class marcoConTeclas extends JFrame{
	
	public marcoConTeclas() {
		
		setTitle("Marco con Teclas");
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension pantalla=mipantalla.getScreenSize();
		int alto=pantalla.height;
		int ancho=(int) pantalla.width;
		setBounds(ancho/4,alto/4,ancho/2,alto/2);
		
		eventoDeTeclado evento=new eventoDeTeclado();
		addKeyListener(evento);
	}
	
}

class eventoDeTeclado implements KeyListener{

	
	public void keyTyped(KeyEvent e) {
		
		char letra=e.getKeyChar();
		
		System.out.println(letra);
		
	}

	
	public void keyPressed(KeyEvent e) {
		
		int codigo=e.getKeyCode();
		
		System.out.println(codigo);
		
	}

	
	public void keyReleased(KeyEvent e) {

	}
	
	
	
}