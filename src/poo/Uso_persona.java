package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas= new Persona[2];
		
		lasPersonas[0]= new Empleado2("Jose Romero",30000,2009,01,18);
		lasPersonas[1]= new Alumno("Patricia Julieta","Biologia");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.dame_nombre()+", "+p.dameDescripcion());
		}

	}

}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String dame_nombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
	
	public Empleado2 (String nom, double sue, int anio, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(anio,mes-1,dia);
		alta_contrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}

	public String dameDescripcion() {
		
		return "Este empleado tiene un Id= "+Id +" con un sueldo= "+sueldo;
	}
	
	public double dame_sueldo() {	//getter
		
		return sueldo;
		
	}
	
	public Date dame_fecha_contrato() {	//getter
		
		return alta_contrato; 
		
	}
	
	public void sube_sueldo(double porcentaje) {	//setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	private double sueldo;
	private Date alta_contrato;
	private static int IdSiguiente;
	private int Id;
	
} 


class Alumno extends Persona{
	
	private String carrera;
	public Alumno(String nom,String car) {
		
		super(nom);
		 
		carrera=car;
		 
	}
	
	public String dameDescripcion(){
		
		return "Este alumno esta estudiando la carrera de "+carrera;
		
	}
	
	
}
