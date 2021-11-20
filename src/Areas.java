import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo\n");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
			
			System.out.printf("El area del cuadrado es %.2f ", Math.pow(lado, 2));
			
			break;
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base, por favor"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura por favor"));
			
			System.out.println("El area del rectangulo es: "+ base*altura);
			
			break;
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base, por favor"));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura, por favor:"));
			
			System.out.println("EL area del triangulo es:"+(base*altura)/2);
			
			break;
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio, por favor:"));
			
			System.out.printf("El area del circulo es %.2f", Math.PI*Math.pow(radio, 2));
			
			break;
			
		default:
			
			System.out.printf("la opcion no es correcta");
			
			break;
			
		}

	}

}