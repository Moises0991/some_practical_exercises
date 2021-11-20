package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CampoPassword {
	
	public static void main(String[] args ) {
		
		MarcoPassword marco=new MarcoPassword();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		
		setTitle("Validacion de Usuario");
		setBounds(450,200,400,300);
		
		LaminaPassword lamina=new LaminaPassword();
		add(lamina);
	}
}

class LaminaPassword extends JPanel{
	
	JPanel panelSuperior=new JPanel();
	JLabel usuario=new JLabel("Usuario");
	JLabel password=new JLabel("Password");
	JTextField campoUsuario=new JTextField(10);
	JPasswordField campoPassword=new JPasswordField(10);
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		panelSuperior.setLayout(new GridLayout(2,2));
		
		panelSuperior.add(usuario);
		panelSuperior.add(campoUsuario);
		panelSuperior.add(password);
		panelSuperior.add(campoPassword);
		add(panelSuperior,BorderLayout.NORTH);
		
		add(new JButton("Enviar"),BorderLayout.SOUTH);	
		
		Document documento=campoPassword.getDocument();
		
		documento.addDocumentListener(new CompruebaPass());
		
	}
	
	class CompruebaPass implements DocumentListener{

	
		public void insertUpdate(DocumentEvent e) {
			
			
			char[] pass=campoPassword.getPassword();
			
			if(pass.length<5||pass.length>10) {
				
				campoPassword.setBackground(Color.RED);
				
			}else {
				
				campoPassword.setBackground(Color.WHITE);
			}
			
		}

		
		public void removeUpdate(DocumentEvent e) {
			
			char[] pass=campoPassword.getPassword();
			
			if(pass.length<5||pass.length>10) {
				
				campoPassword.setBackground(Color.RED);
				
			}else {
				
				campoPassword.setBackground(Color.WHITE);
			}
		}

		
		public void changedUpdate(DocumentEvent e) {
			
			
		}
		
		
	}
}
