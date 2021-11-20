
public class Arrrays_bidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix= {
				
				{50,51,52,53,54},
				{55,56,57,58,59},
				{60,61,62,63,64},
				{65,66,67,68,69}				
						
		};
		
		
		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z+" ");
				
			}
		}
	}

}
