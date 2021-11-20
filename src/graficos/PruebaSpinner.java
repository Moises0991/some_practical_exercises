package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoSpinner marco1=new MarcoSpinner();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoSpinner extends JFrame{
	
	public MarcoSpinner() {
		
		setTitle("Prueba Spinner");
		setBounds(480,200,400,300);
		
		LaminaSpinner lamina1=new LaminaSpinner();
		add(lamina1);
	}
}

class LaminaSpinner extends JPanel{
	
	//String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	//JSpinner control=new JSpinner(new SpinnerListModel(lista));
	JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
		
		public Object getNextValue() {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
		
	});
	public LaminaSpinner() {
		
		control.setPreferredSize(new Dimension(200,20));		
		add(control);
		
	}
	
	/*
	private class ModeloSpinner extends SpinnerNumberModel{
		
		public ModeloSpinner() {
			
			super(5,0,10,1);
		}
		
		public Object getNextValue() {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
	}*/
}
