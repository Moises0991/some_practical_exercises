package visualizations;
import java.util.Scanner;

public class Exercise {

	
	public static void main(String[] args) {

		int count = 1;
		boolean response = true;
		
		System.out.print("Listado de numeros: ");
		
		
		do {
			
			//impresion de grupo de numeros
			for (int i =0; i<20;i++) {

				if(i==19) {
					System.out.print(count);
				} else {
					System.out.print(count+", ");
				}
				count++;
			}

			response = false;

			
			do {

				System.out.println("\n\nDeseas visualizar el siguiente grupo? (S/N)");
				Scanner input = new Scanner(System.in);
				String chain = input.nextLine();

				if (chain.equals("S") || chain.equals("s")) {
					response = true;
				} else if(chain.equals("N") || chain.equals("n")){
					System.out.println("Fin del listado");
					break;
				} else {
					System.out.println("Ingresa 'S' o 'n'");
					response = false;
				}
					
				} while(response==false);
			
			
		} while(count<=1000 && response);
		
	}

}
