package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameRadio marco1=new FrameRadio();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameRadio extends JFrame{
	
	public FrameRadio() {
		
		setTitle("Ejemplo RadioButton");
		setBounds(480,200,400,300);
		
		PanelRadio lamina1=new PanelRadio();
		add(lamina1);		
		
	}
}

class PanelRadio extends JPanel{
	
	JPanel panel2=new JPanel();
	ButtonGroup grupo=new ButtonGroup();
	JLabel texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
	

	public PanelRadio() {
		
		setLayout(new BorderLayout());
		texto.setFont(new Font("serif",Font.PLAIN,14));
		
		colocarBotones("Chico",false,10);
		colocarBotones("Mediano",true,14);
		colocarBotones("Grande",false,16);
		colocarBotones("Muy Grande",false,20);
		
		add(texto,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
	
	}
	
	public void colocarBotones(String nombre,Boolean seleccionado,final int tamano) {
		
		JRadioButton boton=new JRadioButton(nombre,seleccionado);
		grupo.add(boton);
		panel2.add(boton);
		
		ActionListener eventoRadio=new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("serif",Font.PLAIN,tamano));
			}	
		};
		
		boton.addActionListener(eventoRadio);
	}
}