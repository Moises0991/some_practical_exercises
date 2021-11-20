import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");

		String edad=JOptionPane.showInputDialog("Introduce tu edad por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.printf("Hola %s. El año que viene tendras %s años",nombre_usuario,edad_usuario+1);
	}

}
