package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CambiosJSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameSlider marco1=new FrameSlider();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSlider extends JFrame{
	
	public FrameSlider() {
		
		setTitle("Prueba Sliders");
		setBounds(480,200,400,300);
		
		PanelSlider lamina1=new PanelSlider();
		add(lamina1);
	}
}

class PanelSlider extends JPanel{
	
	JLabel texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
	JPanel superior=new JPanel();
	JSlider control=new JSlider(8,50,12);
	
	public PanelSlider() {
		
		setLayout(new BorderLayout());
		
		add(texto,BorderLayout.CENTER);
		
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setValue(12);
		control.setPaintLabels(true);
		control.setPaintTicks(true);
		control.setSnapToTicks(true);
		control.setFont(new Font("Arial",Font.ITALIC,12));
		
		control.addChangeListener(new EventoSlider());
		
		superior.add(control);
		add(superior,BorderLayout.NORTH);	
	}
	
	private class EventoSlider implements ChangeListener{

		public void stateChanged(ChangeEvent e) {
			
			texto.setFont(new Font("Arial",Font.ITALIC,control.getValue()));
		}
	}
}
