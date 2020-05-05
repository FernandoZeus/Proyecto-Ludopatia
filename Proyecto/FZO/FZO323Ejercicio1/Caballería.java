package FZO323Ejercicio1;
public class Caballería extends UnidadArmada {

	final String TIPO = "Caballería";
	
	boolean ToF = true;
	
	int numero1;
	
	int numero2;
	
	
	public String obtenerTipo(){
		
		return TIPO;
		
	}
	
	public boolean ataqueEfectivo(){
		
		numero1 = (int) Math.floor(Math.random() * 9 + 1);
		
		numero2 = (int) Math.floor(Math.random() * 9 + 1);
		
		if ( (numero1 < numero2) ){
		
			return ToF ;
		
		}else {
			
			ToF = false;
			
			return ToF;
			
		}
		
	
	}
	public Caballería(){
		
		vida=120;
		daño=50;
	
	}
}