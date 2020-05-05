package FZO323Ejercicio1;
public class Batallón extends UnidadArmada {

	final String TIPO = "Batallón";
	
	boolean ToF = true;
	
	int aleatorio;
	
	public String obtenerTipo(){
		
		return TIPO;
		
	}
	
	public boolean ataqueEfectivo(){
		
		aleatorio = (int) (Math.random() * 99 + 1);
		
		if( (aleatorio  % 3 == 0 )){
			
			return ToF;
		
		}else{
			
			ToF = false;
			
			return ToF;
			
		}
	
	}
	public Batallón(){
		
		vida=80;
		daño=20;
	
	}
}