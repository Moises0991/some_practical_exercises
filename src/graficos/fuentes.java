package graficos;

import java.awt.GraphicsEnvironment;

public class fuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombre:fonts) {
			
			System.out.println(nombre);
		}

	}

}
