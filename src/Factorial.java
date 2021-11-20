import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long resultado=1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		
		for(int i=numero;i>0;i--) {
			
			
			resultado*=i;
			
		}
		
		System.out.println("El factorial de "+numero+" es "+resultado);
		
	}

}
