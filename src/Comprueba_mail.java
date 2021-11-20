import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		boolean punto=false;
		
		String email=JOptionPane.showInputDialog("Introduce el correo, por favor");
		
		 for(int i=0;i<email.length();i++) {
			 
			 if(email.charAt(i)=='@') {
				 
				 arroba++;
				 
			 }
			 
			 if(email.charAt(i)=='.') {
				 
				 punto=true;
			 }
			 
		 }
		
		 
		 if(arroba==1 && punto==true) {
			 
			 System.out.println("Correo correccto");
		 
		 }else{
			 
			 System.out.println("Correo incorrecto");
			 
		 }
	}

}
