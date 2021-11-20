package graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoPrueba marco=new marcoPrueba();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoPrueba extends JFrame{
	
	public marcoPrueba() {
		
		setTitle("Eventos de Campo");
		setBounds(480,200,400,300);
		
		laminaPrueba lamina=new laminaPrueba();
		add(lamina);
		
	}
}

class laminaPrueba extends JPanel{
	
	JTextField campo=new JTextField(10);
	Document documento;
	
	public laminaPrueba() {
		
		add(campo);
		documento=campo.getDocument();
		
		escuchaTexto oyenteTexto=new escuchaTexto();
		
		documento.addDocumentListener(oyenteTexto);
		
	}
	
	private class escuchaTexto implements DocumentListener{

		public void insertUpdate(DocumentEvent e) {
			
			System.out.println("Has insertado Texto");
		}

		public void removeUpdate(DocumentEvent e) {
			
			System.out.println("Has eliminado Texto");
		}

		public void changedUpdate(DocumentEvent e) {
		}
		
	}
}
