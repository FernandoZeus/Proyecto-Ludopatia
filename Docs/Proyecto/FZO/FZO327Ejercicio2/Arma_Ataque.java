package FZO327Ejercicio2;

	 

public class Arma_Ataque extends Arma {

	Arma_Ataque [] ataque = new Arma_Ataque[3];
	
	
	//ataque [0] = new Arma_Ataque("hola",20,10);
	
	public Arma_Ataque (String Nombre ,int Daño , int Porcentaje ) {
		
		super (Nombre , Daño , Porcentaje );
		
	}
	
	public int ObtenerDaño() {
		
		return Daño;
		
	}
	
	public boolean PosibilidadFallo() {
		
		int Fallo = (int) Math.random()*101 +1 ;
		
		if( (Fallo <= Porcentaje ) ) {
			
			return false ; 
		
		}else {
			
			return true ;
		
		}
		
		
	}
	
	
	
	
	
	
}
