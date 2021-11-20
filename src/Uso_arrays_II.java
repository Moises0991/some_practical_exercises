
public class Uso_arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros= new int[150];
		
		for(int i=0;i<numeros.length;i++) {
			
			numeros[i]=(int)Math.round(Math.random()*100);		
		}
		
		for(int numeros_imp:numeros) {
			
			System.out.print(numeros_imp+" ");
			
		}
		 
	}

}



