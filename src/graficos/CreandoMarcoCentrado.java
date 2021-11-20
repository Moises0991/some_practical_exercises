package graficos;

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;


public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marco_centrado marco1=new marco_centrado();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marco_centrado extends JFrame{
	
	public marco_centrado() {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		
		Dimension pantalla=miPantalla.getScreenSize();
		
		int altura=pantalla.height;
		int ancho=pantalla.width;
		
		setSize(ancho/2,altura/2);
		setLocation(ancho/4,altura/4);
		
		setTitle("Ventana centrada");
		
		Image miIcono=miPantalla.getImage("src/graficos/icono.jpg");
		
		setIconImage(miIcono);
		
	}
}
