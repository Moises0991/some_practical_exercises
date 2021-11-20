package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] mis_empleados= new Empleado[6];
		
		Jefatura JEFE_RRHH = new Jefatura("Moises Soler Zetina", 50000,2025,11,10);
		
		JEFE_RRHH.establece_incentivo(2500);
		
		mis_empleados[0]=new Empleado("Moises Soler",30000,2030,01,01);
		mis_empleados[1]=new Empleado("Noe Benjamin",32000,2035,11,01);
		mis_empleados[2]=new Empleado("Esther Soler",35000,2037,12,01);
		mis_empleados[3]=new Empleado("Jorge Casanova");
		mis_empleados[4]=JEFE_RRHH;	//POLIMORFISMO EN ACCION. PRINCNIPIO DE SUSTITUCION La instanciacion esta en la parte de arriba
		mis_empleados[5]=new Jefatura("Maria de todos los angeles",45000,2000,11,1);	//Se aplica el polimorfismo y la instanciacion en una sola linea
		Jefatura Jefa_finanzas=(Jefatura) mis_empleados[5];
		Jefa_finanzas.establece_incentivo(5000);	
		
		System.out.println(Jefa_finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe "+Jefa_finanzas.dame_nombre()+" tiene un bonus de: "+Jefa_finanzas.establece_bonus(500));
		
		System.out.println("El empleado "+mis_empleados[3].dame_nombre()+"tiene un bonus de: "+mis_empleados[3].establece_bonus(200));
		
		for(Empleado e: mis_empleados) {
			
			e.sube_sueldo(5);
			
		}
		
		Arrays.sort(mis_empleados);
		
		for(Empleado e: mis_empleados) {
			
			System.out.println("Nombre: "+e.dame_nombre()+" Sueldo: "+e.dame_sueldo()+
					" Fecha de alta: "+e.dame_fecha_contrato());
			
		}
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(anio,mes-1,dia);
		alta_contrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return gratificacion+Trabajadores.bonus_base;
		
	}
	
	public Empleado(String nom) {
		
		this(nom,3000,2000,01,01);	//En esta linea se llama al otro constructor
		
	}
	
	public String dame_nombre() {	//getter
		
		return nombre;
		
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
	
public int compareTo(Object miobjeto) {
		
		Empleado otroEmpleado= (Empleado) miobjeto;
		
		if(this.Id<otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			
			return 1;
		}
		
		return 0;
		
	} 
	
	private String nombre;
	private double sueldo;
	private Date alta_contrato;
	private static int IdSiguiente;
	private int Id;
	
} 

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia){ //constructor
		
		super(nom,sue,anio,mes,dia);
		
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la direccion a tomado la decision de: "+decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return prima+gratificacion+Trabajadores.bonus_base;
	}
	
	private double incentivo;
	
	public void establece_incentivo(double b) {
		
		incentivo=b;
	}
	
	public double dame_sueldo() {
		
		double sueldo_jefe=super.dame_sueldo();	//Aqui se hace referencia a dame_sueldo de la superclase
		
		return sueldo_jefe+incentivo;
		
	}
	
}
