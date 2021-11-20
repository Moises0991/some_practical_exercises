package graficos;

import java.awt.*;
import javax.swing.*;

public class Layouts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoLayout marco1=new MarcoLayout();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		
		setTitle("Layouts");
		setBounds(450,200,500,300);
		
		PanelLayout1 panel1=new PanelLayout1();
		PanelLayout2 panel2=new PanelLayout2();
		
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		
	}
}

class PanelLayout1 extends JPanel{
	
	public PanelLayout1(){
		
		//setLayout(new FlowLayout(FlowLayout.LEFT,75,100));
		
		//setLayout(new BorderLayout());
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Rojo"));
		add(new JButton("Verde"));
		
	}
}

class PanelLayout2 extends JPanel{
	
	public PanelLayout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Amarillo"),BorderLayout.EAST);
		add(new JButton("Negro"));
		
	}
}
