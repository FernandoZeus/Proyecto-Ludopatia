package FZO327Ejercicio2;

public class Arma_Defensa extends Arma {
	
	boolean Fallo;
	
	private int Daño_Aguante;
	
	private int Daño_Recibido = Arma_Defensa () - Daño;
	
	
	public Arma_Defensa (String Nombre , int Daño , int Porcentaje) {
		
		super (Nombre , Daño , Porcentaje  );
		
	}
	
	public int ObtenerDaño() {
		
		return Daño;
		
	}
	
	public int obtenerDaño() {
		
		return Daño;
	
	}
	
	public int Arma_Defensa () {
		
		return Daño_Aguante;
		
	}
	
	public int Efectividad_Defensa ( int Daño) {
		
		return Daño_Recibido;
		
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
