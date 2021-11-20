package graficos;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class pruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoConImagenes marco1= new marcoConImagenes();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

	}

}

class marcoConImagenes extends JFrame{
	
	public marcoConImagenes() {
		
		setTitle("Marco con Imagenes");
		setBounds(450,250,300,300);
		
		laminaConImagenes lamina1=new laminaConImagenes();
		add(lamina1);
		
		
	}
}

class laminaConImagenes extends JPanel{
	
	
	public laminaConImagenes(){
		
		try {
			
			imagen=ImageIO.read(new File("src/graficos/pelota.png"));
			
		}catch(IOException e) {
			
			JOptionPane.showMessageDialog(null, "No se ha podido encontrar la imagen");
			
		}
	}
	
	private Image imagen;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		//File miImagen= new File("src/graficos/sin_fondo1.png");
		
		int anchuraImagen=imagen.getHeight(this);
		int alturaImagen=imagen.getWidth(this);
		
		g2.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<300;i++) {
			
			for(int j=0;j<200;j++) {
				
				if(i+j>0) {
					
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				}
			}
		}
	}
}
