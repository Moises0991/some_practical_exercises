import javax.swing.*;


public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero1=JOptionPane.showInputDialog("Introduce un numero, por favor");
		
		double numero2=Double.parseDouble(numero1);
		
		System.out.printf("La raiz de %.2f es %.4f ",numero2,Math.sqrt(numero2));
		
		
	}
}
