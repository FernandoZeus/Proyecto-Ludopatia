package FZO327Ejercicio2;

abstract class Arma {

     String Nombre;
	
	protected int Daño;
	
	boolean Fallo;
	
	protected int Porcentaje;
	
	
	Arma [] Ataques= new Arma_Ataque[3];
	
	//Ataques [0]= new Arma_Ataque ("hola",20,2);
	
	Arma [] Defensas = new Arma_Defensa[3];
	
	
	abstract public int ObtenerDaño();
	
	public Arma (String Nombre ,int Daño , int Porcentaje) {
		
		this.Nombre = Nombre ;
		
		this.Daño = Daño;
		
		this.Porcentaje = Porcentaje;
		
	}
	
	public abstract  boolean PosibilidadFallo();
		
	
}
