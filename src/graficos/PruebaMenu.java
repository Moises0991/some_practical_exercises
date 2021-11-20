package graficos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PruebaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoMenu marco=new MarcoMenu();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

	}
}

class MarcoMenu extends JFrame{
	
	public MarcoMenu() {
		
		super("Prueba Menus");
		setBounds(480,200,450,300);
		
		LaminaMenu lamina1=new LaminaMenu();
		add(lamina1);		
	}
}

class LaminaMenu extends JPanel{
	
	JMenuBar barra=new JMenuBar();
	JMenu archivo=new JMenu("Archivo");
	JMenu edicion=new JMenu("Edicion");
	JMenu opciones=new JMenu("Opciones");
	JMenu herramientas=new JMenu("Herramientas");
	
	JMenuItem guardar=new JMenuItem("Guardar");
	JMenuItem guardar_como=new JMenuItem("Guardar Como");
	JMenuItem cortar=new JMenuItem("Cortar");
	JMenuItem copiar=new JMenuItem("Copiar");
	JMenuItem pegar=new JMenuItem("Pegar");
	JMenuItem opcion1=new JMenuItem("Opcion 1");
	JMenuItem opcion2=new JMenuItem("Opcion 2");
	JMenuItem generales=new JMenuItem("Generales");
	
	public LaminaMenu() {
		
		barra.add(archivo);
		barra.add(edicion);
		barra.add(herramientas);
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		archivo.add(guardar);
		archivo.add(guardar_como);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator(); 
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		
		add(barra);
	}
}
