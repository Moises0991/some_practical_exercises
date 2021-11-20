package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoSlider marco1=new MarcoSlider();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoSlider extends JFrame{
	
	public MarcoSlider() {
		
		setTitle("Prueba Sliders");
		setBounds(480,200,400,300);
		
		LaminaSlider lamina1=new LaminaSlider();
		add(lamina1);
	}
}

class LaminaSlider extends JPanel{
	
	JSlider control=new JSlider();
	
	public LaminaSlider() {
		
		control.setMinorTickSpacing(25);
		control.setMajorTickSpacing(50);
		control.setSnapToTicks(true);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Arial",Font.ITALIC,12));
		add(control);
		
	}
}
