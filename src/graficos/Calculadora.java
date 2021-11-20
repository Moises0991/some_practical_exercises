package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora marco1=new MarcoCalculadora();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		setBounds(450,200,500,300);
		
		PanelCalculadora panel1=new PanelCalculadora();
		add(panel1);
		//pack();
	}	
	
}

class PanelCalculadora extends JPanel{
	
	JPanel panel2= new JPanel();
	JButton pantalla=new JButton("0");
	private boolean inicio=true;
	private String ultimaOperacion;
	private double resultado;
	
	public PanelCalculadora() {
		
		setLayout(new BorderLayout());
		
		pantalla.setEnabled(false);
		
		add(pantalla,BorderLayout.NORTH);
		
		panel2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar=new InsertaNumero();
		ActionListener operacion=new Operaciones();
		
		agregarBoton("7",insertar);
		agregarBoton("8",insertar);
		agregarBoton("9",insertar);
		agregarBoton("/",operacion);
		
		agregarBoton("4",insertar);
		agregarBoton("5",insertar);
		agregarBoton("6",insertar);
		agregarBoton("*",operacion);
		
		agregarBoton("1",insertar);
		agregarBoton("2",insertar);
		agregarBoton("3",insertar);
		agregarBoton("-",operacion);
		
		agregarBoton("0",insertar);
		agregarBoton(".",insertar);
		agregarBoton("=",operacion);
		agregarBoton("+",operacion);
		
		add(panel2,BorderLayout.CENTER);
		
		ultimaOperacion="=";
		
	}
	
	public void agregarBoton(String rotulo,ActionListener oyente) {
		
		JButton boton=new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		panel2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			String entrada=e.getActionCommand();
			
			if(inicio) {
				
				pantalla.setText("");
				
				inicio=false;
			}
			
			pantalla.setText(pantalla.getText()+entrada);
			
		}
	}
	
	private class Operaciones implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String operacion=e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			
			inicio=true;
			
		}
		
		public void calcular(Double x) {
			
			if(ultimaOperacion.equalsIgnoreCase("+")) {
				
				resultado+=x;
				
			}else if(ultimaOperacion.equalsIgnoreCase("-")) {
				
				resultado-=x;
				
			}else if(ultimaOperacion.equalsIgnoreCase("*")) {
				
				resultado*=x;
				
			}else if(ultimaOperacion.equalsIgnoreCase("/")) {
				
				resultado/=x;
				
			}else if(ultimaOperacion.equalsIgnoreCase("=")) {
				
				resultado=x;
			}
			
			pantalla.setText(""+resultado);
			
		}
	}
}
