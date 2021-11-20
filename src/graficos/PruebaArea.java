package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PruebaArea {

	public static void main(String[] args) {

		Ventana ventana1=new Ventana();
		ventana1.setVisible(true);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Ventana extends JFrame{
	
	private JPanel panel=new JPanel();
	private JButton insertar=new JButton("Insertar");
	private JButton saltoDeLinea=new JButton("Salto de linea");
	private JTextArea areaTexto=new JTextArea(10,20);
	private JScrollPane barras=new JScrollPane(areaTexto);
	
	public Ventana() {
		
		setTitle("Probando Areas de Texto");
		setBounds(480,250,400,300);
		
		setLayout(new BorderLayout());

		
		insertar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un lugar de la mancha cuyo nombre no quiero mencionar.......");
			}
			
			
		});
		
		panel.add(insertar);
		
		saltoDeLinea.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar=!areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				saltoDeLinea.setText(saltar?"Quitar Salto":"Salto Linea");
				
			}
		});
		
		panel.add(saltoDeLinea);		
		add(panel,BorderLayout.SOUTH);
		add(barras,BorderLayout.CENTER);
		
	}
}
