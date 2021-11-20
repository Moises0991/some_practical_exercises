
import java.util.*;
public class Uso_tallas {
	
	//enum tallas{mini,mediano,grande,muy_grande}
	
	enum talla{
		
		MINI("s"),MEDIANO("m"),GRANDE("l"),MUY_GRANDE("xl");
		
		private talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura(){
			
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		talla la_talla=Enum.valueOf(talla.class,entrada_datos);
		
		System.out.println("La talla: "+la_talla);
		
		System.out.println("Abreviatura: "+la_talla.dameAbreviatura());
	}

}
