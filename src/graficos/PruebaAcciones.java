package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco1=new MarcoAccion();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion(){
		
		setTitle("Prueba acciones");
		setBounds(480,250,400,250);
		
		PanelAccion panel1=new PanelAccion();
		add(panel1);
		
	}
}

class PanelAccion extends JPanel{
	
	
	
	public PanelAccion() {
		
		AccionColor accionRojo=new AccionColor("Rojo",new ImageIcon("src/graficos/rojo.png"),Color.RED);
		AccionColor accionVerde=new AccionColor("Verde",new ImageIcon("src/graficos/verde.png"),Color.GREEN);
		AccionColor accionAzul=new AccionColor("Azul",new ImageIcon("src/graficos/azul.png"),Color.BLUE);
		
		add(new JButton(accionRojo));
		add(new JButton(accionVerde));
		add(new JButton(accionAzul));
		
		
		InputMap mapaEntrada= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);	
		//KeyStroke teclaRoja= KeyStroke.getKeyStroke("ctrl R");	//se crea la combinacion de teclas segun lo establecido en la api
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondoRojo");	
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl G"),"fondoVerde");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl V"),"fondoVerde");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondoAzul");	
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondoAzul");
		
		ActionMap mapaAccion= getActionMap();	
		
		mapaAccion.put("fondoRojo", accionRojo);	
		mapaAccion.put("fondoVerde", accionVerde);	
		mapaAccion.put("fondoAzul", accionAzul);	
		
		
	}
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre,Icon icono,Color color_boton) {
			
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,icono);
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+nombre);
			putValue("ColorDeFondo",color_boton);
			
		}

		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color)getValue("ColorDeFondo");
			
			setBackground(c);
			
			System.out.println("Nombre: "+ getValue(Action.NAME)+"\nDescripcion: "+ getValue(Action.SHORT_DESCRIPTION));
			
		}
	}
}