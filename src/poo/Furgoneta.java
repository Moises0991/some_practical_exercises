package poo;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra,int capacidad_carga){
	
		super();	//llamar al constructor de la clase
	
		this.plazas_extra=plazas_extra;
		this.capacidad_carga=capacidad_carga;
		
	}
	
	public String dimeDatosFugoneta() {
		
		return "La capacidad de carga de la furgoneta es: "+ capacidad_carga+ " y las plazas son: "+plazas_extra;
	}

}
