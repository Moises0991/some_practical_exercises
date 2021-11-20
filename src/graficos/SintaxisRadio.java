package graficos;

import javax.swing.*;

public class SintaxisRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRadio marco1=new MarcoRadio();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		
		setTitle("Marco Radio Button");
		setBounds(480,200,250,150);
		
		LaminaRadio lamina1=new LaminaRadio();
		add(lamina1);		
		
	}
}

class LaminaRadio extends JPanel{
	
	JRadioButton boton1=new JRadioButton("Rojo",false);
	JRadioButton boton2=new JRadioButton("Verde",true);
	JRadioButton boton3=new JRadioButton("Azul",false);
	JRadioButton boton4=new JRadioButton("Masculino",false);
	JRadioButton boton5=new JRadioButton("Femenino",false);
	ButtonGroup grupo1=new ButtonGroup();
	ButtonGroup grupo2=new ButtonGroup();

	public LaminaRadio() {
			
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		grupo2.add(boton4);
		grupo2.add(boton5);
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
	}
}